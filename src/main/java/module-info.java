module dyinglight2.dl2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dyinglight2.dl2 to javafx.fxml;
    exports dyinglight2.dl2;
}