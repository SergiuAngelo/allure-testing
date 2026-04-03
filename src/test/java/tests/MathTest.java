package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Math")
@Feature("Essential math operations")
public class MathTest extends BaseTest {

    @Test
    @Story("Basic Math happy")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 1 + 1 equals 2")
    void testAllurePass() {
        assertEquals(2, 1 + 1, "Basic math should work");
    }

    @Test
    @Story("Basic Math Fail")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 1 + 2 equals 1")
    void testAllureFail() {
        assertEquals(1, 1 + 2, "Basic math should work");
    }

    @Test
    @Story("Basic Math pass")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 1 equals 1")
    void testAllurePass2() {
        assertEquals(1, 1, "Basic math should work");
    }

    @Test
    @Story("Basic Math pass")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 2 + 2 equals 4")
    void testAllurePass3() {
        assertEquals(4, 2 + 2, "Basic math should work");
    }

    @Test
    @Story("Basic Math Fail")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 2 + 2 equals 5")
    void testAllureFail2() {
        assertEquals(5, 2 + 2, "Basic math should work");
    }

    @Test
    @Story("Basic Math pass")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that 1 + 2 equals 3")
    void testAllurePass4() {
        assertEquals(3, 1 + 2, "Basic math should work");
    }
}