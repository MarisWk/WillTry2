package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddBookWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField addBookName;

    @FXML
    private TextField addBookAuthor;

    @FXML
    private TextField addBookYear;

    @FXML
    private Button AddBookWindowAddButton;

    @FXML
    private Button AddBookWindowCancelButton;

    @FXML
    void initialize() {


    }
}
