package at.ac.technikum.javafx_mvvm_example;

import javafx.beans.property.StringProperty;

public class ViewModel {

    private Model model;

    public ViewModel(Model model) {
        this.model = model;
    }

    // Expose message property from Model
    public StringProperty messageProperty() {
        return model.messageProperty();
    }

    // Method to update message in Model
    public void updateMessage(String newMessage) {
        model.setMessage(newMessage);
    }
}
