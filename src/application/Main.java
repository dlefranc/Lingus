package application;
	
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.text.Font;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.control.*;
import java.lang.Object;
import javafx.animation.Animation.*;
import javafx.animation.Transition.*;

/*import java.util.logging.Level;
import java.util.logging.Logger;
import demo.model.User;
import demo.security.Authenticator;*/

public class Main extends Application {
	/*private Stage stage;
	
	@FXML
	private TextField userProf;
	
	@FXML
	private TextField mdpProf;*/
	
	
	/*@Override
	  public void init() throws Exception {
	    super.init();
	 
	    Font.loadFont(Main.class.getResource("resources/fonts/GreatVibes.otf").toExternalForm(), 12);
	  }*/
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//stage = primaryStage;
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("windowExe.fxml"));
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("windowProf.fxml"));
			Scene scene = new Scene(root,1280,1024);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*long mTime = System.currentTimeMillis();
	long end = mTime + 5000; // 5 seconds 

	while (System.currentTimeMillis() > end) 
	{*/
	      //close this stage  
	//} 
	
	
	/*PauseTransition delay = new PauseTransition(Duration.seconds(5));
	delay.setOnFinished( event -> stage.close() );
	delay.play();*/
	//////////////////////////////////////////////////////////////////
	/*private Parent replaceSceneContent(String fxml) throws Exception {
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
    }*/
	
	/*public void connectFail(Stage windowFail) {
		 try {
	            replaceSceneContent("windowFail.fxml");
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	}*/
	

	/*public void connectTest() {
		if(userProf.getText() == "test" && mdpProf.getText() == "s") {
			System.out.println("réussi");
		}
		else {
			System.out.println("fail");
		}
	}*/
	/////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		launch(args);
	}
}
