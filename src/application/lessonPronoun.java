package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class lessonPronoun extends windowWorkshop{

	public void exe3(ActionEvent event) throws IOException{
		Parent exe3View = FXMLLoader.load(getClass().getResource("workshop3.fxml"));
		Scene exe3Scene = new Scene(exe3View);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(exe3Scene);
	}
	
}
