import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionsTest {

    @Test
    void findOddNumbers() {

        int[] inputArray = {1, 2, 4, 20};
        Functions functions = new Functions();

        int actual = functions.find(inputArray);
        int expected = 1;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findEvenNumbers() {

        int[] inputArray = {1, 3, 11, 20};
        Functions functions = new Functions();

        int actual = functions.find(inputArray);
        int expected = 20;


        Assertions.assertEquals(expected, actual);
    }

}
