import org.junit.jupiter.api.Test

class GroovySolutionTests {

    @Test
    void shouldReturnCountNumbersFromList() {
        def numberList = [1, 3, 4, 5, 1, 5, 4]
        def expected = [1: 2, 3: 1, 4: 2, 5: 2]
        def actual = GroovySolution.countNumbers(numberList)
        assert expected == actual
    }
}