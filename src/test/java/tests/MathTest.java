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
    @Description("User should login with valid credentials")
    void testAllurePass() {
        assertEquals(2, 1 + 1, "Basic math should work");
    }

    @Test
    @Story("Basic Math Fail")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User should login with valid credentials")
    void testAllureFail() {
        assertEquals(1, 1 + 2, "Basic math should work");
    }
}