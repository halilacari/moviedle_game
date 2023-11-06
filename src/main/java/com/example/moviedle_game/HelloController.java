package com.example.moviedle_game;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {


    popUpWindows popUps = new popUpWindows();
    Stage stage_wrongPopupMainPane = new Stage();
    Stage stage_winPopupMainPane = new Stage();
    Stage stage_losePopupMainPane = new Stage();

    ShapeColorControl color = new ShapeColorControl();
    Fragmentation fragment = new Fragmentation();
    Equality equality = new Equality();
    RandomGenerator randomGenerator = new RandomGenerator();

    Reader reader = new Reader();

    public HelloController() throws IOException {
    }

    @FXML
    private AnchorPane winpopUpMainPane;

    @FXML
    private AnchorPane losepopUpMainPane;

    @FXML
    private AnchorPane wrongPopUpMainPane;




    @FXML
    private Pane Pane_1;

    @FXML
    private Pane Pane_2;

    @FXML
    private Pane Pane_3;

    @FXML
    private Pane Pane_4;

    @FXML
    private Pane Pane_5;




    @FXML
    private Text directorMovieText;

    @FXML
    private Text directorMovieText2;

    @FXML
    private Text directorMovieText3;

    @FXML
    private Text directorMovieText4;

    @FXML
    private Text directorMovieText5;




    @FXML
    private Rectangle directorPanelRectangle;

    @FXML
    private Rectangle directorPanelRectangle2;

    @FXML
    private Rectangle directorPanelRectangle3;

    @FXML
    private Rectangle directorPanelRectangle4;

    @FXML
    private Rectangle directorPanelRectangle5;




    @FXML
    private Text genreMovieText;

    @FXML
    private Text genreMovieText2;

    @FXML
    private Text genreMovieText3;

    @FXML
    private Text genreMovieText4;

    @FXML
    private Text genreMovieText5;





    @FXML
    private Rectangle genrePanelRectangle;

    @FXML
    private Rectangle genrePanelRectangle2;

    @FXML
    private Rectangle genrePanelRectangle3;

    @FXML
    private Rectangle genrePanelRectangle4;

    @FXML
    private Rectangle genrePanelRectangle5;

    @FXML
    private Rectangle namePanelRectangle;

    @FXML
    private Rectangle namePanelRectangle2;

    @FXML
    private Rectangle namePanelRectangle3;

    @FXML
    private Rectangle namePanelRectangle4;

    @FXML
    private Rectangle namePanelRectangle5;




    @FXML
    private TextField inputGuessTxtFld;





    @FXML
    private Text nameMovieText;

    @FXML
    private Text nameMovieText2;

    @FXML
    private Text nameMovieText3;

    @FXML
    private Text nameMovieText4;

    @FXML
    private Text nameMovieText5;

    @FXML
    private Text originMovieText;

    @FXML
    private Text originMovieText2;

    @FXML
    private Text originMovieText3;

    @FXML
    private Text originMovieText4;

    @FXML
    private Text originMovieText5;





    @FXML
    private Rectangle originPanelRectangle;

    @FXML
    private Rectangle originPanelRectangle2;

    @FXML
    private Rectangle originPanelRectangle3;

    @FXML
    private Rectangle originPanelRectangle4;

    @FXML
    private Rectangle originPanelRectangle5;

    @FXML
    private Label remaining_trial_panel;

    @FXML
    private Text starMovieText;

    @FXML
    private Text starMovieText2;

    @FXML
    private Text starMovieText3;

    @FXML
    private Text starMovieText4;

    @FXML
    private Text starMovieText5;

    @FXML
    private Rectangle starPanelRectangle;

    @FXML
    private Rectangle starPanelRectangle2;

    @FXML
    private Rectangle starPanelRectangle3;

    @FXML
    private Rectangle starPanelRectangle4;

    @FXML
    private Rectangle starPanelRectangle5;

    @FXML
    private Button startButton;

    @FXML
    private Button guessButton;

    @FXML
    private Label yazilan;

    @FXML
    private Text yearMovieText;

    @FXML
    private Text yearMovieText2;

    @FXML
    private Text yearMovieText3;

    @FXML
    private Text yearMovieText4;

    @FXML
    private Text yearMovieText5;

    @FXML
    private Rectangle yearPanelRectangle;

    @FXML
    private Rectangle yearPanelRectangle2;

    @FXML
    private Rectangle yearPanelRectangle3;

    @FXML
    private Rectangle yearPanelRectangle4;

    @FXML
    private Rectangle yearPanelRectangle5;

    @FXML
    private ImageView upArrow1;

    @FXML
    private ImageView upArrow2;

    @FXML
    private ImageView upArrow3;

    @FXML
    private ImageView upArrow4;

    @FXML
    private ImageView upArrow5;

    @FXML
    private ImageView downarrow1;

    @FXML
    private ImageView downarrow2;

    @FXML
    private ImageView downarrow3;

    @FXML
    private ImageView downarrow4;

    @FXML
    private ImageView downarrow5;

    @FXML
    private ImageView equals1;

    @FXML
    private ImageView equals2;

    @FXML
    private ImageView equals3;

    @FXML
    private ImageView equals4;

    @FXML
    private ImageView equals5;

    int random_selected_film_number;
    int remaining_trial = 5;





    @FXML
    void onstartButtonClick(ActionEvent event) throws IOException {
        this.random_selected_film_number = randomGenerator.random_number(250);
        String[] movies = reader.FileRead();
        yazilan.setText("Game is Start!!!");
        System.out.println(movies[this.random_selected_film_number]);
        startButton.setDisable(true);
        guessButton.setDisable(false);

    }

    @FXML
    void onOkeyButtonClick(ActionEvent event) {
        stage_wrongPopupMainPane = (Stage) wrongPopUpMainPane.getScene().getWindow();
        stage_wrongPopupMainPane.close();
    }

    @FXML
    void onExitButtonClick(ActionEvent event) throws Exception {
        stage_winPopupMainPane = (Stage) winpopUpMainPane.getScene().getWindow();
        System.out.println("Exit the Win PopUp");
        stage_winPopupMainPane.close();
        Platform.exit();
    }

    @FXML
    void onExitButtonClick2(ActionEvent event) throws Exception {
        stage_losePopupMainPane = (Stage) losepopUpMainPane.getScene().getWindow();
        System.out.println("Exit the Win PopUp");
        stage_losePopupMainPane.close();
        Platform.exit();
    }

    @FXML
    void onSecretButtonClicked(ActionEvent event) throws Exception {

        System.out.println("gizli butona basıldı");
    }

    @FXML
    void onRestartButtonClick(ActionEvent event) throws Exception {
        stage_winPopupMainPane = (Stage) winpopUpMainPane.getScene().getWindow();
        System.out.println("Exit the Win PopUp");
        stage_winPopupMainPane.close();
    }

    @FXML
    void onRestartButtonClick2(ActionEvent event) throws Exception {
        stage_losePopupMainPane = (Stage) losepopUpMainPane.getScene().getWindow();
        System.out.println("Exit the Win PopUp");
        stage_losePopupMainPane.close();
    }

    @FXML
    void onGuessButtonClick(ActionEvent event) throws Exception {
        String input;
        input= inputGuessTxtFld.getText().trim();
        input = " " + input;

        if (remaining_trial > 0) {
            if (fragment.input_movie_no(input) != 0) {
                switch (this.remaining_trial) {
                    case 1:
                        //
                        color.isColor(namePanelRectangle5, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 1));
                        nameMovieText5.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 1));
                        color.isColor(yearPanelRectangle5, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 2));
                        yearMovieText5.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 2));
                        color.isColor(genrePanelRectangle5, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 3));
                        genreMovieText5.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 3));
                        color.isColor(originPanelRectangle5, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 4));
                        originMovieText5.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 4));
                        color.isColor(directorPanelRectangle5, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 5));
                        directorMovieText5.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 5));
                        color.isColor(starPanelRectangle5, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 6));
                        starMovieText5.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 6));
                        this.remaining_trial--;
                        remaining_trial_panel.setText("Remaining Trial :" + remaining_trial);
                        Pane_5.setVisible(true);
                        if (fragment.movies_fragment_year(fragment.input_movie_no(input)) < fragment.movies_fragment_year(this.random_selected_film_number)) {
                            upArrow5.setVisible(true);
                        } else if (fragment.movies_fragment_year(fragment.input_movie_no(input)) > fragment.movies_fragment_year(this.random_selected_film_number)) {
                            downarrow5.setVisible(true);
                        } else equals5.setVisible(true);
                        break;
                    case 2:
                        //
                        color.isColor(namePanelRectangle4, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 1));
                        nameMovieText4.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 1));
                        color.isColor(yearPanelRectangle4, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 2));
                        yearMovieText4.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 2));
                        color.isColor(genrePanelRectangle4, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 3));
                        genreMovieText4.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 3));
                        color.isColor(originPanelRectangle4, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 4));
                        originMovieText4.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 4));
                        color.isColor(directorPanelRectangle4, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 5));
                        directorMovieText4.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 5));
                        color.isColor(starPanelRectangle4, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 6));
                        starMovieText4.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 6));
                        this.remaining_trial--;
                        remaining_trial_panel.setText("Remaining Trial :" + remaining_trial);
                        Pane_4.setVisible(true);
                        if (fragment.movies_fragment_year(fragment.input_movie_no(input)) < fragment.movies_fragment_year(this.random_selected_film_number)) {
                            upArrow4.setVisible(true);
                        } else if (fragment.movies_fragment_year(fragment.input_movie_no(input)) > fragment.movies_fragment_year(this.random_selected_film_number)) {
                            downarrow4.setVisible(true);
                        } else equals4.setVisible(true);
                        break;
                    case 3:
                        //
                        color.isColor(namePanelRectangle3, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 1));
                        nameMovieText3.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 1));
                        color.isColor(yearPanelRectangle3, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 2));
                        yearMovieText3.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 2));
                        color.isColor(genrePanelRectangle3, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 3));
                        genreMovieText3.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 3));
                        color.isColor(originPanelRectangle3, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 4));
                        originMovieText3.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 4));
                        color.isColor(directorPanelRectangle3, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 5));
                        directorMovieText3.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 5));
                        color.isColor(starPanelRectangle3, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 6));
                        starMovieText3.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 6));
                        this.remaining_trial--;
                        remaining_trial_panel.setText("Remaining Trial :" + remaining_trial);
                        Pane_3.setVisible(true);
                        if (fragment.movies_fragment_year(fragment.input_movie_no(input)) < fragment.movies_fragment_year(this.random_selected_film_number)) {
                            upArrow3.setVisible(true);
                        } else if (fragment.movies_fragment_year(fragment.input_movie_no(input)) > fragment.movies_fragment_year(this.random_selected_film_number)) {
                            downarrow3.setVisible(true);
                        } else equals3.setVisible(true);
                        break;
                    case 4:
                        //
                        color.isColor(namePanelRectangle2, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 1));
                        nameMovieText2.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 1));
                        color.isColor(yearPanelRectangle2, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 2));
                        yearMovieText2.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 2));
                        color.isColor(genrePanelRectangle2, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 3));
                        genreMovieText2.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 3));
                        color.isColor(originPanelRectangle2, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 4));
                        originMovieText2.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 4));
                        color.isColor(directorPanelRectangle2, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 5));
                        directorMovieText2.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 5));
                        color.isColor(starPanelRectangle2, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 6));
                        starMovieText2.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 6));
                        this.remaining_trial--;
                        remaining_trial_panel.setText("Remaining Trial :" + remaining_trial);
                        Pane_2.setVisible(true);
                        if (fragment.movies_fragment_year(fragment.input_movie_no(input)) < fragment.movies_fragment_year(this.random_selected_film_number)) {
                            upArrow2.setVisible(true);
                        } else if (fragment.movies_fragment_year(fragment.input_movie_no(input)) > fragment.movies_fragment_year(this.random_selected_film_number)) {
                            downarrow2.setVisible(true);
                        }   else equals2.setVisible(true);

                        break;

                    case 5:
                        //   fragment.movies_fragment_properties(search.isMovieAvailable(this.input));
                        color.isColor(namePanelRectangle, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 1));
                        nameMovieText.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 1));
                        color.isColor(yearPanelRectangle, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 2));
                        yearMovieText.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 2));
                        color.isColor(genrePanelRectangle, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 3));
                        genreMovieText.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 3));
                        color.isColor(originPanelRectangle, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 4));
                        originMovieText.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 4));
                        color.isColor(directorPanelRectangle, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 5));
                        directorMovieText.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 5));
                        color.isColor(starPanelRectangle, equality.isEqual(fragment.input_movie_no(input), this.random_selected_film_number, 6));
                        starMovieText.setText(fragment.movies_fragment_properties(fragment.input_movie_no(input), 6));
                        this.remaining_trial--;
                        remaining_trial_panel.setText("Remaining Trial :" + remaining_trial);
                        Pane_1.setVisible(true);

                        if (fragment.movies_fragment_year(fragment.input_movie_no(input)) < fragment.movies_fragment_year(this.random_selected_film_number)) {
                            upArrow1.setVisible(true);
                        } else if (fragment.movies_fragment_year(fragment.input_movie_no(input)) > fragment.movies_fragment_year(this.random_selected_film_number)) {
                            downarrow1.setVisible(true);
                        } else equals1.setVisible(true);
                        break;
                }

                if (fragment.input_movie_no(input) == random_selected_film_number) {
                    System.out.println("kazandınız.");
                    //
                    //
                    //
                    boolean shower;
                    popUps.GameOverWinPopUp();
                    setRestart();

                } else if (fragment.input_movie_no(input) != random_selected_film_number && remaining_trial == 0) {
                    popUps.GameOverLosePopUp();
                    setRestart();
                }
            } else {
                popUps.dontFindNamePopUp();
                System.out.println("Film Listede Yok tekrar Deneyin pop-up");
            }

        }


    }


    public void setRestart() {
        startButton.setDisable(false);
        guessButton.setDisable(true);
        this.remaining_trial = 5;
        remaining_trial_panel.setText("Remaining Trial :" + remaining_trial);
        Pane_5.setVisible(false);
        Pane_4.setVisible(false);
        Pane_3.setVisible(false);
        Pane_2.setVisible(false);
        Pane_1.setVisible(false);
        upArrow1.setVisible(false);
        upArrow2.setVisible(false);
        upArrow3.setVisible(false);
        upArrow4.setVisible(false);
        upArrow5.setVisible(false);
        downarrow1.setVisible(false);
        downarrow2.setVisible(false);
        downarrow3.setVisible(false);
        downarrow4.setVisible(false);
        downarrow5.setVisible(false);
        equals1.setVisible(false);
        equals2.setVisible(false);
        equals3.setVisible(false);
        equals4.setVisible(false);
        equals5.setVisible(false);

    }
}