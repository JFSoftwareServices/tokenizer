package com.jfsoftware;

public class SentenceTokenizer {

    public Object[] longestWord(String sentence) {
        String[] words = sentence.replaceAll("\\.", "").split("\\s");
        int length = 0;
        String longestWord = "";
        for (String word : words) {
            if (length < word.length()) {
                length = word.length();
                longestWord = word;
            }
        }
        Object[] values = new Object[2];
        values[0] = longestWord;
        values[1] = length;
        return values;
    }

    public Object[] shortestWord(String sentence) {
        String[] words = sentence.replaceAll("\\.", "").split("\\s");
        int length = Integer.MAX_VALUE;
        String shortestWord = "";
        for (String word : words) {
            if (length > word.length()) {
                length = word.length();
                shortestWord = word;
            }
        }
        Object[] values = new Object[2];
        values[0] = shortestWord;
        values[1] = length;
        return values;
    }
}
