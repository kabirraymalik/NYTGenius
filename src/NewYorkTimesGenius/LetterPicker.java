package NewYorkTimesGenius;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class LetterPicker extends AnchorPane {
    public static final int WIDTH = 750;
    public static final int HEIGHT = 400;
    Text L1, L2, L3, L4, L5, L6, L7;
    public String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public String[] updatedAlphabet = new String[19];
    public LetterPicker (){

        Canvas canvas = new Canvas(WIDTH, HEIGHT);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.setLineWidth(20);
        gc.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 30));
        gc.fillText("Input Letters In Order (Central letter first)",100,75);

        L1 = new Text();
        L1.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 24));
        L1.setFill(Color.BLACK);
        L1.setTranslateX(50);
        L1.setTranslateY(250);

        L2 = new Text();
        L2.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 24));
        L2.setFill(Color.BLACK);
        L2.setTranslateX(150);
        L2.setTranslateY(250);

        L3 = new Text();
        L3.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 24));
        L3.setFill(Color.BLACK);
        L3.setTranslateX(250);
        L3.setTranslateY(250);

        L4 = new Text();
        L4.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 24));
        L4.setFill(Color.BLACK);
        L4.setTranslateX(350);
        L4.setTranslateY(250);

        L5 = new Text();
        L5.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 24));
        L5.setFill(Color.BLACK);
        L5.setTranslateX(450);
        L5.setTranslateY(250);

        L6 = new Text();
        L6.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 24));
        L6.setFill(Color.BLACK);
        L6.setTranslateX(550);
        L6.setTranslateY(250);

        L7 = new Text();
        L7.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 24));
        L7.setFill(Color.BLACK);
        L7.setTranslateX(650);
        L7.setTranslateY(250);

        updateValues();
        
        this.getChildren().addAll(canvas,L1,L2,L3,L4,L5,L6,L7);

        canvas.setFocusTraversable(true);
        canvas.requestFocus();
        canvas.setOnKeyPressed(e ->
        {
            if (!GeniusMain.letter1.equals("L1") && !GeniusMain.letter2.equals("L2") && !GeniusMain.letter3.equals("L3") && !GeniusMain.letter4.equals("L4") && !GeniusMain.letter5.equals("L5") && !GeniusMain.letter6.equals("L6")){
                if(e.getCode()==KeyCode.A){
                    GeniusMain.letter7 = "a";
                }
                if(e.getCode()==KeyCode.B){
                    GeniusMain.letter7 = "b";
                }
                if(e.getCode()==KeyCode.C){
                    GeniusMain.letter7 = "c";
                }
                if(e.getCode()==KeyCode.D){
                    GeniusMain.letter7 = "d";
                }
                if(e.getCode()==KeyCode.E){
                    GeniusMain.letter7 = "e";
                }
                if(e.getCode()==KeyCode.F){
                    GeniusMain.letter7 = "f";
                }
                if(e.getCode()==KeyCode.G){
                    GeniusMain.letter7 = "g";
                }
                if(e.getCode()==KeyCode.H){
                    GeniusMain.letter7 = "h";
                }
                if(e.getCode()==KeyCode.I){
                    GeniusMain.letter7 = "i";
                }
                if(e.getCode()==KeyCode.J){
                    GeniusMain.letter7 = "j";
                }
                if(e.getCode()==KeyCode.K){
                    GeniusMain.letter7 = "k";
                }
                if(e.getCode()==KeyCode.L){
                    GeniusMain.letter7 = "l";
                }
                if(e.getCode()==KeyCode.M){
                    GeniusMain.letter7 = "m";
                }
                if(e.getCode()==KeyCode.N){
                    GeniusMain.letter7 = "n";
                }
                if(e.getCode()==KeyCode.O){
                    GeniusMain.letter7 = "o";
                }
                if(e.getCode()==KeyCode.P){
                    GeniusMain.letter7 = "p";
                }
                if(e.getCode()==KeyCode.Q){
                    GeniusMain.letter7 = "q";
                }
                if(e.getCode()==KeyCode.R){
                    GeniusMain.letter7 = "r";
                }
                if(e.getCode()==KeyCode.S){
                    GeniusMain.letter7 = "s";
                }
                if(e.getCode()==KeyCode.T){
                    GeniusMain.letter7 = "t";
                }
                if(e.getCode()==KeyCode.U){
                    GeniusMain.letter7 = "u";
                }
                if(e.getCode()==KeyCode.V){
                    GeniusMain.letter7 = "v";
                }
                if(e.getCode()==KeyCode.W){
                    GeniusMain.letter7 = "w";
                }
                if(e.getCode()==KeyCode.X){
                    GeniusMain.letter7 = "x";
                }
                if(e.getCode()==KeyCode.Y){
                    GeniusMain.letter7 = "y";
                }
                if(e.getCode()==KeyCode.Z){
                    GeniusMain.letter7 = "z";
                }
                updateValues();
                checkWords();
            }
            else if (!GeniusMain.letter1.equals("L1") && !GeniusMain.letter2.equals("L2") && !GeniusMain.letter3.equals("L3") && !GeniusMain.letter4.equals("L4") && !GeniusMain.letter5.equals("L5")){

                if(e.getCode()==KeyCode.A){
                    GeniusMain.letter6 = "a";
                }
                if(e.getCode()==KeyCode.B){
                    GeniusMain.letter6 = "b";
                }
                if(e.getCode()==KeyCode.C){
                    GeniusMain.letter6 = "c";
                }
                if(e.getCode()==KeyCode.D){
                    GeniusMain.letter6 = "d";
                }
                if(e.getCode()==KeyCode.E){
                    GeniusMain.letter6 = "e";
                }
                if(e.getCode()==KeyCode.F){
                    GeniusMain.letter6 = "f";
                }
                if(e.getCode()==KeyCode.G){
                    GeniusMain.letter6 = "g";
                }
                if(e.getCode()==KeyCode.H){
                    GeniusMain.letter6 = "h";
                }
                if(e.getCode()==KeyCode.I){
                    GeniusMain.letter6 = "i";
                }
                if(e.getCode()==KeyCode.J){
                    GeniusMain.letter6 = "j";
                }
                if(e.getCode()==KeyCode.K){
                    GeniusMain.letter6 = "k";
                }
                if(e.getCode()==KeyCode.L){
                    GeniusMain.letter6 = "l";
                }
                if(e.getCode()==KeyCode.M){
                    GeniusMain.letter6 = "m";
                }
                if(e.getCode()==KeyCode.N){
                    GeniusMain.letter6 = "n";
                }
                if(e.getCode()==KeyCode.O){
                    GeniusMain.letter6 = "o";
                }
                if(e.getCode()==KeyCode.P){
                    GeniusMain.letter6 = "p";
                }
                if(e.getCode()==KeyCode.Q){
                    GeniusMain.letter6 = "q";
                }
                if(e.getCode()==KeyCode.R){
                    GeniusMain.letter6 = "r";
                }
                if(e.getCode()==KeyCode.S){
                    GeniusMain.letter6 = "s";
                }
                if(e.getCode()==KeyCode.T){
                    GeniusMain.letter6 = "t";
                }
                if(e.getCode()==KeyCode.U){
                    GeniusMain.letter6 = "u";
                }
                if(e.getCode()==KeyCode.V){
                    GeniusMain.letter6 = "v";
                }
                if(e.getCode()==KeyCode.W){
                    GeniusMain.letter6 = "w";
                }
                if(e.getCode()==KeyCode.X){
                    GeniusMain.letter6 = "x";
                }
                if(e.getCode()==KeyCode.Y){
                    GeniusMain.letter6 = "y";
                }
                if(e.getCode()==KeyCode.Z){
                    GeniusMain.letter6 = "z";
                }
                updateValues();
            }
            else if (!GeniusMain.letter1.equals("L1") && !GeniusMain.letter2.equals("L2") && !GeniusMain.letter3.equals("L3") && !GeniusMain.letter4.equals("L4")){

                if(e.getCode()==KeyCode.A){
                    GeniusMain.letter5 = "a";
                }
                if(e.getCode()==KeyCode.B){
                    GeniusMain.letter5 = "b";
                }
                if(e.getCode()==KeyCode.C){
                    GeniusMain.letter5 = "c";
                }
                if(e.getCode()==KeyCode.D){
                    GeniusMain.letter5 = "d";
                }
                if(e.getCode()==KeyCode.E){
                    GeniusMain.letter5 = "e";
                }
                if(e.getCode()==KeyCode.F){
                    GeniusMain.letter5 = "f";
                }
                if(e.getCode()==KeyCode.G){
                    GeniusMain.letter5 = "g";
                }
                if(e.getCode()==KeyCode.H){
                    GeniusMain.letter5 = "h";
                }
                if(e.getCode()==KeyCode.I){
                    GeniusMain.letter5 = "i";
                }
                if(e.getCode()==KeyCode.J){
                    GeniusMain.letter5 = "j";
                }
                if(e.getCode()==KeyCode.K){
                    GeniusMain.letter5 = "k";
                }
                if(e.getCode()==KeyCode.L){
                    GeniusMain.letter5 = "l";
                }
                if(e.getCode()==KeyCode.M){
                    GeniusMain.letter5 = "m";
                }
                if(e.getCode()==KeyCode.N){
                    GeniusMain.letter5 = "n";
                }
                if(e.getCode()==KeyCode.O){
                    GeniusMain.letter5 = "o";
                }
                if(e.getCode()==KeyCode.P){
                    GeniusMain.letter5 = "p";
                }
                if(e.getCode()==KeyCode.Q){
                    GeniusMain.letter5 = "q";
                }
                if(e.getCode()==KeyCode.R){
                    GeniusMain.letter5 = "r";
                }
                if(e.getCode()==KeyCode.S){
                    GeniusMain.letter5 = "s";
                }
                if(e.getCode()==KeyCode.T){
                    GeniusMain.letter5 = "t";
                }
                if(e.getCode()==KeyCode.U){
                    GeniusMain.letter5 = "u";
                }
                if(e.getCode()==KeyCode.V){
                    GeniusMain.letter5 = "v";
                }
                if(e.getCode()==KeyCode.W){
                    GeniusMain.letter5 = "w";
                }
                if(e.getCode()==KeyCode.X){
                    GeniusMain.letter5 = "x";
                }
                if(e.getCode()==KeyCode.Y){
                    GeniusMain.letter5 = "y";
                }
                if(e.getCode()==KeyCode.Z){
                    GeniusMain.letter5 = "z";
                }
                updateValues();
            }
            else if (!GeniusMain.letter1.equals("L1") && !GeniusMain.letter2.equals("L2") && !GeniusMain.letter3.equals("L3")){

                if(e.getCode()==KeyCode.A){
                    GeniusMain.letter4 = "a";
                }
                if(e.getCode()==KeyCode.B){
                    GeniusMain.letter4 = "b";
                }
                if(e.getCode()==KeyCode.C){
                    GeniusMain.letter4 = "c";
                }
                if(e.getCode()==KeyCode.D){
                    GeniusMain.letter4 = "d";
                }
                if(e.getCode()==KeyCode.E){
                    GeniusMain.letter4 = "e";
                }
                if(e.getCode()==KeyCode.F){
                    GeniusMain.letter4 = "f";
                }
                if(e.getCode()==KeyCode.G){
                    GeniusMain.letter4 = "g";
                }
                if(e.getCode()==KeyCode.H){
                    GeniusMain.letter4 = "h";
                }
                if(e.getCode()==KeyCode.I){
                    GeniusMain.letter4 = "i";
                }
                if(e.getCode()==KeyCode.J){
                    GeniusMain.letter4 = "j";
                }
                if(e.getCode()==KeyCode.K){
                    GeniusMain.letter4 = "k";
                }
                if(e.getCode()==KeyCode.L){
                    GeniusMain.letter4 = "l";
                }
                if(e.getCode()==KeyCode.M){
                    GeniusMain.letter4 = "m";
                }
                if(e.getCode()==KeyCode.N){
                    GeniusMain.letter4 = "n";
                }
                if(e.getCode()==KeyCode.O){
                    GeniusMain.letter4 = "o";
                }
                if(e.getCode()==KeyCode.P){
                    GeniusMain.letter4 = "p";
                }
                if(e.getCode()==KeyCode.Q){
                    GeniusMain.letter4 = "q";
                }
                if(e.getCode()==KeyCode.R){
                    GeniusMain.letter4 = "r";
                }
                if(e.getCode()==KeyCode.S){
                    GeniusMain.letter4 = "s";
                }
                if(e.getCode()==KeyCode.T){
                    GeniusMain.letter4 = "t";
                }
                if(e.getCode()==KeyCode.U){
                    GeniusMain.letter4 = "u";
                }
                if(e.getCode()==KeyCode.V){
                    GeniusMain.letter4 = "v";
                }
                if(e.getCode()==KeyCode.W){
                    GeniusMain.letter4 = "w";
                }
                if(e.getCode()==KeyCode.X){
                    GeniusMain.letter4 = "x";
                }
                if(e.getCode()==KeyCode.Y){
                    GeniusMain.letter4 = "y";
                }
                if(e.getCode()==KeyCode.Z){
                    GeniusMain.letter4 = "z";
                }
                updateValues();
            }
            else if (!GeniusMain.letter1.equals("L1") && !GeniusMain.letter2.equals("L2")) {

                if(e.getCode()==KeyCode.A){
                    GeniusMain.letter3 = "a";
                }
                if(e.getCode()==KeyCode.B){
                    GeniusMain.letter3 = "b";
                }
                if(e.getCode()==KeyCode.C){
                    GeniusMain.letter3 = "c";
                }
                if(e.getCode()==KeyCode.D){
                    GeniusMain.letter3 = "d";
                }
                if(e.getCode()==KeyCode.E){
                    GeniusMain.letter3 = "e";
                }
                if(e.getCode()==KeyCode.F){
                    GeniusMain.letter3 = "f";
                }
                if(e.getCode()==KeyCode.G){
                    GeniusMain.letter3 = "g";
                }
                if(e.getCode()==KeyCode.H){
                    GeniusMain.letter3 = "h";
                }
                if(e.getCode()==KeyCode.I){
                    GeniusMain.letter3 = "i";
                }
                if(e.getCode()==KeyCode.J){
                    GeniusMain.letter3 = "j";
                }
                if(e.getCode()==KeyCode.K){
                    GeniusMain.letter3 = "k";
                }
                if(e.getCode()==KeyCode.L){
                    GeniusMain.letter3 = "l";
                }
                if(e.getCode()==KeyCode.M){
                    GeniusMain.letter3 = "m";
                }
                if(e.getCode()==KeyCode.N){
                    GeniusMain.letter3 = "n";
                }
                if(e.getCode()==KeyCode.O){
                    GeniusMain.letter3 = "o";
                }
                if(e.getCode()==KeyCode.P){
                    GeniusMain.letter3 = "p";
                }
                if(e.getCode()==KeyCode.Q){
                    GeniusMain.letter3 = "q";
                }
                if(e.getCode()==KeyCode.R){
                    GeniusMain.letter3 = "r";
                }
                if(e.getCode()==KeyCode.S){
                    GeniusMain.letter3 = "s";
                }
                if(e.getCode()==KeyCode.T){
                    GeniusMain.letter3 = "t";
                }
                if(e.getCode()==KeyCode.U){
                    GeniusMain.letter3 = "u";
                }
                if(e.getCode()==KeyCode.V){
                    GeniusMain.letter3 = "v";
                }
                if(e.getCode()==KeyCode.W){
                    GeniusMain.letter3 = "w";
                }
                if(e.getCode()==KeyCode.X){
                    GeniusMain.letter3 = "x";
                }
                if(e.getCode()==KeyCode.Y){
                    GeniusMain.letter3 = "y";
                }
                if(e.getCode()==KeyCode.Z){
                    GeniusMain.letter3 = "z";
                }
                updateValues();
            }
            else if (!GeniusMain.letter1.equals("L1")){

                if(e.getCode()==KeyCode.A){
                    GeniusMain.letter2 = "a";
                }
                if(e.getCode()==KeyCode.B){
                    GeniusMain.letter2 = "b";
                }
                if(e.getCode()==KeyCode.C){
                    GeniusMain.letter2 = "c";
                }
                if(e.getCode()==KeyCode.D){
                    GeniusMain.letter2 = "d";
                }
                if(e.getCode()==KeyCode.E){
                    GeniusMain.letter2 = "e";
                }
                if(e.getCode()==KeyCode.F){
                    GeniusMain.letter2 = "f";
                }
                if(e.getCode()==KeyCode.G){
                    GeniusMain.letter2 = "g";
                }
                if(e.getCode()==KeyCode.H){
                    GeniusMain.letter2 = "h";
                }
                if(e.getCode()==KeyCode.I){
                    GeniusMain.letter2 = "i";
                }
                if(e.getCode()==KeyCode.J){
                    GeniusMain.letter2 = "j";
                }
                if(e.getCode()==KeyCode.K){
                    GeniusMain.letter2 = "k";
                }
                if(e.getCode()==KeyCode.L){
                    GeniusMain.letter2 = "l";
                }
                if(e.getCode()==KeyCode.M){
                    GeniusMain.letter2 = "m";
                }
                if(e.getCode()==KeyCode.N){
                    GeniusMain.letter2 = "n";
                }
                if(e.getCode()==KeyCode.O){
                    GeniusMain.letter2 = "o";
                }
                if(e.getCode()==KeyCode.P){
                    GeniusMain.letter2 = "p";
                }
                if(e.getCode()==KeyCode.Q){
                    GeniusMain.letter2 = "q";
                }
                if(e.getCode()==KeyCode.R){
                    GeniusMain.letter2 = "r";
                }
                if(e.getCode()==KeyCode.S){
                    GeniusMain.letter2 = "s";
                }
                if(e.getCode()==KeyCode.T){
                    GeniusMain.letter2 = "t";
                }
                if(e.getCode()==KeyCode.U){
                    GeniusMain.letter2 = "u";
                }
                if(e.getCode()==KeyCode.V){
                    GeniusMain.letter2 = "v";
                }
                if(e.getCode()==KeyCode.W){
                    GeniusMain.letter2 = "w";
                }
                if(e.getCode()==KeyCode.X){
                    GeniusMain.letter2 = "x";
                }
                if(e.getCode()==KeyCode.Y){
                    GeniusMain.letter2 = "y";
                }
                if(e.getCode()==KeyCode.Z){
                    GeniusMain.letter2 = "z";
                }
                updateValues();
            }
            else{

                if(e.getCode()==KeyCode.A){
                    GeniusMain.letter1 = "a";
                }
                if(e.getCode()==KeyCode.B){
                    GeniusMain.letter1 = "b";
                }
                if(e.getCode()==KeyCode.C){
                    GeniusMain.letter1 = "c";
                }
                if(e.getCode()==KeyCode.D){
                    GeniusMain.letter1 = "d";
                }
                if(e.getCode()==KeyCode.E){
                    GeniusMain.letter1 = "e";
                }
                if(e.getCode()==KeyCode.F){
                    GeniusMain.letter1 = "f";
                }
                if(e.getCode()==KeyCode.G){
                    GeniusMain.letter1 = "g";
                }
                if(e.getCode()==KeyCode.H){
                    GeniusMain.letter1 = "h";
                }
                if(e.getCode()==KeyCode.I){
                    GeniusMain.letter1 = "i";
                }
                if(e.getCode()==KeyCode.J){
                    GeniusMain.letter1 = "j";
                }
                if(e.getCode()==KeyCode.K){
                    GeniusMain.letter1 = "k";
                }
                if(e.getCode()==KeyCode.L){
                    GeniusMain.letter1 = "l";
                }
                if(e.getCode()==KeyCode.M){
                    GeniusMain.letter1 = "m";
                }
                if(e.getCode()==KeyCode.N){
                    GeniusMain.letter1 = "n";
                }
                if(e.getCode()==KeyCode.O){
                    GeniusMain.letter1 = "o";
                }
                if(e.getCode()==KeyCode.P){
                    GeniusMain.letter1 = "p";
                }
                if(e.getCode()==KeyCode.Q){
                    GeniusMain.letter1 = "q";
                }
                if(e.getCode()==KeyCode.R){
                    GeniusMain.letter1 = "r";
                }
                if(e.getCode()==KeyCode.S){
                    GeniusMain.letter1 = "s";
                }
                if(e.getCode()==KeyCode.T){
                    GeniusMain.letter1 = "t";
                }
                if(e.getCode()==KeyCode.U){
                    GeniusMain.letter1 = "u";
                }
                if(e.getCode()==KeyCode.V){
                    GeniusMain.letter1 = "v";
                }
                if(e.getCode()==KeyCode.W){
                    GeniusMain.letter1 = "w";
                }
                if(e.getCode()==KeyCode.X){
                    GeniusMain.letter1 = "x";
                }
                if(e.getCode()==KeyCode.Y){
                    GeniusMain.letter1 = "y";
                }
                if(e.getCode()==KeyCode.Z){
                    GeniusMain.letter1 = "z";
                }
                updateValues();
            }
        });
    }
    private void updateValues(){
        L1.setText(GeniusMain.letter1);
        L2.setText(GeniusMain.letter2);
        L3.setText(GeniusMain.letter3);
        L4.setText(GeniusMain.letter4);
        L5.setText(GeniusMain.letter5);
        L6.setText(GeniusMain.letter6);
        L7.setText(GeniusMain.letter7);
    }
    private void checkWords(){
        int o = 0;
        int a = 0;
        int z = 1;
        int test = 1;
        int test2 = 1;
        int test3 = 1;
        for(int i = 0; i< alphabet.length; i++){
            System.err.println("test: "+test);
            test++;
            if(!alphabet[i].equals(GeniusMain.letter1) && !alphabet[i].equals(GeniusMain.letter2) &&!alphabet[i].equals(GeniusMain.letter3)&&!alphabet[i].equals(GeniusMain.letter4)&&!alphabet[i].equals(GeniusMain.letter5)&&!alphabet[i].equals(GeniusMain.letter6)&&!alphabet[i].equals(GeniusMain.letter7)){
                updatedAlphabet[o] = alphabet[i];
                System.err.println("test2: "+test2);
                test2++;
                o++;
            }

        }
        for(int i = 0; i<GeniusMain.wordlist.length; i++){
            System.err.println("test3: "+test3);
            test3++;
            if (GeniusMain.wordlist[i].contains(GeniusMain.letter1)){
                for (int y = 0; y<updatedAlphabet.length; y++) {
                    if (!GeniusMain.wordlist[i].contains(updatedAlphabet[y])) {
                        a++;
                    }
                }
                if(a==19){
                    System.err.println(z+": "+GeniusMain.wordlist[i]);
                    z++;
                    a=0;
                }
            }
        }

    }
}
