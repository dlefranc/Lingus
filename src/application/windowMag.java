package application;


import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class windowMag extends func{
	@FXML
	private ImageView mag1;
	@FXML
	private ImageView mag2;
	@FXML
	private ImageView mag3;
	@FXML
	private ImageView mag4;
	@FXML
	private ImageView mag5;
	@FXML
	private ComboBox<String> categorie;
	
	private String choice;
	
	private Image image1;
	private Image image2;
	private Image image3;
	private Image image4;
	private Image image5;
	
	@FXML
	public void initialize() {
		categorie.getItems().clear();
		categorie.getItems().addAll("Art", "Car", "Food", "Gossip", "Sport", "Teen", "Travel", "Wedding");
		categorie.getSelectionModel().select("Art");
	}
	
	@SuppressWarnings({ "deprecation" })
	public void switchCategorie(ActionEvent event) throws IOException{
		choice = categorie.getSelectionModel().getSelectedItem().toString();
		switch (choice) {
			case "Art":
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
				break;
				
			case "Car":
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Car/Car1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Car/Car2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Car/Car3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Car/Car4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Car/Car5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
				break;
				
			case "Food":
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Food/Food1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Food/Food2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Food/Food3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Food/Food4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Food/Food5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
				break;
				
			case "Gossip":
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Gossip/Gossip1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Gossip/Gossip2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Gossip/Gossip3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Gossip/Gossip4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Gossip/Gossip5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
				break;
				
			case "Sport":
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Sport/Sport1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Sport/Sport2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Sport/Sport3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Sport/Sport4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Sport/Sport5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
				break;
				
			case "Teen":
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Teen/Teen1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Teen/Teen2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Teen/Teen3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Teen/Teen4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Teen/Teen5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
				break;
				
			case "Travel":
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Travel/Travel1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Travel/Travel2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Travel/Travel3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Travel/Travel4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Travel/Travel5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
				break;
				
			case "Wedding":
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Wedding/Wedding1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Wedding/Wedding2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Wedding/Wedding3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Wedding/Wedding4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Wedding/Wedding5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
				break;
				
			default:
				image1 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art1.jpg").toURL().toString());
				image2 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art2.jpg").toURL().toString());
				image3 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art3.jpg").toURL().toString());
				image4 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art4.jpg").toURL().toString());
				image5 = new Image(new File("@../../resources/images/CoversMag/Eng/Art/Art5.jpg").toURL().toString());
				mag1.setImage(image1);
				mag2.setImage(image2);
				mag3.setImage(image3);
				mag4.setImage(image4);
				mag5.setImage(image5);
		}
	}

	
	public void lumOnMag1() {
		mag1.setStyle("-fx-effect: dropshadow(three-pass-box,  #10a3e7, 10, 0.6, 0, 0);");
	}
	public void lumOnMag2() {
		mag2.setStyle("-fx-effect: dropshadow(three-pass-box,  #10a3e7, 10, 0.6, 0, 0);");
	}
	public void lumOnMag3() {
		mag3.setStyle("-fx-effect: dropshadow(three-pass-box,  #10a3e7, 10, 0.6, 0, 0);");
	}
	public void lumOnMag4() {
		mag4.setStyle("-fx-effect: dropshadow(three-pass-box,  #10a3e7, 10, 0.6, 0, 0);");
	}
	public void lumOnMag5() {
		mag5.setStyle("-fx-effect: dropshadow(three-pass-box,  #10a3e7, 10, 0.6, 0, 0);");
	}
	
	
	public void lumOffMag1() {
		mag1.setStyle("-fx-border-color : red;");
	}
	public void lumOffMag2() {
		mag2.setStyle("-fx-border-color : red;");
	}
	public void lumOffMag3() {
		mag3.setStyle("-fx-border-color : red;");
	}
	public void lumOffMag4() {
		mag4.setStyle("-fx-border-color : red;");
	}
	public void lumOffMag5() {
		mag5.setStyle("-fx-border-color : red;");
	}
	
	
}
