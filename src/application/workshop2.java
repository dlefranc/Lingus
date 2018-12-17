package application;

import java.io.IOException;
import java.net.MalformedURLException;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class workshop2 extends windowWorkshop{

	private Integer nbRound;
	@FXML
	private ImageView playWork2, pauseWork2;
	@FXML
	private Slider volumeWork2;
	
	@FXML
	private ProgressBar progBar;
	@FXML
	private Button rep1,rep2,rep3,rep4;
	@FXML Label quest;
	@FXML
	private Button next;
	@FXML
	private Button pass;
	
	private MediaPlayer ITSoundWork2 = new MediaPlayer(new Media(this.getClass().getResource("../resources/sounds/hungerGames.mp3").toString()));
	
	private String tabExe[][]= {{"What film does the boy wants to see?", "German war", "War game", "Hunger games", "Star wars", "Hunger games"},
								{"What does the girl do on friday evening?", "Cooking", "Babysitting", "Serving", "Eating", "Babysitting"},
								{"When does the boy have to go to the dentist?", "On saturday morning", "On saturday evening", "On friday evening", "On sunday morning", "On saturday morning"},
								{"Who's getting married?", "The boy's cousin", "The girl's friend", "The girl's cousin", "The boy's sister", "The girl's cousin"},
								{"When does the couple will see the movie?", "On saturday evening", "On sunday morning", "On sunday evening", "On saturday morning", "On sunday evening"},
								};
	
	
	
	public void initialize() {	
		score=0;
		nbRound = 0;
		
		volumeWork2.setValue(ITSoundWork2.getVolume() * 100);
		volumeWork2.valueProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable observable) {
				ITSoundWork2.setVolume(volumeWork2.getValue() / 100);
			}
		});
		afficherElem(0);
	}
	
	public void playSoundWork2() throws MalformedURLException {
		ITSoundWork2.play();
		pauseWork2.setVisible(true);
		playWork2.setVisible(false);
	}
	
	public void stopSoundWork2() {
		ITSoundWork2.stop();
		pauseWork2.setVisible(false);
		playWork2.setVisible(true);
	}
	
	public void pauseSoundWork2() {
		pauseWork2.setVisible(false);
		playWork2.setVisible(true);
		ITSoundWork2.pause();
	}
	
	public void afficherElem(Integer nb) {
		quest.setText(tabExe[nb][0]);
		rep1.setText(tabExe[nb][1]);
		rep2.setText(tabExe[nb][2]);
		rep3.setText(tabExe[nb][3]);
		rep4.setText(tabExe[nb][4]);
	}

	public void goodRep() {	
		if(rep1.getText()==tabExe[nbRound][5]) {
			rep1.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		}
		if(rep2.getText()==tabExe[nbRound][5]) {
			rep2.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		}
		if(rep3.getText().equals(tabExe[nbRound][5])) {
			rep3.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		}
		if(rep4.getText()==tabExe[nbRound][5]) {
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
		rep1.setDisable(true);
		rep2.setDisable(true);
		rep3.setDisable(true);
		rep4.setDisable(true);
		
		if(rep1.getText()!=tabExe[nbRound][5]) {	
			rep1.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		}
		else {
			score++;
		}
		goodRep();
	}
	
	public void testRep2(ActionEvent event) {
		rep1.setDisable(true);
		rep2.setDisable(true);
		rep3.setDisable(true);
		rep4.setDisable(true);
		
		if(rep2.getText()!=tabExe[nbRound][5]) {	
			rep2.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		}
		else {
			score++;
		}
		goodRep();
	}
	
	public void testRep3(ActionEvent event) {
		rep1.setDisable(true);
		rep2.setDisable(true);
		rep3.setDisable(true);
		rep4.setDisable(true);
		
		if(rep3.getText().equals(tabExe[nbRound][5])) {	
			score++;
		}
		else {
			rep3.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		}
		goodRep();
	}
	
	public void testRep4(ActionEvent event) {
		rep1.setDisable(true);
		rep2.setDisable(true);
		rep3.setDisable(true);
		rep4.setDisable(true);
		
		if(rep4.getText()!=tabExe[nbRound][5]) {	
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
				afficherElem(nbRound + 1);
				resetState(event);
				break;
			case 1:
				progBar.setProgress(0.4);
				afficherElem(nbRound + 1);
				resetState(event);
				break;
			case 2:
				progBar.setProgress(0.6);
				afficherElem(nbRound + 1);
				resetState(event);
				break;
			case 3:
				progBar.setProgress(0.8);
				afficherElem(nbRound + 1);
				resetState(event);
				break;				
			case 4:
				ITSoundWork2.stop();
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
				afficherElem(nbRound + 1);
				resetState(event);
				break;
			case 1:
				progBar.setProgress(0.4);
				afficherElem(nbRound + 1);
				resetState(event);
				break;
			case 2:
				progBar.setProgress(0.6);
				afficherElem(nbRound + 1);
				resetState(event);
				break;
			case 3:
				progBar.setProgress(0.8);
				afficherElem(nbRound + 1);
				resetState(event);
				break;				
			case 4:
				ITSoundWork2.stop();
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
