package com.example.pauline.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnswerTest {



    @Test
    public void canSplitWords(){
      WordCounter wordCounter = new WordCounter();
        assertEquals(6, wordCounter.splitInputIntoSeparateWords("I came in from the rain"));
    }

}
