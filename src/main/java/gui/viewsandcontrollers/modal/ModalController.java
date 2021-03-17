package gui.viewsandcontrollers.modal;


	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;

	public class ModalController {

		@FXML
		private Label label;
		
		@FXML
		private TextField TextField;

		public void initialize() {
			// TODO
		}
		
		@FXML
		private void handleButtonAction(ActionEvent event) {
			label.setText("Error");
			
		}

	}


