# SauceLab Automation Framework

## Overview
This repository contains an automation framework designed to test the login functionality of the SauceDemo application using Cucumber and Selenium WebDriver. The framework is structured to support maintainable and scalable test automation using Java. It follows a typical BDD (Behavior-Driven Development) pattern.

## Project Structure
```plaintext
SauceLab
├── src
│   ├── main
│   │   └── java
│   ├── test
│   │   ├── java
│   │   │   ├── LoginStepDefination
│   │   │   │   └── LoginStepDefination.java
│   │   │   └── testRunner
│   │   │       └── LoginRunner.java
│   │   └── resources
├── FeatureFiles
│   └── SauceLogin.feature
├── target
│   └── cucumber-reports
├── pom.xml
```

### Folders and Files
- **src/main/java**: Contains core utility files or helper classes (if any).
- **src/test/java**: 
  - `LoginStepDefination`: Stores the step definitions for the login functionality.
  - `testRunner`: Contains the runner class (`LoginRunner.java`) that triggers the execution of Cucumber test scenarios.
- **src/test/resources**: Stores configuration files or additional test resources.
- **FeatureFiles**: Contains `.feature` files written in Gherkin language, which define the scenarios to be executed.
- **target/cucumber-reports**: Contains the generated reports post-execution.
- **pom.xml**: Maven POM file managing project dependencies and build configurations.

## Installation and Setup
### Prerequisites
- JDK 8 or higher
- Maven 3.6 or higher
- IDE (e.g., Eclipse or IntelliJ IDEA)
- Browser drivers (e.g., `chromedriver` for Chrome)

### Steps to Clone and Setup the Project
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yuvrajchavale/SauceLab-Cucumber-Framework.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd SauceLab-Cucumber-Framework
   ```
3. **Install Dependencies**:
   Run the following Maven command to download the required dependencies:
   ```bash
   mvn clean install
   ```

4. **Update the `chromedriver` Path**:
   Make sure that the path to the `chromedriver` executable is correctly set in your system's environment variables or update the path in your code.

## Running the Tests
To run the tests, use the following command in the root directory:
```bash
mvn test
```

Alternatively, right-click on `LoginRunner.java` in your IDE and select **Run As** > **JUnit Test**.

## Test Scenarios
The test scenarios are written using the Gherkin language in the `SauceLogin.feature` file. Below is an example of the login test scenario:

```gherkin
Feature: SauceDemo Login Feature
  Scenario: Successful login with valid credentials
    Given User is on the SauceDemo login page
    When User enters valid username and password
    And User clicks on the login button
    Then User should be navigated to the home page
```

## Reports
The generated reports after test execution can be found under the `target/cucumber-reports` directory. The framework supports HTML, JSON, and JUnit formats. Open the `cucumber-html-report.html` file for a detailed report.

## Dependencies
The project is configured with the following main dependencies:

- **Selenium WebDriver**
- **Cucumber JVM**
- **JUnit**
- **Maven**

For a complete list, refer to the `pom.xml` file.

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>6.9.1</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>6.9.1</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
    </dependency>
</dependencies>
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any queries or issues, please reach out to [Yuvraj Chavale](https://github.com/yuvrajchavale).

---

Let me know if you'd like any modifications!
