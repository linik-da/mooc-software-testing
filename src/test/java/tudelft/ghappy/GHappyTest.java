package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest()
    @CsvSource({"''","gg","ggg","xxggxx"})
    public void happyGsInString(String string){
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy(string);
        Assertions.assertTrue(result);

    }

    @ParameterizedTest()
    @CsvSource({"g","xgx", "xxgxx"})
    public void noHappyGsInString(String string){
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy(string);
        Assertions.assertFalse(result);

    }

    @ParameterizedTest()
    @CsvSource({"ggxg","xxggyygxx"})
    public void happyGsAndNoHappyGsInString(String string){
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy(string);
        Assertions.assertFalse(result);

    }
}
