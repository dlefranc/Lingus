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

public class windowConnect {
	@FXML
	private TextField userProf;
	@FXML
	private PasswordField mdpProf;
	@FXML
	private Label erreur;
	
	public void tryConnec(ActionEvent event) throws IOException{
		String user="Pseudo";
		String mdp="test";
		
		if(userProf.getText().equals(user)  && mdpProf.getText().equals(mdp)) {
			Parent homeView = FXMLLoader.load(getClass().getResource("windowHome.fxml"));
			Scene homeScene = new Scene(homeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(homeScene);
		}
		else {	
			userProf.setStyle("-fx-border-color: red; -fx-border-radius: 25; -fx-background-radius: 25; ");
			mdpProf.setStyle("-fx-border-color: red; -fx-border-radius: 25; -fx-background-radius: 25; ");
			erreur.setStyle("-fx-font-color: red; visibility: true;"); 
		}
		
		

	}
}
