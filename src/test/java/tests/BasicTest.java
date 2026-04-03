package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Basic Math")
@Feature("Basic math operations")
public class BasicTest extends BaseTest {

    @Test
    @Story("Basic Addition")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that 2 + 3 equals 5")
    void testBasicAdditionPass() {
        assertEquals(5, 2 + 3, "Basic addition should work");
    }

    @Test
    @Story("Basic Subtraction")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that 10 - 4 equals 6")
    void testBasicSubtractionPass() {
        assertEquals(6, 10 - 4, "Basic subtraction should work");
    }

    @Test
    @Story("Basic Multiplication")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that 4 * 5 equals 20")
    void testBasicMultiplicationPass() {
        assertEquals(20, 4 * 5, "Basic multiplication should work");
    }

    @Test
    @Story("Basic Division")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that 20 / 4 equals 5")
    void testBasicDivisionPass() {
        assertEquals(5, 20 / 4, "Basic division should work");
    }

    @Test
    @Story("Basic Modulo")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that 17 % 5 equals 2")
    void testBasicModuloPass() {
        assertEquals(2, 17 % 5, "Basic modulo should work");
    }

    @Test
    @Story("Basic Addition Fail")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that 2 + 3 equals 6")
    void testBasicAdditionFail() {
        assertEquals(6, 2 + 3, "Basic addition should work");
    }
}

