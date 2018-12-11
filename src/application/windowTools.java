package application;

import java.io.IOException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class windowTools extends func{
	@FXML
	private ComboBox<String> tools;
	
	@FXML
	private VBox vbox;
	@FXML
	private ScrollBar scrollBar;
	@FXML
	private Pane tradPane;
	
	private String choice = "Verbes irréguliers";
	
	
	public void initialize() {
		scrollBar.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				vbox.setLayoutY(-new_val.doubleValue());
			}
		});
	}
	
	public void switchTools(ActionEvent event) throws IOException{
		choice = tools.getSelectionModel().getSelectedItem().toString();
		
		switch (choice) {
			case "Verbes irréguliers":
				vbox.setVisible(true);
				scrollBar.setVisible(true);
				tradPane.setVisible(false);
				break;
			case "Traducteur":
				vbox.setVisible(false);
				scrollBar.setVisible(false);
				tradPane.setVisible(true);
				break;
			default:
				vbox.setVisible(true);
				scrollBar.setVisible(true);
				tradPane.setVisible(false);
		}
	}
	
	
}
