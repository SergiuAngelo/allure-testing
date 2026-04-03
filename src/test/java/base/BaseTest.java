package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import utils.AllureTestWatcher;

@ExtendWith(AllureTestWatcher.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    void setup() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.qa-practice.com/");
    }

    @AfterEach
    void tearDown() {
        DriverFactory.quitDriver();
    }
}