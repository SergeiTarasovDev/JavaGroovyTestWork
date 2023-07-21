import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaSolutionTests {

    @Test
    void shouldReturnCountNumbersFromList() {
        List<Integer> numberList = new ArrayList<>(List.of(1, 3, 4, 5, 1, 5, 4));
        Map<Integer, Integer> expected = Map.of(1, 2, 3, 1, 4, 2, 5, 2);
        Map<Integer, Integer> actual = JavaSolution.countNumbers(numberList);
        Assertions.assertEquals(expected, actual);
    }
}