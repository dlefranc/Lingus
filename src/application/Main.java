package application; 
	

import java.net.MalformedURLException;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;



public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws MalformedURLException{
		
		try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("windowHome.fxml"));
			primaryStage.setResizable(false);
			Scene scene = new Scene(root,1270,1024);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
