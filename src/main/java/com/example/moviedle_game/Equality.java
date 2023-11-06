package com.example.moviedle_game;

import java.io.IOException;

public class Equality {


        Fragmentation fragment = new Fragmentation();

        public Equality() throws IOException {
        }



        public Boolean isEqual(int input_movies_no,int selected_movies_no ,int property) throws IOException {
            boolean movie_Property;

            if (fragment.movies_fragment_properties(input_movies_no,property).equalsIgnoreCase(fragment.movies_fragment_properties(selected_movies_no,property))) {
                movie_Property = true;
            } else {
                movie_Property = false;
            }

            return movie_Property;
        }

        public static void main(String[] args) {

        }





}
