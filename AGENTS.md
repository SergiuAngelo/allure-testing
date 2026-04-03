# AGENTS.md - AI Coding Agent Guidelines for allure-testing

## Project Overview
Java-based Selenium test automation framework using Page Object Model, JUnit 5, and Allure reporting. Tests web applications with automated browser management and comprehensive test visualization.

## Architecture
- **Page Object Model**: Page classes in `src/main/java/pages/` encapsulate web element interactions (e.g., `LoginPage.java`)
- **Test Structure**: Tests extend `BaseTest` (`src/test/java/base/BaseTest.java`) for shared WebDriver setup
- **Utilities**: Driver management in `src/main/java/utils/DriverFactory.java`, test watching in `src/test/java/utils/AllureTestWatcher.java`
- **Data Flow**: Singleton WebDriver instance created via `DriverFactory.getDriver()`, navigated to https://www.qa-practice.com/ in `BaseTest.setup()`

## Key Workflows
- **Run Tests**: `mvn test` executes JUnit 5 tests with Surefire plugin (configured with `testFailureIgnore=true` in `pom.xml`)
- **Generate Reports**: `mvn allure:serve` serves Allure reports from `target/allure-results/` (configured in `src/test/resources/allure.properties`)
- **CI/CD**: Chrome runs headless with args `--headless=new --no-sandbox --disable-dev-shm-usage --disable-gpu --window-size=1920,1080` in `DriverFactory.java`

## Conventions
- **Test Annotations**: Use Allure annotations on test methods: `@Epic`, `@Feature`, `@Story`, `@Severity(SeverityLevel.CRITICAL)`, `@Description` (see `MathTest.java`, `ComplexMathTest.java`)
- **Package Structure**: Tests in `src/test/java/tests/`, base classes in `src/test/java/base/`, utilities in `src/test/java/utils/`
- **WebDriver Management**: Always use `DriverFactory.getDriver()` and `DriverFactory.quitDriver()` for browser lifecycle
- **Screenshot on Failure**: Automatic via `@ExtendWith(AllureTestWatcher.class)` in `BaseTest`, attaches PNG to Allure results

## Dependencies & Integrations
- **Selenium 4.21.0**: Web automation with ChromeDriver
- **JUnit 5.10.2**: Test framework with Jupiter API/Engine
- **WebDriverManager 6.1.0**: Automated driver binary setup
- **Allure 2.29.0**: Test reporting with screenshot attachments on failure</content>
<parameter name="filePath">/Users/sergiu.ciupe/allure-testing/AGENTS.md

## AI Coding Rules

### Selenium Best Practices
- NEVER use Thread.sleep
- ALWAYS use WebDriverWait with ExpectedConditions
- Prefer explicit waits over implicit waits
- Use meaningful locators (avoid brittle selectors)

### Test Stability
- Always investigate root cause of flakiness before suggesting fixes
- Avoid arbitrary waits
- Ensure elements are visible/clickable before interaction

### WebDriver Lifecycle
- Do NOT quit driver before taking screenshots
- Ensure screenshots are captured BEFORE driver teardown
- Respect DriverFactory lifecycle

### Page Object Model
- Keep locators and actions inside Page classes
- Do not put Selenium logic directly in tests
- Reuse existing page methods before creating new ones

### Code Style
- Keep solutions minimal and production-ready
- Avoid over-engineering
- Prefer readability over cleverness
- Prefer concise examples
- Use modern Selenium 4 APIs
- Avoid deprecated methods