module root.jeopardygame {
    requires javafx.controls;
    requires javafx.fxml;


    opens root.jeopardygame to javafx.fxml;
    exports root.jeopardygame;
}