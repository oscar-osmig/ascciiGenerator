package com.osmig;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt", true));

        String[] a = {"          ",
                      "          ",
                      "   __     " ,
                      " /'__`\\   ",
                      "/\\ \\L\\.\\_",
                      "\\ \\__/.\\_\\",
                      " \\/__/\\/_/",
                      "          ",
                      "          "};

        String[] b = {" __        " ,
                      "/\\ \\       " ,
                      "\\ \\ \\____  " ,
                      " \\ \\ '__`\\ " ,
                      "   \\ \\ \\L\\ \\" ,
                      "   \\ \\_,__/" ,
                      "    \\/___/ " ,
                      "           " ,
                      "           "};

//        for (String i : a){
//            System.out.print(i + "\n");
//
//        }

        int line_index = 0;
        for(int i = 0; i <9; i++){
            bufferedWriter.write(a[line_index] + " ");
            bufferedWriter.write(b[line_index] + "\n");
            line_index++;
        }

        bufferedWriter.close();

        // read file w/ buffer
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        String line;

        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }


    }
}