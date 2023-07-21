import java.util.*;

public class JavaSolution {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(List.of(1, 3, 4, 5, 1, 5, 4));
        Map<Integer, Integer> result = countNumbers(numberList);
        System.out.println("result = " + result);
    }

    public static Map<Integer, Integer> countNumbers(List<Integer> numberList) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int number : numberList) {
            result.put(number, Optional.ofNullable(result.get(number)).orElse(0) + 1);
        }
        return result;
    }
}
