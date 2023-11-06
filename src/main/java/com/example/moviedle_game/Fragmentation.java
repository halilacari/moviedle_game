package com.example.moviedle_game;

import java.io.IOException;


    public class Fragmentation {


        Reader reader = new Reader();



        public static void main(String[] args) throws IOException {

        }

        public String movies_fragment_properties(int movie_number,int property) throws IOException {
            String movies[] = reader.FileRead();
            String[] movie_properties = new String[8];
            String asking_property;

            movie_properties = movies[movie_number].split(",");
            asking_property = movie_properties[property];
            return asking_property;
        }

        public String[] movies_name() throws IOException {
            String movies[] = reader.FileRead();
            String movies_name_taker[];
            String movies_name[] = new String[252];
            int i=0;
            while (i<=250){
                movies_name_taker = movies[i].split(",");
                movies_name[i] = movies_name_taker[1];
                i++;
            }
            return movies_name;
        }

        public int input_movie_no(String input_movie) throws IOException {
            int movies_number;
            boolean availability = false;
            String movies[] = movies_name();

            int i = 1;
            while (i <= 250) {
                if (movies[i].equalsIgnoreCase(input_movie)) {
                    availability = true;
                    break;

                }
                i++;
            }
            if (availability) {
                movies_number = i;
            } else movies_number = 0;
            return movies_number;

        }

        public int movies_fragment_year(int movie_number) throws IOException {
            String movies[] = reader.FileRead();
            String[] movie_properties = new String[8];
            String year_property;
            int asking_property;

            movie_properties = movies[movie_number].split(",");
            year_property = movie_properties[2];
            asking_property= Integer.parseInt(year_property.trim());
            return asking_property;
        }


    }


