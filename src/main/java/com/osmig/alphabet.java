package com.osmig;

import java.io.*;

public class alphabet {

    public static void alpha() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt", true));

        // THE CURRENT FONT IS : LARRY 3D
        String[] a = {
                "        ",
                "        ",
                "   __   " ,
                " /'__`\\ ",
                "/\\ \\L\\.\\_",
                "\\ \\__/.\\_\\",
                " \\/__/\\/_/",
                "          ",
                "          "};

        String[] b = {
                " __        " ,
                "/\\ \\       " ,
                "\\ \\ \\____   " ,
                " \\ \\ '__`\\  " ,
                " \\ \\ \\L\\ \\ " ,
                " \\ \\_,__/ " ,
                "  \\/___/  " ,
                "           " ,
                "           "};

        String[] c = {
                "        " ,
                "        " ,
                "  ___   " ,
                " /'___\\" ,
                "/\\ \\__/" ,
                "\\ \\____\\" ,
                " \\/____/" ,
                "        " ,
                "        "};

//        for (String i : a){
//            System.out.print(i + "\n");
//
//        }
        int line_index = 0;
        for(int i = 0; i <9; i++){
            bufferedWriter.write(a[line_index] + b[line_index] + c[line_index] + "\n");
            line_index++;
        }

        bufferedWriter.close();

        // read file w/ buffer
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        String line;
        bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        BufferedWriter reset = new BufferedWriter(new FileWriter("text.txt"));
        reset.write("");
        reset.close();
    }



    public static void main(String[] args) throws IOException {
        alpha();
    }
}
