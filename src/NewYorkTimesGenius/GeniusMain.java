package NewYorkTimesGenius;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GeniusMain extends Application {

    public static String letter1, letter2, letter3, letter4, letter5, letter6, letter7;
    public static String[] wordlist;

    @Override
    public void start(Stage primaryyStage) throws FileNotFoundException {
        letter1 = "L1";
        letter2 = "L2";
        letter3 = "L3";
        letter4 = "L4";
        letter5 = "L5";
        letter6 = "L6";
        letter7 = "L7";

        wordlist = null;
        List<String> itemsSchool = new ArrayList<String>();

        try
        {
            FileInputStream fstream_school = new FileInputStream("src/NewYorkTimesGenius/dictionaryforgenius.txt");
            DataInputStream data_input = new DataInputStream(fstream_school);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(data_input));
            String str_line;

            while ((str_line = buffer.readLine()) != null)
            {
                str_line = str_line.trim();
                if ((str_line.length()!=0))
                {
                    itemsSchool.add(str_line);
                }
            }

            wordlist = (String[])itemsSchool.toArray(new String[itemsSchool.size()]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene letterpicker = new Scene(new LetterPicker(), LetterPicker.WIDTH, LetterPicker.HEIGHT);
        primaryyStage.setTitle("New York Times Genius");
        primaryyStage.setScene(letterpicker);

        primaryyStage.centerOnScreen();
        primaryyStage.show();
        primaryyStage.setResizable(false);

    }
}
