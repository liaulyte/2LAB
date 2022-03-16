package com.example.antras.text;

public class countText {
    public static int getWordsCount(String input){
        String[] parts = countText.SplitString(input);
        return parts.length;
    }
    public static String[] SplitString(String _stringToSplit)
    {
        return _stringToSplit.split(" ");
    }
    public static int getCharsNoSpaceCount(String input) {
        int charCount = 0;
        String[] parts = countText.SplitString(input);
        for (int i = 0; i < parts.length; i++)
        {
            charCount += parts[i].trim().length();
        }
        return charCount;
    }
}
