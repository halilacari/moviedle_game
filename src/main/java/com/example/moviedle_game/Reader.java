package com.example.moviedle_game;

import java.io.*;
import java.util.Arrays;

public class Reader {
    public String[] FileRead() throws IOException {

        String dosyaYolu = "com/example/moviedle_game/imdb_top_250.csv";
        String[] fragmentation_movie = new String[251];
        /*DOSYA OKUMA*/

        File dosya = new File(dosyaYolu);

        BufferedReader oku = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(dosya), "UTF8"));
        int i = 0;
        String str;
        while ((str = oku.readLine()) != null) {        // satır satır okuma yapar
            //    System.out.println(str);                    //filmleri yazdırır
            fragmentation_movie[i] = Arrays.toString(str.split(";"));  // satır satır filmleri böler ve diziye atar.
            System.out.println(fragmentation_movie[i]); // bölünmüş filmleri yazdırır.
            i++;
        }
        System.out.println("\n\n");

        return fragmentation_movie;
    }


}
