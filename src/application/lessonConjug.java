package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class lessonConjug extends windowWorkshop{

	public void exe1(ActionEvent event) throws IOException{
		Parent exe1View = FXMLLoader.load(getClass().getResource("workshop1.fxml"));
		Scene exe1Scene = new Scene(exe1View);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(exe1Scene);
	}
	
}
