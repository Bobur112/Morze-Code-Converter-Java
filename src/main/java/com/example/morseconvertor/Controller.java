package com.example.morseconvertor;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Button idButton;
    public TextArea idTextArea0;
    @FXML
    private TextArea idTextArea;

    List<String> morseCode = new ArrayList<>(Arrays.asList(".-", "-...", "-.-.", "-..",
            ".", "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--..",
            ".----",
            "..---",
            "...--",
            "....-",
            ".....",
            "-....",
            "--...",
            "---..",
            "----.",
            "-----"));

    List<String> chars = new ArrayList<>(Arrays.asList(
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "0"));


    String text;
    String text2 = "";
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        idButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                idButton.setDisable(true);


                text  = idTextArea0.getText();
                text = text.toLowerCase();
                for (int i = 0; i < text.length(); i++) {
                    for (int j = 0; j < chars.size(); j++) {
                        if (text.charAt(i) == chars.get(j).charAt(0)) {
                 text2+=morseCode.get(j) + "   ";
                            idTextArea.setText(text2);
                        }
                    }
                }
                idButton.setDisable(false);
            }
        });

    }
}
