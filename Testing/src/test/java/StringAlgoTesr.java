import org.example.Main;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static java.lang.System.in;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class StringAlgoTesr {

    @BeforeAll
    public static void beforeAll() {
        // connecting to db

    }
    @BeforeEach
    public  void beforeEach() {

    }
    @AfterEach
    public void afterEach() {




    }

    // @Disabled skip a test case
    @Test
    @DisplayName("Sachin")
    void testShift2Chars() {
        String input = "Hello";
        String expected = "lloHe";
        String actual  = Main.rotate(input);
        assertEquals(expected, actual);
        out.println(actual);
    }
    @Test
    @Timeout(value = 1 , unit = TimeUnit.SECONDS)
    void testShift2Chars2() {
        String input = "ab";
        String expected = "ab";
        String actual = Main.rotate(input);
        assertEquals(expected,actual);
        out.println(actual);
    }

    @Test
    void testShift2Chars3() {

//        Throwable result = null ;
//        try {
//            String input = "a";
//            String expected = "a";
//            String actual = Main.rotate(input);
//        }catch (Exception e) {
//            result = e;
//        }
//        assertEquals(StringIndexOutOfBoundsException.class,result.getClass());
        String input = "a";
        assertThrows(StringIndexOutOfBoundsException.class,() -> {
            String actual = Main.rotate(input);
        });
//        String actual = Main.rotate(input);

    }



    @AfterAll
    public static void afterall() {
        // close conection
    }
}
