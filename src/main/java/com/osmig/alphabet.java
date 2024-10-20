package com.osmig;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class alphabet {

    public static String[] lowerCase(String letter) throws IOException {

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
        String[] t = {"  __       " , " /\\ \\__    " , " \\ \\ ,_\\   " , "  \\ \\ \\/   " , "   \\ \\ \\_  " , "    \\ \\__\\ " , "     \\/__/ " , "           " , "           "};
        String[] u = {"           " , "           " , "  __  __   " , " /\\ \\/\\ \\  " , " \\ \\ \\_\\ \\ " , "  \\ \\____/ " , "   \\/___/  " , "           " , "           "};
        String[] v = {"           " , "           " , "  __  __   " , " /\\ \\/\\ \\  " , " \\ \\ \\_/ | " , "  \\ \\___/  " , "   \\/__/   " , "           " , "           "};
        String[] w = {"               " , "               " , "  __  __  __   " , " /\\ \\/\\ \\/\\ \\  " , " \\ \\ \\_/ \\_/ \\ " , "  \\ \\___x___/' " , "   \\/__//__/   " , "               " , "               "};
        String[] x = {"          " , "          " , "  __  _   " , " /\\ \\/'\\  " , " \\/>  </  " , "  /\\_/\\_\\ " , "  \\//\\/_/ " , "          " , "          "};
        String[] y = {"             " , "             " , "  __  __     " , " /\\ \\/\\ \\    " , " \\ \\ \\_\\ \\   " , "  \\/`____ \\  " , "   `/___/> \\ " , "      /\\___/ " , "      \\/__/  "};
        String[] z = {"           " , "           " , "  ____     " , " /\\_ ,`\\   " , " \\/_/  /_  " , "   /\\____\\ " , "   \\/____/ " , "           " , "           "};

        //make dictionary key: String letter value: ascii letter
        Map<String, String[]> letters = new HashMap<>();
        letters.put("a", a);
        letters.put("b", b);
        letters.put("c", c);
        letters.put("d", d);
        letters.put("e", e);
        letters.put("f", f);
        letters.put("g", g);
        letters.put("h", h);
        letters.put("i", i);
        letters.put("j", j);
        letters.put("k", k);
        letters.put("l", l);
        letters.put("m", m);
        letters.put("n", n);
        letters.put("o", o);
        letters.put("p", p);
        letters.put("q", q);
        letters.put("r", r);
        letters.put("s", s);
        letters.put("t", t);
        letters.put("u", u);
        letters.put("v", v);
        letters.put("w", w);
        letters.put("x", x);
        letters.put("y", y);
        letters.put("z", z);

        //TODO: make method return ascii array

        // TODO: get input word, split by char, get each ascii letter, append to txt file, print ascii word


        return letters.get(letter);
    }

    public static void writeToFile(String[] letter) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));

        int line_index = 0;
        for(int num = 0; num <9; num++){
            bufferedWriter.write(   letter[num]+ "\n");
//            line_index++;
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

    public static void splitWord(){

    }

    public static void resetFile() throws IOException {
        BufferedWriter reset = new BufferedWriter(new FileWriter("text.txt"));
        reset.write("");
        reset.close();
    }


    public static void main(String[] args) throws IOException {
        writeToFile(lowerCase("a"));
    }
}
