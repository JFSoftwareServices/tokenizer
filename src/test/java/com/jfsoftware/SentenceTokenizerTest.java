package com.jfsoftware;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SentenceTokenizerTest {
    private SentenceTokenizer tokenizer;
    private static final String SENTENCE_ONE = "The cow jumped over the moon.";
    private static final String SENTENCE_TWO = "TThe cow slowly jumped over the moon.";

    @Before
    public void before(){
        tokenizer = new SentenceTokenizer();
    }

    @Test
    public void longestWord() {
        Object[] values = tokenizer.longestWord(SENTENCE_ONE);

        String expectedWord = "jumped";
        Integer expectedLength = 6;

        String actualWord = (String) values[0];
        Integer actualLength = (Integer) values[1];

        Assert.assertEquals(expectedWord, actualWord);
        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void shortestWord() {
        Object[] values = tokenizer.shortestWord(SENTENCE_ONE);

        String expectedWord = "The";
        Integer expectedLength = 3;

        String actualWord = (String) values[0];
        Integer actualLength = (Integer) values[1];

        Assert.assertEquals(expectedWord, actualWord);
        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void longestWordWithDuplicates() {
        Object[] values = tokenizer.longestWord(SENTENCE_TWO);

        String expectedWord = "slowly";
        Integer expectedLength = 6;

        String actualWord = (String) values[0];
        Integer actualLength = (Integer) values[1];

        Assert.assertEquals(expectedWord, actualWord);
        Assert.assertEquals(expectedLength, actualLength);
    }

}