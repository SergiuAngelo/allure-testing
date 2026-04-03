package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Complex Math")
@Feature("Advanced math operations")
public class ComplexMathTest extends BaseTest {

    @Test
    @Story("Complex Multiplication")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 2 * 3 equals 6")
    void testComplexMultiplicationPass() {
        assertEquals(6, 2 * 3, "Complex math should work");
    }

    @Test
    @Story("Complex Division")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 10 / 2 equals 5")
    void testComplexDivisionPass() {
        assertEquals(5, 10 / 2, "Complex math should work");
    }

    @Test
    @Story("Complex Squaring")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 3 * 3 equals 9")
    void testComplexSquaringPass() {
        assertEquals(9, 3 * 3, "Complex math should work");
    }

    @Test
    @Story("Complex Multiplication Fail")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 2 * 3 equals 7")
    void testComplexMultiplicationFail() {
        assertEquals(7, 2 * 3, "Complex math should work");
    }

    @Test
    @Story("Complex Division Fail")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 10 / 2 equals 3")
    void testComplexDivisionFail() {
        assertEquals(3, 10 / 2, "Complex math should work");
    }

    @Test
    @Story("Complex Squaring Fail")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 3 * 3 equals 8")
    void testComplexSquaringFail() {
        assertEquals(8, 3 * 3, "Complex math should work");
    }
}
