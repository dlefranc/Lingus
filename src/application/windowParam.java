package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class windowParam extends func{
	
	@FXML
	private Label paramSave;
	
	public void initialize() {
		paramSave.setVisible(false);
	}
	
	public void validParam() {
		paramSave.setVisible(true);
	}
	
}
	
	


