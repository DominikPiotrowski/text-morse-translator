package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class TextToMorseTranslatorTest {

    @Test
    public void translateTextToMorse() {

        //given
        final String given = "bbc";
        final String expected = "-.../-.../-.-.";
        translator translate = new textToMorseTranslator();

        //when
        String actual = translate.translate(given);

        //then
        Assert.assertEquals(expected,actual);
    }
}