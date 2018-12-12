package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class windowProfile extends func{
	
	public void viewParam (ActionEvent event) throws IOException{
		Parent paramView = FXMLLoader.load(getClass().getResource("windowParam.fxml"));
		Scene paramScene = new Scene(paramView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(paramScene);
	}
	
	
	
}
