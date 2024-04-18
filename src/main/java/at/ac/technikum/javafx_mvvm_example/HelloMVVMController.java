package at.ac.technikum.javafx_mvvm_example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloMVVMController {
    @FXML
    private Label label;

    private ViewModel viewModel;

    public void initialize() {
        // Initialize the model and view model
        Model model = new Model();
        viewModel = new ViewModel(model);

        // Bind the label text property to the message property of the view model
        label.textProperty().bind(viewModel.messageProperty());
    }

    @FXML
    private void changeMessage() {
        // Update the message in the view model
        viewModel.updateMessage("New Message");
    }
}