package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @ParameterizedTest
    @CsvSource({"'cats|dogs',2","'car|door',2"})
    public void multipleMatchingWords(String string,int result) {
        int words = new CountLetters().count(string);
        Assertions.assertEquals(result, words);
    }

    @Test
    public void noMatchingWords(){
        int words = new CountLetters().count("boast|toast");
        Assertions.assertEquals(0,words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }


}