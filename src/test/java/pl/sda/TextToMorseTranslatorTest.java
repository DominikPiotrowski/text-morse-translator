package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextToMorseTranslatorTest {

    @Test
    public void translateTextToMorse() {

        //given
        final String given = "bbc";
        final String expected = "-.../-.../-.-.";
        Translator translate = new TextToMorseTranslator();

        //when
        String actual = translate.translate(given);

        //then
        Assert.assertEquals(expected,actual);
    }
}