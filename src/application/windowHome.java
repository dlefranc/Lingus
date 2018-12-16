package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class windowHome extends func{
	@FXML
	private Hyperlink hyp1;
	@FXML
	private Hyperlink hyp2;
	
	
	@FXML
	private Pane langPane;
	@FXML
	private ImageView ITFlag;
	@FXML
	private Hyperlink hypITFlag;
	
	@FXML
	private Pane levelIT;
	
	public void hyperlinkIn() {
		hyp1.setStyle("-fx-text-fill : #35a8e1; -fx-underline : true;");
		hyp2.setStyle("-fx-text-fill : #35a8e1; -fx-underline : true;");
		
	}
	
	public void hyperlinkOut() {
		hyp1.setStyle("-fx-text-fill : #008ec0; -fx-underline : false;");
		hyp2.setStyle("-fx-text-fill : #008ec0; -fx-underline : false;");
	}
	
	public void viewWordList (ActionEvent event) throws IOException{
		Parent wordListView = FXMLLoader.load(getClass().getResource("wordList.fxml"));
		Scene wordListScene = new Scene(wordListView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(wordListScene);
	}
	
	
	public void learn() {
		langPane.setVisible(true);
	}
	
	public void closeLang() {
		langPane.setVisible(false);
		levelIT.setVisible(false);
	}
	
	public void addIT() {
		levelIT.setVisible(true);
	}
	
	public void initialize() {
		if(learnIT) {
			ITFlag.setDisable(true);
			hypITFlag.setDisable(true);
		}
		else {	
			ITFlag.setDisable(false);
			hypITFlag.setDisable(false);
		}
	}
	
	public void newLangView(ActionEvent event) throws IOException{
		learnIT = true;
		levelIT.setVisible(false);
		ITFlag.setDisable(true);
		hypITFlag.setDisable(true);
		
		Parent newLangView = FXMLLoader.load(getClass().getResource("newLang.fxml"));
		Scene newLangScene = new Scene(newLangView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newLangScene);
	}
	
	public void newLangAccept(){
		learnIT = true;
		levelIT.setVisible(false);
		ITFlag.setDisable(true);
		hypITFlag.setDisable(true);
		langPane.setVisible(false);
	}
	
	
	
}