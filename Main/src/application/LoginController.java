package application;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class LoginController {
	@FXML
	private TextField tfTitle;

	// Event Listener on Button.onAction
	@FXML
	public void btnLOGINclicked(ActionEvent event) {
		// TODO Autogenerated
		Stage mainWindow = (Stage)	tfTitle.getScene().getWindow();
		String title = tfTitle.getText();
		mainWindow.setTitle(title);
	}
}
