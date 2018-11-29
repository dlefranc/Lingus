package application;
	
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Font;
import javafx.fxml.JavaFXBuilderFactory;

import java.util.logging.Level;
import java.util.logging.Logger;
import demo.model.User;
import demo.security.Authenticator;

public class Main extends Application {
	
	@Override
	  public void init() throws Exception {
	    super.init();
	 
	    Font.loadFont(Main.class.getResource("resources/fonts/GreatVibes.otf").toExternalForm(), 12);
	  }
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("windowProf.fxml"));
			Scene scene = new Scene(root,1280,1024);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//////////////////////////////////////////////////////////////////
	private Parent replaceSceneContent(String fxml) throws Exception {
        Parent page = (Parent) FXMLLoader.load(App.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();
        if (scene == null) {
            scene = new Scene(page, 700, 450);
            scene.getStylesheets().add(App.class.getResource("demo.css").toExternalForm());
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(page);
        }
        stage.sizeToScene();
        return page;
    }
	
	
	public void connectTest() {
		
	}
	public void connectFail(Stage windowFail) {
		 try {
	            replaceSceneContent("windowFail.fxml");
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	}
	/////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		launch(args);
	}
}
