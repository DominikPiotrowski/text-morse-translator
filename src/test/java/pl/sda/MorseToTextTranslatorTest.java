package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MorseToTextTranslatorTest {

    @Test
    public void tranalsteMorseToTxt() {

        //given
        final String given = "-.../-.../-.-.";
        final String expected = "bbc";
        Translator translator = new MorseToTextTranslator();

        //when
        String actual = translator.translate(given);

        //then
        Assert.assertEquals(expected, actual);
    }
}