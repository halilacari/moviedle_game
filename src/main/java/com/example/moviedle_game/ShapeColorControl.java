package com.example.moviedle_game;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

import java.io.IOException;

public class ShapeColorControl {

    public ShapeColorControl() throws IOException {
    }


    public void isColor(Shape input_Shape, boolean truth){
        if(truth == true){
            input_Shape.setFill(Color.GREEN);
        }
        else input_Shape.setFill(Color.RED);
    }


    public static void main(String[] args) {

    }
}
