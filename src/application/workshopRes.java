package application;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class workshopRes extends windowWorkshop{
	@FXML
	private Label nbRep;
	@FXML
	private Label note;
	
	@FXML
	private ImageView star1;
	@FXML
	private ImageView star2;
	@FXML
	private ImageView star3;
	@FXML
	private ImageView star4;
	@FXML
	private ImageView star5;
	
	private Image image1;
	private Image image2;
	private Image image3;
	private Image image4;
	private Image image5;
	
	
	public void initialize(){		
		nbRep.setText(score.toString());
		
		try {
			showStars(score);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		showNote(score);
	}
	
	@SuppressWarnings("deprecation")
	public void showStars(Integer score) throws IOException{
		if(score < 1) {
			image1 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image2 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image3 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image4 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image5 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			star1.setImage(image1);
			star2.setImage(image2);
			star3.setImage(image3);
			star4.setImage(image4);
			star5.setImage(image5);
		}
		else if(score < 2) {
			image1 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image2 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image3 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image4 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image5 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			star1.setImage(image1);
			star2.setImage(image2);
			star3.setImage(image3);
			star4.setImage(image4);
			star5.setImage(image5);
		}
		else if(score < 3) {
			image1 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image2 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image3 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image4 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image5 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			star1.setImage(image1);
			star2.setImage(image2);
			star3.setImage(image3);
			star4.setImage(image4);
			star5.setImage(image5);
		}
		else if(score < 4) {
			image1 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image2 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image3 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image4 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			image5 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			star1.setImage(image1);
			star2.setImage(image2);
			star3.setImage(image3);
			star4.setImage(image4);
			star5.setImage(image5);
		}
		else if(score < 5){
			image1 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image2 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image3 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image4 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image5 = new Image(new File("@../../resources/images/Stars/BlackStar.png").toURL().toString());
			star1.setImage(image1);
			star2.setImage(image2);
			star3.setImage(image3);
			star4.setImage(image4);
			star5.setImage(image5);
		}
		else {
			image1 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image2 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image3 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image4 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			image5 = new Image(new File("@../../resources/images/Stars/GoldStar.png").toURL().toString());
			star1.setImage(image1);
			star2.setImage(image2);
			star3.setImage(image3);
			star4.setImage(image4);
			star5.setImage(image5);
		}
	}
	
	public void showNote(Integer score) {
		if(score < 1) {
			note.setText("You need to do more exercises.");
		}
		else if(score < 2) {
			note.setText("Not bad continue on this way.");
		}
		else if(score < 3) {
			note.setText("Quite good.");
		}
		else if(score < 4) {
			note.setText("Good.");
		}
		else if(score < 5){
			note.setText("Very good.");
		}
		else {
			note.setText("Perfect.");
		}
	}
	
	public void endExe(ActionEvent event) throws IOException{
		sceneWorkshop(event);
	}
	
	
}
