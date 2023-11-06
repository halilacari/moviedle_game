package com.example.moviedle_game;

import java.io.IOException;
import java.util.Random;

public class RandomGenerator {


    public int random_number(int number_of_movies){

        Random r = new Random();
        int  x = r.nextInt(number_of_movies);
        int generated_number =x;
        return generated_number;
    }

    public static void main(String[] args) throws IOException {

    }

}
