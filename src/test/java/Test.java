import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    void checkIfPositive() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("1"));
    }
}
