package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class windowWorkshop extends func{
	public static Integer score;
	
	public void lesson1(ActionEvent event) throws IOException{
		Parent lesson1View = FXMLLoader.load(getClass().getResource("lessonConjug.fxml"));
		Scene lesson1Scene = new Scene(lesson1View);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(lesson1Scene);
	}
	
	public void lesson2(ActionEvent event) throws IOException{
		Parent lesson2View = FXMLLoader.load(getClass().getResource("lessonPronoun.fxml"));
		Scene lesson2Scene = new Scene(lesson2View);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(lesson2Scene);
	}
	
	public void oral(ActionEvent event) throws IOException{
		Parent oralView = FXMLLoader.load(getClass().getResource("workshop2.fxml"));
		Scene oralScene = new Scene(oralView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(oralScene);
	}
	
	public void giveUp(ActionEvent event) throws IOException{
		Parent WorkshopView = FXMLLoader.load(getClass().getResource("windowWorkshop.fxml"));
		Scene WorkshopScene = new Scene(WorkshopView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(WorkshopScene);
	}
}
