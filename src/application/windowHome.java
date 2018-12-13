package application;

import java.io.File;
import java.net.MalformedURLException;

import javafx.fxml.FXML;
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
	
	
	@FXML
	private MenuButton menuBtn;
	
	public void initialize() throws MalformedURLException {
		MenuItem menuItem1 = new MenuItem("Option 1");
		MenuItem menuItem2 = new MenuItem("Option 2");
		MenuItem menuItem3 = new MenuItem("Option 3");
		
		@SuppressWarnings("deprecation")
		Image image1 = new Image(new File("src/resources/images/CoversMag/Eng/Art/Art1.jpg").toURL().toString());
		
		ImageView imageView = new ImageView(image1);

		menuBtn = new MenuButton("Options", imageView, menuItem1, menuItem2, menuItem3);
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