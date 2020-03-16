package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
    private CheckBox addBookAvailable;

    @FXML
    void initialize() {
        AddBookWindowAddButton.setOnAction(event -> {
            String addButtonBookNameText = addBookName.getText().trim();
            String addButtonBookAuthorText = addBookAuthor.getText().trim();
            String addButtonBookYearText = addBookYear.getText().trim();
            String addButtonBookYearAvailable = addBookAvailable.getText().trim();

            if(!addButtonBookNameText.equals("") && !addButtonBookAuthorText.equals("") &&
                    !addButtonBookYearText.equals(""))
                addBook(addButtonBookNameText,addButtonBookAuthorText,addButtonBookYearText,addButtonBookYearAvailable);
            else System.out.println("All fields are mandatory");

        });

    }

    private void addBook(String addButtonBookNameText,
                         String addButtonBookAuthorText,
                         String addButtonBookYearText,
                         String addButtonBookYearAvailable) {

    }
}
