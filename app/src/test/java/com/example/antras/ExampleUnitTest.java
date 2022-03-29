package com.example.antras;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.antras.text.countText;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        int result= countText.getWordsCount("Sveiki gyvi");
        assertEquals(2,result);
        result= countText.getWordsCount("Siandien labai grazus vakaras");
        assertEquals(4,result);
        result= countText.getWordsCount("Sveiki  ");
        assertEquals(1,result);
        result= countText.getWordsCount("");
        assertEquals(0,result);
        result= countText.getWordsCount("   ");
        assertEquals(0,result);

        result= countText.getCharsNoSpaceCount("");
        assertEquals(0,result);
        result= countText.getCharsNoSpaceCount("Siandien yra ypatinga diena");
        assertEquals(24,result);
        result= countText.getCharsNoSpaceCount("Sveikata  ");
        assertEquals(8,result);
        result= countText.getCharsNoSpaceCount("!? ");
        assertEquals(2,result);
        result= countText.getCharsNoSpaceCount("   ");
        assertEquals(0,result);

}
}