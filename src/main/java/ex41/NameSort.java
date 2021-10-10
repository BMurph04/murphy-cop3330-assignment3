/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex41;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class NameSort{

    public static ArrayList<String> namesList = new ArrayList<>();

    //Read in text file of names and place it in an array
    public static void getNames(){

        //Read in text file
        try {
            FileReader readFile = new FileReader("src/main/java/ex41/exercise41_input.txt");
            BufferedReader br = new BufferedReader(readFile);

            //Add each line to array
            while(br.ready()){
                namesList.add(br.readLine());
            }

            readFile.close();
        }
        catch(IOException e){e.printStackTrace();} //Exception if file is not found
    }

    //Sort the array alphabetically using ArrayList
    public static void sortNames(){
        Collections.sort(namesList);
    }

    //Write new array to a new txt file
    public static void setFile(){

        File newFile = new File("src/main/java/ex41/exercise41_output.txt");

        //Write new list
        try {
            FileWriter writeFile = new FileWriter(newFile);
            for(String names: namesList){
                writeFile.write(names + "\n");
            }
            writeFile.close();
        }
        catch(IOException e){e.printStackTrace();}
    }

    public static void main( String[] args )
    {
        getNames(); //Read in list of names
        sortNames(); //Sort list of names alphabetically
        setFile(); //Output new list into new file
    }
}
