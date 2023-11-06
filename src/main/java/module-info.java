module com.example.moviedle_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moviedle_game to javafx.fxml;
    exports com.example.moviedle_game;
}