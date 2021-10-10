/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex46;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordFrequency {

    public static ArrayList<WordInfo> wordList = new ArrayList<>();

    //Use scanner to read from input file word for word (input.next())
    public static void compareWords() throws IOException {
        File inputFile = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner input = new Scanner(inputFile);

        //While another word exists
        while(input.hasNext()){

            //Scan in the next word and store it to a temp string.
            String nextWord = input.next();
            boolean foundWord = false;

            //Check string against an ArrayList of objects.
            //If it does exist in the list, increment the freq variable in the object of the string by 1.
            for(int i=0; i<wordList.size(); i++){
                if(nextWord.equals(wordList.get(i).getWord())){
                    incrementFreq(i);
                    foundWord = true;
                }
            }

            //If it does not exist in the list, add new object to the list containing the string and freq of string.
            if(!foundWord){
                wordList.add(new WordInfo(nextWord));
            }

        }
    }

    //Increments frequency of a word by 1
    public static void incrementFreq(int index){
        wordList.get(index).setWordFreq(wordList.get(index).getWordFreq()+1);
    }

    //Sorts array by frequency
    public static void sortArray(){
        Collections.sort(wordList);
    }

    //Formats the frequency into stars and prints result
    public static void printResult(){
        for(WordInfo wordInfo: wordList){
            System.out.println(wordInfo);
        }
    }

    public static void main(String[] args) throws IOException{
        compareWords();
        sortArray();
        printResult();
    }










}
