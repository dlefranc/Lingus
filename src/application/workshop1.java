package application;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class workshop1 extends windowWorkshop{
	private Integer nbRound;
	private Integer aleaQuest;
	private Integer aleaRep;
	private Integer nbFait;
	
	private String[] tabFait;
	
	private String tabExe[][]= {{"The invention of the steam ", "motor", "engine", "device", "box", "engine", " was an industrial revolution."},
								{"Although their car had ", "order", "broken down", "broken in", "broken out", "broken down", " on a main road, no one stopped."},
								{"There were not many trains ", "running", "working", "linking", "passing", "running", " between the two cities."},
								{"In new companies, accounts are now ", "processed", "treated", "plugged", "viewed", "processed", " by computer."},
								{"", "Pipes", "Drills", "Cranes", "Computers", "Cranes", " will be used for moving heavy machinery."},
								{"Are you sure the printer is ", "engaged", "connected", "linked", "broken", "connected", " properly ?"},
								{"I decided to become a scientist after i ", "seed", "saw", "have seen", "sound", "saw", " a movie."},
								{"The country's railway ", "network", "pattern", "scheme", "bus", "network", " has been in need of modernization."},
								{"All new cars have to be ", "built-in", "installed", "fitted", "inserted", "fitted", " with safety belts at the back."},
								{"The first ", "experimentation", "experience", "experiment", "explanation", "experiment", " of this kind was carried out in California."}
								};

	Random rand = new Random();
	
	
	@FXML
	private ProgressBar progBar;
	
	@FXML
	private Button rep1,rep2,rep3,rep4;
	@FXML Label quest;
	
	@FXML
	private Button next;
	@FXML
	private Button pass;

	
	public String[] tabAlea() {
		Integer i = 0;
		String[] tabTmp = new String[7];
		String[] tabRep = new String[4];
		
		Integer slotRep = 0;
		Integer countVerif;


		countVerif = 0;
		aleaQuest = rand.nextInt(10);
		
		while(countVerif < 5) {
			if(tabExe[aleaQuest][0] != tabFait[countVerif]) {
				countVerif++;
			}
			else {
				aleaQuest = rand.nextInt(10);						
				countVerif = 0;
			}
		}
		
		
		tabFait[nbFait]=tabExe[aleaQuest][0];
		nbFait++;
		
		
			
		while(slotRep < 4) {
			countVerif=0;
			aleaRep = rand.nextInt(4) + 1;
				while(countVerif < slotRep) {	
					if(tabExe[aleaQuest][aleaRep] != tabRep[countVerif]) {
						countVerif++;
					}
					else {
						aleaRep = rand.nextInt(4) + 1;						
						countVerif = 0;
					}
				}
				tabRep[countVerif] = tabExe[aleaQuest][aleaRep];		
			slotRep++;
		}
		
		tabTmp[0]=tabExe[aleaQuest][0];
		while (i<4) {
			tabTmp[i+1] = tabRep[i];
			i++;
		}
		tabTmp[5]=tabExe[aleaQuest][5];
		tabTmp[6]=tabExe[aleaQuest][6];
		return tabTmp;
	}
		
	public void afficherElem(String[] tab) {
		
		quest.setText(tab[0].concat("_____________").concat(tab[6]));
		rep1.setText(tab[1]);
		rep2.setText(tab[2]);
		rep3.setText(tab[3]);
		rep4.setText(tab[4]);
	}
	
	public void initialize() {	
		tabFait = new String[5];
		
		score=0;
		nbFait = 0;
		nbRound = 0;
		
		next.setDisable(true);
		
		rep1.setStyle("-fx-background-radius:30;");
		rep2.setStyle("-fx-background-radius:30;");
		rep3.setStyle("-fx-background-radius:30;");
		rep4.setStyle("-fx-background-radius:30;");
		
		afficherElem(tabAlea());
		
	}
	
	public void goodRep() {	
		if(rep1.getText()==tabExe[aleaQuest][5]) {
			rep1.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		}
		if(rep2.getText()==tabExe[aleaQuest][5]) {
			rep2.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		}
		if(rep3.getText()==tabExe[aleaQuest][5]) {
			rep3.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		}
		if(rep4.getText()==tabExe[aleaQuest][5]) {
			rep4.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		}
		pass.setDisable(true);
		next.setDisable(false);
	}
	
	public void resetState(ActionEvent event) {
		rep1.setDisable(false);
		rep2.setDisable(false);
		rep3.setDisable(false);
		rep4.setDisable(false);
		
		next.setDisable(true);
		pass.setDisable(false);
		
		rep1.setStyle("-fx-background-radius:30;");
		rep2.setStyle("-fx-background-radius:30;");
		rep3.setStyle("-fx-background-radius:30;");
		rep4.setStyle("-fx-background-radius:30;");
	}
	
	
	public void testRep1(ActionEvent event) {
		
		quest.setText(quest.getText().replaceAll("_____________", tabExe[aleaQuest][5].toUpperCase()));
		rep1.setDisable(true);
		rep2.setDisable(true);
		rep3.setDisable(true);
		rep4.setDisable(true);
		
		if(rep1.getText()!=tabExe[aleaQuest][5]) {	
			rep1.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		}
		else {
			score++;
		}
		goodRep();
	}
	
	public void testRep2(ActionEvent event) {
		quest.setText(quest.getText().replaceAll("_____________", tabExe[aleaQuest][5].toUpperCase()));
		rep1.setDisable(true);
		rep2.setDisable(true);
		rep3.setDisable(true);
		rep4.setDisable(true);
		
		if(rep2.getText()!=tabExe[aleaQuest][5]) {	
			rep2.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		}
		else {
			score++;
		}
		goodRep();
	}
	
	public void testRep3(ActionEvent event) {
		quest.setText(quest.getText().replaceAll("_____________", tabExe[aleaQuest][5].toUpperCase()));
		rep1.setDisable(true);
		rep2.setDisable(true);
		rep3.setDisable(true);
		rep4.setDisable(true);
		
		if(rep3.getText()!=tabExe[aleaQuest][5]) {	
			rep3.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		}
		else {
			score++;
		}
		goodRep();
	}
	
	public void testRep4(ActionEvent event) {
		quest.setText(quest.getText().replaceAll("_____________", tabExe[aleaQuest][5].toUpperCase()));
		rep1.setDisable(true);
		rep2.setDisable(true);
		rep3.setDisable(true);
		rep4.setDisable(true);
		
		if(rep4.getText()!=tabExe[aleaQuest][5]) {	
			rep4.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		}
		else {
			score++;
		}
		goodRep();
	}

	
	public void exe(ActionEvent event) throws IOException{
		
		switch(nbRound) {
			case 0:
				progBar.setProgress(0.2);
				afficherElem(tabAlea());
				resetState(event);
				break;
			case 1:
				progBar.setProgress(0.4);
				afficherElem(tabAlea());
				resetState(event);
				break;
			case 2:
				progBar.setProgress(0.6);
				afficherElem(tabAlea());
				resetState(event);
				break;
			case 3:
				progBar.setProgress(0.8);
				afficherElem(tabAlea());
				resetState(event);
				break;				
			case 4:
				Parent endView = FXMLLoader.load(getClass().getResource("workshopRes.fxml"));
				Scene endScene = new Scene(endView);
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				window.setScene(endScene);
				break;
			default:
				progBar.setProgress(0);
		}

		nbRound ++;	
	}
	
	public void pass(ActionEvent event) throws IOException{
		
		switch(nbRound) {
			case 0:
				progBar.setProgress(0.2);
				afficherElem(tabAlea());
				resetState(event);
				break;
			case 1:
				progBar.setProgress(0.4);
				afficherElem(tabAlea());
				resetState(event);
				break;
			case 2:
				progBar.setProgress(0.6);
				afficherElem(tabAlea());
				resetState(event);
				break;
			case 3:
				progBar.setProgress(0.8);
				afficherElem(tabAlea());
				resetState(event);
				break;				
			case 4:
				Parent endView = FXMLLoader.load(getClass().getResource("workshopRes.fxml"));
				Scene endScene = new Scene(endView);
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				window.setScene(endScene);		
				break;
			default:
				progBar.setProgress(0);
		}

		nbRound ++;	
	}
}
