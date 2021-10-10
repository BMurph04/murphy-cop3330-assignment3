/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex45;

import java.io.*;
import java.util.Scanner;

public class WordFinder {
    final private static Scanner input = new Scanner(System.in);

    //Read from input file 'exercise45_input.txt' and store in a string.
    public static String readString(){
        String initialMsg = "";
        try{
            FileReader readFile = new FileReader("src/main/java/ex45/exercise45_input.txt");
            BufferedReader br = new BufferedReader(readFile);

            while(br.ready()){
                initialMsg = initialMsg+br.readLine()+"\n";
            }
            readFile.close();
        }
        catch(IOException e){e.printStackTrace();}
        return initialMsg;
    }
    //Look for all occurrences of the word 'utilize' and replace with 'use'.
    public static String replaceString(String initialMsg){
        return initialMsg.replaceAll("utilize", "use");
    }

    public static void writeString(String finalMsg){
        //Prompt for the name of the new output file.
        System.out.println("Please enter the name of the output file.");
        String outputFile = input.nextLine();

        //Write new string to new output file.
        File newOutput = new File("src/main/java/ex45/"+outputFile+"/");
        try{
            FileWriter writeFile = new FileWriter(newOutput);
            writeFile.write(finalMsg);
            writeFile.close();
        }
        catch(IOException e){e.printStackTrace();}

    }
    public static void main(String[] args){
        String initialMsg = readString();
        String finalMsg = replaceString(initialMsg);
        writeString(finalMsg);
    }


}
