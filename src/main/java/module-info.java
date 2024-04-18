module at.ac.technikum.javafx_mvvm_example {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens at.ac.technikum.javafx_mvvm_example to javafx.fxml;
    exports at.ac.technikum.javafx_mvvm_example;
}