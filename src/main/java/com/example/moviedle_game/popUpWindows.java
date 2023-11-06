package com.example.moviedle_game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class popUpWindows {


    public void GameOverWinPopUp() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameOverWinPopUp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("!!!Congratulations!!! !!!Game Over!!!");
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void GameOverLosePopUp() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameOverLosePopUp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("!!!You Lost Game Over!!!");
        stage.setScene(scene);
        stage.showAndWait();

    }

    public void dontFindNamePopUp() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DontFindNamePopUp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("!!!SORRY!!!");
        stage.setScene(scene);
        stage.showAndWait();


    }
}
