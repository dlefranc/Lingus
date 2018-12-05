package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;

import javafx.scene.control.*;

public class func extends Main{
	@FXML
	private Button homeBtn;
	@FXML
	private Button magBtn;
	@FXML
	private Button workshopBtn;
	@FXML
	private Button toolsBtn;
	@FXML
	private Button profBtn;
	@FXML
	private Button decoBtn;
	
	//OVER
	public void mouseOverHome() {
		homeBtn.setStyle("-fx-background-color: white; -fx-background-radius:30; -fx-text-fill : #35a8e1;");
	}
	public void mouseOverMag() {
		magBtn.setStyle("-fx-background-color: white; -fx-background-radius:30; -fx-text-fill : #35a8e1;");	
	}
	public void mouseOverWorkshop() {
		workshopBtn.setStyle("-fx-background-color: white; -fx-background-radius:30; -fx-text-fill : #35a8e1;");	
	}
	public void mouseOverTools() {
		toolsBtn.setStyle("-fx-background-color: white; -fx-background-radius:30; -fx-text-fill : #35a8e1;");	
	}
	public void mouseOverProf() {
		profBtn.setStyle("-fx-background-color: white; -fx-background-radius:30; -fx-text-fill : #35a8e1;");	
	}
	public void mouseOverDeco() {
		decoBtn.setStyle("-fx-background-color: white; -fx-background-radius:30; -fx-text-fill : #35a8e1;");	
	}
	
	//EXIT
	public void mouseExitHome() {
		homeBtn.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-text-fill : white;");
	}
	public void mouseExitMag() {
		magBtn.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-text-fill : white;");	
	}
	public void mouseExitWorkshop() {
		workshopBtn.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-text-fill : white;");	
	}
	public void mouseExitTools() {
		toolsBtn.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-text-fill : white;");	
	}
	public void mouseExitProf() {
		profBtn.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-text-fill : white;");	
	}
	public void mouseExitDeco() {
		decoBtn.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-text-fill : white;");	
	}
	
	
	public void sceneHome(ActionEvent event) throws IOException{
		Parent homeView = FXMLLoader.load(getClass().getResource("windowHome.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);
	}
	
	public void sceneMag(ActionEvent event) throws IOException{
		Parent MagView = FXMLLoader.load(getClass().getResource("windowMag.fxml"));
		Scene MagScene = new Scene(MagView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(MagScene);
	}
	
	public void sceneWorkshop(ActionEvent event) throws IOException{
		Parent WorkshopView = FXMLLoader.load(getClass().getResource("windowWorkshop.fxml"));
		Scene WorkshopScene = new Scene(WorkshopView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(WorkshopScene);
	}
	
	public void sceneTools(ActionEvent event) throws IOException{
		Parent ToolsView = FXMLLoader.load(getClass().getResource("windowTools.fxml"));
		Scene ToolsScene = new Scene(ToolsView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(ToolsScene);
	}
	
	public void sceneProfile(ActionEvent event) throws IOException{
		Parent ProfileView = FXMLLoader.load(getClass().getResource("windowProfile.fxml"));
		Scene ProfileScene = new Scene(ProfileView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(ProfileScene);
	}
	
	public void sceneConnect(ActionEvent event) throws IOException{
		Parent ConnectView = FXMLLoader.load(getClass().getResource("windowConnect.fxml"));
		Scene ConnectScene = new Scene(ConnectView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(ConnectScene);
	}
	
}
