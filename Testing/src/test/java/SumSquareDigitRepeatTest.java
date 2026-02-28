import org.example.SumSquareDigitRepeat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumSquareDigitRepeatTest {
    @ParameterizedTest
    @CsvSource(value = {"16,true", "8,false"})
    public void test1(int input, boolean expect) {
        boolean actual = SumSquareDigitRepeat.stepsToGetBackWithSumDigitSquares(input);
        assertEquals(expect,actual);
    }

}
