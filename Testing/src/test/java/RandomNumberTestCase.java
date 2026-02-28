
import org.example.Main;
import org.example.RandomGenerator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.sql.rowset.Predicate;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
public class RandomNumberTestCase {

    @Test
    public void testLength() {
        int[] result = RandomGenerator.get10Random();
        assertEquals(result.length, 10);
    }

    @Test
    // @ RepeatTest(3)
    public void test() {
        int[] result = RandomGenerator.get10Random();
        for(int i = 0; i < result.length; i++) {
            assertEquals(result[i] > 0, result[i] <= 10);
        }
//        Predicate

//        assertTrue(Arrays.stream(result)
//                .allMatch((a) -> {return a > 0 && a <= 10;}));

    }
    @Test
    public void testRandom() {
        int[] result1 = RandomGenerator.get10Random();
        int[]  result2 = RandomGenerator.get10Random();
        assertFalse(Arrays.equals(result2,result1));
    }

    @ParameterizedTest
    @CsvSource(value = {"Hello,lloHe", "program,ogrampr","java,vaja", "test,stte"} )
    @Disabled
    public void testTemp(String input, String expected) {
        String actual = Main.rotate(input);
        assertEquals(expected,actual);
    }

//    or  from file

}
