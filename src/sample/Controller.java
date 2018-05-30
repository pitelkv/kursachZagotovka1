package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    ResourceBundle resources;

    @FXML
    URL location;

    @FXML
    Button ButtReg;{

    }

    @FXML
    void initialize() {
    }

    @FXML
    TextField TextLable;

    @FXML
    Label LabelShow;

    public void buttonclick(){
        String qwe;
        qwe = TextLable.getText();
        LabelShow.setText(qwe);
    }



}