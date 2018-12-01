package application;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.control.*;

public class windowProf extends Application {
	private Stage stage;
	
	@FXML
	private TextField userProf;
	
	@FXML
	private TextField mdpProf;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
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
        Parent page = (Parent) FXMLLoader.load(Main.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();
        if (scene == null) {
            scene = new Scene(page, 1280, 1024);
            scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(page);
        }
        stage.sizeToScene();
        return page;
    }
	
	public void connectFail(Stage windowFail) {
		 try {
	            replaceSceneContent("windowFail.fxml");
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	}
	

	public void connectTest() {
		if(userProf.getText() == "test" && mdpProf.getText() == "s") {
			System.out.println("réussi");
		}
		else {
			System.out.println("fail");
		}
	}
	/////////////////////////////////////////////////////////////////////

}
