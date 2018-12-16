package application;



import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.VBox;


public class wordList extends func{
	
	@FXML
	private VBox vbox;
	@FXML
	private ScrollBar scrollBar;
	
	public void initialize() {
		scrollBar.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				vbox.setLayoutY(-new_val.doubleValue());
			}
		});
	}

	
}
