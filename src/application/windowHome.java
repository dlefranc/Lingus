package application;

import java.io.File;
import java.net.MalformedURLException;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class windowHome extends func{
	@FXML
	private Hyperlink hyp1;
	@FXML
	private Hyperlink hyp2;
	
	
	/*@FXML
	private ComboBox<ImageView> menuBtn;*/
	@FXML
	private ComboBox<Image> menuBtn;
	
	private ImageView flagFR, flagENG, flagIT;
	private Image imgFR, imgENG, imgIT;
	
	public void initialize() throws MalformedURLException {
		
	/*	imgFR = new Image(new File("src/resources/images/Flags/flagFR.png").toURL().toString());
		imgENG = new Image(new File("src/resources/images/Flags/flagENG.png").toURL().toString());
		imgIT = new Image(new File("src/resources/images/Flags/flagIT.png").toURL().toString());
		
		flagFR.setImage(imgFR);
		flagENG.setImage(imgENG);
		flagIT.setImage(imgIT);
	
		menuBtn.getItems().clear();
		menuBtn.getItems().addAll(imgFR, imgENG, imgIT);
		
		menuBtn.getSelectionModel().select(imgFR);*/
		
		
	}
	
	
	public void hyperlinkIn() {
		hyp1.setStyle("-fx-text-fill : #35a8e1; -fx-underline : true;");
		hyp2.setStyle("-fx-text-fill : #35a8e1; -fx-underline : true;");
		
	}
	
	public void hyperlinkOut() {
		hyp1.setStyle("-fx-text-fill : #008ec0; -fx-underline : false;");
		hyp2.setStyle("-fx-text-fill : #008ec0; -fx-underline : false;");
	}
	
}