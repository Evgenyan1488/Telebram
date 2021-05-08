package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {


    @FXML
    Button btn;
    @FXML
    TextArea textarea;
    @FXML
    TextField textfield;

    String alltext = "";


    public void btnClicked(ActionEvent actionEvent) {
        alltext += "Главный разраб: " + textfield.getText();
        textarea.setText(alltext);
        alltext += "\n";
        textfield.setText("");
    }
}

