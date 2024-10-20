package com.osmig;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class alphabet {
    private static Map<Character, String[]> letters = new HashMap<>();

    public static void writeLetterToFile(String word) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));
        char[] splitWord = splitWord(word);
        String[] assembledAscii;

        int wordSize = splitWord.length;
//        String[] ascii_word = lowerCase(String.valueOf(splitWord[0]));
//        String[] ascii_word2 = lowerCase(String.valueOf(splitWord[1]));

//        int line_index = 0;
//        for(int num = 0; num <9; num++){
//            bufferedWriter.write(   ascii_word[num]+ "\n");
//
//
//        }
//        for(int num = 0; num <9; num++){
//            bufferedWriter.write(   ascii_word2[num]+ "\n");
//
//
//        }
//
//
//        bufferedWriter.close();
    }

    public static void writeWordToFile(String word) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));
        char[] splitWord = splitWord(word); // string to char array
        String[] newWord = new String[9];


        for(int i = 0; i< 9; i++){
            newWord[i] = "";
            for(char letter: splitWord) {
                                                                                    // 0 first letter
                // letter[0] add line [0]
                // letter[1] add line [0]
                // letter[2] add line [0]
                // letter[3] add line [0]
                // letter[4] add line [0]

                // String [] = [0] + "\n" +[1] + + "\n" [2] ...

                newWord[i] += letters.get(letter)[i];

            }
//            System.out.println(newWord[i]);
            bufferedWriter.write(newWord[i]);
            bufferedWriter.newLine();

        }
         bufferedWriter.close();

    }

    public static void printAscii() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        // read file w/ buffer
        String line;
        //bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
        //resetFile();
    }

    public static char[] splitWord(String s){
        char[] letters = s.toCharArray();
//        System.out.println(letters[0]);

        return letters;
    }

    public static void resetFile() throws IOException {
        BufferedWriter reset = new BufferedWriter(new FileWriter("text.txt"));
        reset.write("");
        reset.close();
    }


    public static void main(String[] args) throws IOException {
        //writeLetterToFile("he");
        // THE CURRENT FONT IS : LARRY 3D
        String[] a = {"        ", "        ", "   __   " , " /'__`\\ ", "/\\ \\L\\.\\_", "\\ \\__/.\\_\\", " \\/__/\\/_/", "          ", "          "};
        String[] b = {" __        " , "/\\ \\       " , "\\ \\ \\____   " , " \\ \\ '__`\\  " , "  \\ \\ \\L\\ \\ " , "   \\ \\_,__/ " , "    \\/___/  " , "           " , "           "};
        String[] c = {"        " , "        " , "  ___   " , " /'___\\" , "/\\ \\__/" , "\\ \\____\\" , " \\/____/" , "        " , "        "};
        String[] d = {"   __      " , "  /\\ \\     " , "  \\_\\ \\    " , "  /'_` \\   " , " /\\ \\L\\ \\  " , " \\ \\___,_\\ " , "  \\/__,_ / " , "           " , "           "};
        String[] e = {"         ","         " , "    __    " , "  /'__`\\  " , " /\\  __/  " , " \\ \\____\\ " , "  \\/____/ " , "          " , "          "};
        String[] f = {"    ___   " , "  /'___\\  " , " /\\ \\__/  " , " \\ \\ ,__\\ " , "  \\ \\ \\_/ " , "   \\ \\_\\  " , "    \\/_/  " , "          " , "          "};
        String[] g = {"            " , "            " , "    __      " , "  /'_ `\\    " , " /\\ \\L\\ \\   " , " \\ \\____ \\  " , "  \\/___L\\ \\ " , "    /\\____/ " , "    \\_/__/  "};
        String[] h = {"  __          " , " /\\ \\         " , " \\ \\ \\___     " , "  \\ \\  _ `\\   " , "   \\ \\ \\ \\ \\  " , "    \\ \\_\\ \\_\\ " , "     \\/_/\\/_/ " , "              " , "              "};
        String[] i = {"         " , "  __     " , " /\\_\\    " , " \\/\\ \\   " , "  \\ \\ \\  " , "   \\ \\_\\ " , "    \\/_/ " , "         " , "         "};
        String[] j = {"          " , "  __      " , " /\\_\\     " , " \\/\\ \\    " , "  \\ \\ \\   " , "  _\\ \\ \\  " , " /\\ \\_\\ \\ " , " \\ \\____/ " , "  \\/___/  "};
        String[] k = {"  __          " , " /\\ \\         " , " \\ \\ \\/'\\     " , "  \\ \\ , <     " , "   \\ \\ \\\\`\\   " , "    \\ \\_\\ \\_\\ " , "     \\/_/\\/_/ " , "              " , "              "};
        String[] l = {"  ___       " , " /\\_ \\      " , " \\//\\ \\     " , "   \\ \\ \\    " , "    \\_\\ \\_  " , "    /\\____\\ " , "    \\/____/ " , "           " , "           "};
        String[] m = {"               " , "               " , "   ___ ___     " , " /' __` __`\\   " , " /\\ \\/\\ \\/\\ \\  " , " \\ \\_\\ \\_\\ \\_\\ " , "  \\/_/\\/_/\\/_/ " , "               " , "               "};
        String[] n = {"           " , "           " , "   ___     " , " /' _ `\\   " , " /\\ \\/\\ \\  " , " \\ \\_\\ \\_\\ " , "  \\/_/\\/_/ " , "           " , "           "};
        String[] o = {"          " , "          " , "   ___    " , "  / __`\\  " , " /\\ \\L\\ \\ " , " \\ \\____/ " , "  \\/___/  " , "          " , "          "};
        String[] p = {"           " , "           " , "  _____    " , " /\\ '__`\\  " , " \\ \\ \\L\\ \\ " , "  \\ \\ ,__/ " , "   \\ \\ \\/  " , "    \\ \\_\\  " , "     \\/_/  "};
        String[] q = {"             " , "             " , "    __       " , "  /'__`\\     " , " /\\ \\L\\ \\    " , " \\ \\___, \\   " , "  \\/___/\\ \\  " , "       \\ \\_\\ " , "        \\/_/ "};
        String[] r = {"         " , "         " , "  _ __   " , " /\\`'__\\ " , " \\ \\ \\/  " , "  \\ \\_\\  " , "   \\/_/  " , "         " , "         "};
        String[] s = {"          " , "          " , "   ____   " , "  /',__\\  " , " /\\__, `\\ " , " \\/\\____/ " , "  \\/___/  " , "          " , "          "};
        String[] t = {"  __       " , " /\\ \\__    " , " \\ \\ ,_\\   " , "  \\ \\ \\/   " , "  \\ \\ \\_  " , "  \\ \\__\\ " , "   \\/__/ " , "           " , "           "};
        String[] u = {"           " , "           " , "  __  __   " , " /\\ \\/\\ \\  " , " \\ \\ \\_\\ \\ " , "  \\ \\____/ " , "   \\/___/  " , "           " , "           "};
        String[] v = {"           " , "           " , "  __  __   " , " /\\ \\/\\ \\  " , " \\ \\ \\_/ | " , "  \\ \\___/  " , "   \\/__/   " , "           " , "           "};
        String[] w = {"               " , "               " , "  __  __  __   " , " /\\ \\/\\ \\/\\ \\  " , " \\ \\ \\_/ \\_/ \\ " , "  \\ \\___x___/' " , "   \\/__//__/   " , "               " , "               "};
        String[] x = {"          " , "          " , "  __  _   " , " /\\ \\/'\\  " , " \\/>  </  " , "  /\\_/\\_\\ " , "  \\//\\/_/ " , "          " , "          "};
        String[] y = {"             " , "             " , "  __  __     " , " /\\ \\/\\ \\    " , " \\ \\ \\_\\ \\   " , "  \\/`____ \\  " , "   `/___/> \\ " , "      /\\___/ " , "      \\/__/  "};
        String[] z = {"           " , "           " , "  ____     " , " /\\_ ,`\\   " , " \\/_/  /_  " , "   /\\____\\ " , "   \\/____/ " , "           " , "           "};
        String[] empty = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        //make dictionary key: String letter value: ascii letter

        letters.put('a', a);
        letters.put('b', b);
        letters.put('c', c);
        letters.put('d', d);
        letters.put('e', e);
        letters.put('f', f);
        letters.put('g', g);
        letters.put('h', h);
        letters.put('i', i);
        letters.put('j', j);
        letters.put('k', k);
        letters.put('l', l);
        letters.put('m', m);
        letters.put('n', n);
        letters.put('o', o);
        letters.put('p', p);
        letters.put('q', q);
        letters.put('r', r);
        letters.put('s', s);
        letters.put('t', t);
        letters.put('u', u);
        letters.put('v', v);
        letters.put('w', w);
        letters.put('x', x);
        letters.put('y', y);
        letters.put('z', z);
        letters.put(' ', empty);

        writeWordToFile("nima goat");
        printAscii();
        resetFile();

    }
}
