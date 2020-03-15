package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button mainAddBookButton;

    @FXML
    void initialize() {
        mainAddBookButton.setOnAction(event -> {
            System.out.println("Hello World!");
        });

    }
}
