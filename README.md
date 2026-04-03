# allure-testing

A Java-based test automation framework for web applications using Selenium WebDriver, JUnit 5, and Allure reporting.

## Overview

This project provides a robust foundation for automated testing of web applications. It incorporates the Page Object Model (POM) design pattern for maintainable test code, automated WebDriver management, and comprehensive reporting with Allure.

## Technologies Used

- **Java**: Programming language
- **Maven**: Build and dependency management
- **Selenium WebDriver**: Browser automation
- **JUnit 5**: Testing framework
- **WebDriverManager**: Automated WebDriver binary management
- **Allure**: Test reporting and visualization

## Project Structure

```
src/
├── main/java/
│   ├── pages/          # Page Object Model classes
│   │   └── LoginPage.java
│   └── utils/          # Utility classes
│       └── DriverFactory.java
└── test/
    ├── java/
    │   ├── base/       # Base test classes
    │   │   └── BaseTest.java
    │   └── tests/      # Test classes
    │       └── MathTest.java
    └── resources/
        └── allure.properties
```

## Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

## Setup

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn clean install` to download dependencies

## Running Tests

Execute tests using Maven:

```bash
mvn test
```

## Generating Allure Reports

1. Run the tests to generate results
2. Serve the Allure report:

```bash
mvn allure:serve
```

This will start a local server and open the report in your default browser.

## Configuration

- WebDriver is configured to run in headless mode for CI/CD environments
- Allure results are stored in `target/allure-results/`
- Chrome is the default browser for testing

## Contributing

1. Follow the Page Object Model for new page classes
2. Extend `BaseTest` for common test setup
3. Use Allure annotations for better reporting (@Epic, @Feature, @Story, etc.)
