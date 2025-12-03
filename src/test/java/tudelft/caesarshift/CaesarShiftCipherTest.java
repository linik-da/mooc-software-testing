package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "originalString= {0}, shift = {1}, result = {2}")
    @CsvSource({"'abc', 3, 'def'", "'a', 3, 'd'", "'a', 0, 'a'"})
    public void canBeShifted(String string, int shift, String expectedResult){
        CaesarShiftCipher ceasarShiftCipher = new CaesarShiftCipher();
        String result = ceasarShiftCipher.CaesarShiftCipher(string, shift);
        Assertions.assertEquals(expectedResult,result);
    }
    @ParameterizedTest(name = "originalString= {0}, shift = {1}, result = {2}")
    @CsvSource({"'ABC', 3, 'invalid'"})
    public void canNotBeShifted(String string, int shift, String expectedResult){
        CaesarShiftCipher ceasarShiftCipher = new CaesarShiftCipher();
        String result = ceasarShiftCipher.CaesarShiftCipher(string, shift);
        Assertions.assertEquals(expectedResult,result);
    }
}
