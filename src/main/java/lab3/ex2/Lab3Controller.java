package lab3.ex2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Lab3Controller {

    @FXML
    private Button button1;

    @FXML
    private Label lable1;

    @FXML
    private TextField input1;
    
    @FXML
    private Label label2;

    @FXML
    void buttonPressed(ActionEvent event) {
    	lable1.setText("Welcome to JavaFX!");
    	label2.setText(input1.getText());
    }

}
