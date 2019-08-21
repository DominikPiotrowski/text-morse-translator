package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class MorseToTextTranslatorTest {

    @Test
    public void tranalsteMorseToTxt() {

        //given
        final String given = "-.../-.../-.-.";
        final String expected = "bbc";
        translator translator = new morseToTextTranslator();

        //when
        String actual = translator.translate(given);

        //then
        Assert.assertEquals(expected, actual);
    }
}