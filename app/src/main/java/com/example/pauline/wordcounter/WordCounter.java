package com.example.pauline.wordcounter;

import java.util.ArrayList;
import java.util.Collections;

public class WordCounter {



    public WordCounter(){

    }


    public int splitInputIntoSeparateWords(String words){
        int noOfWords = words.split(" ").length;
        return noOfWords;
    }





}

