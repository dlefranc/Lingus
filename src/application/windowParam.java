package application;



import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class windowParam extends func{
	/*@FXML
	private Label labTest;
	
	public void test() {
		      labTest.setFont(customFont); // use this font with our label
		   
	}*/
	String salut;
	String url;
	Font customFont;
	@FXML
	Label labTest;
	@FXML
	Button btn;
	
	public void initialize() throws MalformedURLException{
		
		salut = new File("src/resources/fonts/CANDARA.tff").toURL().toString();
		System.out.println(salut.substring(5));
		
		//url = "../src/resources/fonts/CANDARA.tff";
		
		/*try {
			GraphicsEnvironment ge =
					GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, url));
		}catch (IOException|FontFormatException e) {
			
		}*/
		
		//labTest.setFont(Font.createFont(Font.TRUETYPE_FONT, url));
		
		
		
		 Font myFontloadFontAirstreamNF20 = 
				 
		            Font.loadFont(getClass().getResourceAsStream(salut.substring(5)), 26);
		 System.out.println(myFontloadFontAirstreamNF20.getSize());
		
		        //btn.setFont(myFontloadFontAirstreamNF20);
		
		//System.out.println(url);
		//System.out.println(url.toString()).toExternalForm());
		//windowParam.class.getName();
		
		//Font.createFont(26, new File("src/resources/fonts/CANDARA.TFF"));
		
		//System.out.println(this.getClass().getResource(url.toString()).toExternalForm());
		
		
		//Font.loadFont(windowParam.class.getResource(url.toString()).toExternalForm(), 26);
		
		
	}
	
	
}

