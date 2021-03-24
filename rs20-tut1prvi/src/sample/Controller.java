package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label zaLabel;

    public void pokaziTekst(ActionEvent actionEvent) {

        zaLabel.setText("Hello World");
    }
}
