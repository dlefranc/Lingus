package application;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class newLang extends func{
	
	private Integer score;
	
	@FXML
	private Button next1, next2, next3, nextEND;
	@FXML
	private Button pass1, pass2, pass3;
	@FXML
	private Label questIT;
	
	@FXML
	private Button ITrep1_ex1, ITrep2_ex1, ITrep3_ex1, ITrep4_ex1;
	@FXML
	private Button ITrep1_ex2, ITrep2_ex2, ITrep3_ex2, ITrep4_ex2;
	@FXML
	private Button ITrep1_ex3, ITrep2_ex3, ITrep3_ex3, ITrep4_ex3;
	
	@FXML
	private Pane IT2, IT3, ITEND;
	
	@FXML
	private Label scoreIT, levelIT;
	@FXML
	private ImageView starIT1;
	@FXML
	private ImageView starIT2;
	@FXML
	private ImageView starIT3;
	
	@FXML
	private ImageView play, pause;
	@FXML
	private Slider volume;
	
	private MediaPlayer ITSound = new MediaPlayer(new Media(this.getClass().getResource("../resources/sounds/claudia.mp3").toString()));
	
	public void initialize() {	
		score=0;
		
		next1.setDisable(true);
		next2.setDisable(true);
		next3.setDisable(true);
		
		volume.setValue(ITSound.getVolume() * 100);
		volume.valueProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable observable) {
				ITSound.setVolume(volume.getValue() / 100);
			}
		});
		
	}
	
	public void goodRep1(ActionEvent event) {	
		ITrep1_ex1.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		pass1.setDisable(true);
		next1.setDisable(false);
		questIT.setText(questIT.getText().replaceAll("_____________", "TROVA"));
	}
	public void goodRep2(ActionEvent event) {	
		ITrep4_ex2.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		pass2.setDisable(true);
		next2.setDisable(false);
	}
	public void goodRep3(ActionEvent event) {	
		ITrep4_ex3.setStyle("-fx-background-color: #35a8e1; -fx-background-radius:30; -fx-opacity:0.99");
		pass3.setDisable(true);
		next3.setDisable(false);
	}

	
////////////////////////////////////////////////////////////PANE 1//////////////////////////////////////////////////////////
	public void testRepIT1_ex1(ActionEvent event) {
		ITrep1_ex1.setDisable(true);
		ITrep2_ex1.setDisable(true);
		ITrep3_ex1.setDisable(true);
		ITrep4_ex1.setDisable(true);
			
		score++;
	
		goodRep1(event);
	}
	
	public void testRepIT2_ex1(ActionEvent event) {
		ITrep1_ex1.setDisable(true);
		ITrep2_ex1.setDisable(true);
		ITrep3_ex1.setDisable(true);
		ITrep4_ex1.setDisable(true);
		
		ITrep2_ex1.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");

		goodRep1(event);
	}
	
	public void testRepIT3_ex1(ActionEvent event) {
		ITrep1_ex1.setDisable(true);
		ITrep2_ex1.setDisable(true);
		ITrep3_ex1.setDisable(true);
		ITrep4_ex1.setDisable(true);
		
	
		ITrep3_ex1.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		
		goodRep1(event);
	}
	
	public void testRepIT4_ex1(ActionEvent event) {
		ITrep1_ex1.setDisable(true);
		ITrep2_ex1.setDisable(true);
		ITrep3_ex1.setDisable(true);
		ITrep4_ex1.setDisable(true);

		ITrep4_ex1.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		
		goodRep1(event);
	}

	
	public void nextIT1(ActionEvent event) throws IOException{
		IT2.setVisible(true);
	}
	
	public void passIT1(ActionEvent event) throws IOException{
		IT2.setVisible(true);
	}

////////////////////////////////////////////////////////////PANE 2//////////////////////////////////////////////////////////
	public void testRepIT1_ex2(ActionEvent event) {
		ITrep1_ex2.setDisable(true);
		ITrep2_ex2.setDisable(true);
		ITrep3_ex2.setDisable(true);
		ITrep4_ex2.setDisable(true);
			
		ITrep1_ex2.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
	
		goodRep2(event);
	}
	
	public void testRepIT2_ex2(ActionEvent event) {
		ITrep1_ex2.setDisable(true);
		ITrep2_ex2.setDisable(true);
		ITrep3_ex2.setDisable(true);
		ITrep4_ex2.setDisable(true);
		
		ITrep2_ex2.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");

		goodRep2(event);
	}
	
	public void testRepIT3_ex2(ActionEvent event) {
		ITrep1_ex2.setDisable(true);
		ITrep2_ex2.setDisable(true);
		ITrep3_ex2.setDisable(true);
		ITrep4_ex2.setDisable(true);
		
	
		ITrep3_ex2.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		
		goodRep2(event);
	}
	
	public void testRepIT4_ex2(ActionEvent event) {
		ITrep1_ex2.setDisable(true);
		ITrep2_ex2.setDisable(true);
		ITrep3_ex2.setDisable(true);
		ITrep4_ex2.setDisable(true);

		score++;
		
		goodRep2(event);
	}

	
	public void nextIT2(ActionEvent event) throws IOException{
		IT3.setVisible(true);
	}
	
	public void passIT2(ActionEvent event) throws IOException{
		IT3.setVisible(true);
	}
////////////////////////////////////////////////////////////PANE 3//////////////////////////////////////////////////////////
	public void testRepIT1_ex3(ActionEvent event) {
		ITrep1_ex3.setDisable(true);
		ITrep2_ex3.setDisable(true);
		ITrep3_ex3.setDisable(true);
		ITrep4_ex3.setDisable(true);
			
		ITrep1_ex3.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
	
		goodRep3(event);
	}
	
	public void testRepIT2_ex3(ActionEvent event) {
		ITrep1_ex3.setDisable(true);
		ITrep2_ex3.setDisable(true);
		ITrep3_ex3.setDisable(true);
		ITrep4_ex3.setDisable(true);
		
		ITrep2_ex3.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");

		goodRep3(event);
	}
	
	public void testRepIT3_ex3(ActionEvent event) {
		ITrep1_ex3.setDisable(true);
		ITrep2_ex3.setDisable(true);
		ITrep3_ex3.setDisable(true);
		ITrep4_ex3.setDisable(true);
		
	
		ITrep3_ex3.setStyle("-fx-background-color: red; -fx-background-radius:30; -fx-opacity:0.6; -fx-text-fill:white");
		
		goodRep3(event);
	}
	
	public void testRepIT4_ex3(ActionEvent event) {
		ITrep1_ex3.setDisable(true);
		ITrep2_ex3.setDisable(true);
		ITrep3_ex3.setDisable(true);
		ITrep4_ex3.setDisable(true);

		score++;
		
		goodRep3(event);
	}

	
	public void nextIT3(ActionEvent event) throws IOException{
		ITEND.setVisible(true);
		showStars(score);
		showNote(score);
	}
	
	public void passIT3(ActionEvent event) throws IOException{
		ITEND.setVisible(true);
		showStars(score);
		showNote(score);
	}
	
	public void playSound() throws MalformedURLException {
		ITSound.play();
		pause.setVisible(true);
		play.setVisible(false);
	}
	
	public void stopSound() {
		ITSound.stop();
		pause.setVisible(false);
		play.setVisible(true);
	}
	
	public void pauseSound() {
		pause.setVisible(false);
		play.setVisible(true);
		ITSound.pause();
	}
////////////////////////////////////////////////////////////PANE END//////////////////////////////////////////////////////////

	private Image image1;
	private Image image2;
	private Image image3;

	@SuppressWarnings("deprecation")
	public void showStars(Integer score) throws IOException{
		if(score < 1) {
			
			image1 = new Image(new File("src/resources/images/Stars/BlackStar.png").toURL().toString());
			image2 = new Image(new File("src/resources/images/Stars/BlackStar.png").toURL().toString());
			image3 = new Image(new File("src/resources/images/Stars/BlackStar.png").toURL().toString());
	
			starIT1.setImage(image1);
			starIT2.setImage(image2);
			starIT3.setImage(image3);
	
		}
		else if(score < 2) {
			image1 = new Image(new File("src/resources/images/Stars/GoldStar.png").toURL().toString());
			image2 = new Image(new File("src/resources/images/Stars/BlackStar.png").toURL().toString());
			image3 = new Image(new File("src/resources/images/Stars/BlackStar.png").toURL().toString());
	
			starIT1.setImage(image1);
			starIT2.setImage(image2);
			starIT3.setImage(image3);
	
		}
		else if(score < 3) {
			image1 = new Image(new File("src/resources/images/Stars/GoldStar.png").toURL().toString());
			image2 = new Image(new File("src/resources/images/Stars/GoldStar.png").toURL().toString());
			image3 = new Image(new File("src/resources/images/Stars/BlackStar.png").toURL().toString());
	
			starIT1.setImage(image1);
			starIT2.setImage(image2);
			starIT3.setImage(image3);

		}
		else {
			image1 = new Image(new File("src/resources/images/Stars/GoldStar.png").toURL().toString());
			image2 = new Image(new File("src/resources/images/Stars/GoldStar.png").toURL().toString());
			image3 = new Image(new File("src/resources/images/Stars/GoldStar.png").toURL().toString());
	
			starIT1.setImage(image1);
			starIT2.setImage(image2);
			starIT3.setImage(image3);
		}
	}
	
	public void showNote(Integer score) {
		if(score < 1) {
			scoreIT.setText("0");
			levelIT.setText("Débutant");
		}
		else if(score < 2) {
			scoreIT.setText("1");
			levelIT.setText("Apprenti");
		}
		else if(score < 3) {
			scoreIT.setText("2");
			levelIT.setText("Intermédiaire");
		}
		else{
			scoreIT.setText("3");
			levelIT.setText("Expert");
		}
	}
	
	
	public void nextITEND(ActionEvent event)  throws IOException{
		sceneHome(event);
	}
}
