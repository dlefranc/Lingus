package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

public class windowWorkshop extends func{
	public static Integer score;
	
	public void exe1(ActionEvent event) throws IOException{
		Parent exe1View = FXMLLoader.load(getClass().getResource("workshop1.fxml"));
		Scene exe1Scene = new Scene(exe1View);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(exe1Scene);
	}
	
	
	public void exe3(ActionEvent event) throws IOException{
		Parent exe3View = FXMLLoader.load(getClass().getResource("workshop3.fxml"));
		Scene exe3Scene = new Scene(exe3View);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(exe3Scene);
	}
	
	public void giveUp(ActionEvent event) throws IOException{
		Parent WorkshopView = FXMLLoader.load(getClass().getResource("windowWorkshop.fxml"));
		Scene WorkshopScene = new Scene(WorkshopView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(WorkshopScene);
	}
}
