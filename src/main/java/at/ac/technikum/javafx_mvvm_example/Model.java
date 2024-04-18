package at.ac.technikum.javafx_mvvm_example;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

    private StringProperty message = new SimpleStringProperty("Hello, World!");

    // Getter for message property
    public String getMessage() {
        return message.get();
    }

    // Setter for message property
    public void setMessage(String message) {
        this.message.set(message);
    }

    // Getter for message property (as StringProperty)
    public StringProperty messageProperty() {
        return message;
    }
}