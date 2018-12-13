package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class windowParam extends func{
	/*@FXML
	private Label labTest;
	
	public void test() {
		      labTest.setFont(customFont); // use this font with our label
		   
	}*/
	
	URL url;
	Font customFont;
	
	
	public void initialize() throws MalformedURLException{
		url = new File("src/resources/fonts/CANDARA.TFF").toURL();
		
		//System.out.println(url);
		//System.out.println(url.toString()).toExternalForm());
		//windowParam.class.getName();
		
		//Font.createFont(26, new File("src/resources/fonts/CANDARA.TFF"));
		
		//System.out.println(this.getClass().getResource(url.toString()).toExternalForm());
		
		
		//Font.loadFont(windowParam.class.getResource(url.toString()).toExternalForm(), 26);
		
		
	}
	
	
}

