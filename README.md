# SauceLab-Cucumber-Framework ![Maven](https://img.shields.io/badge/Maven-C71A2C?style=flat&logo=apachemaven&logoColor=white) ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white) ![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=flat&logo=cucumber&logoColor=white)

## Table of Contents
1. [Overview](#overview)
2. [Project Structure](#project-structure)
3. [Installation and Setup](#installation-and-setup)
4. [Running the Tests](#running-the-tests)
5. [Test Scenarios](#test-scenarios)
6. [Reports](#reports)
7. [Dependencies](#dependencies)
8. [Contributing](#contributing)
9. [Contact](#contact)

---

## Overview
This repository demonstrates the use of a **Cucumber BDD Framework** with **Selenium WebDriver** for automating the login feature of the [SauceDemo](https://www.saucedemo.com/) application. This framework is built using **Java** and **Maven**, with clearly defined steps for test automation. It is designed to be scalable, reusable, and maintainable, adhering to the best practices of automation and software testing.

### Key Features:
- Modular framework using the Page Object Model (POM).
- BDD approach using **Cucumber** to write scenarios in Gherkin.
- Integration with **Maven** for project management and dependency handling.
- Generates detailed test execution reports.

<p align="center">
  <img src="https://cdn-icons-png.flaticon.com/512/873/873120.png" alt="SauceLabs Logo" width="120" height="120">
</p>

---

## Project Structure

```bash
SauceLab-Cucumber-Framework
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

### Explanation of Folder Structure
- **`src/main/java`**: Contains core utility classes.
- **`src/test/java`**: 
  - `LoginStepDefination`: Step definitions written in Java.
  - `testRunner`: Test Runner classes for executing Cucumber scenarios.
- **`FeatureFiles`**: Contains `.feature` files, defining test scenarios in Gherkin syntax.
- **`target/cucumber-reports`**: Stores the execution reports.
- **`pom.xml`**: Maven POM file for managing project dependencies.

---

## Installation and Setup
### Prerequisites:
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white) **Java 8 or higher**
- ![Maven](https://img.shields.io/badge/Maven-C71A2C?style=flat&logo=apachemaven&logoColor=white) **Maven 3.6 or higher**
- ![IDE](https://img.shields.io/badge/IDE-Eclipse%20or%20IntelliJ%20IDEA-blue?style=flat&logo=eclipseide) **Eclipse/IntelliJ IDEA**
- ![ChromeDriver](https://img.shields.io/badge/ChromeDriver-4285F4?style=flat&logo=googlechrome&logoColor=white) Browser drivers (e.g., `chromedriver` for Chrome)

### Setup Steps:
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yuvrajchavale/SauceLab-Cucumber-Framework.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd SauceLab-Cucumber-Framework
   ```
3. **Install Dependencies**:
   ```bash
   mvn clean install
   ```
4. **Set Up ChromeDriver Path**:
   Ensure that the path to `chromedriver` is set correctly in the system environment variables.

---

## Running the Tests
To run the tests, navigate to the project root directory and execute the following command:

```bash
mvn test
```

Alternatively, you can run the `LoginRunner.java` directly from your IDE as a JUnit test.

---

## Test Scenarios
The test scenarios are defined in the `SauceLogin.feature` file using the **Gherkin** syntax:

```gherkin
Feature: SauceDemo Login Feature
  Scenario: Successful login with valid credentials
    Given User is on the SauceDemo login page
    When User enters valid username and password
    And User clicks on the login button
    Then User should be navigated to the home page
```

Each step is mapped to the corresponding Java method in the `LoginStepDefination.java` file.

---

## Reports
Test execution generates reports in different formats, which can be found under the `target/cucumber-reports` directory. Open the HTML report for a detailed overview of the test results:

- **HTML Report**: `cucumber-html-report.html`
- **JSON Report**: `cucumber.json`
- **JUnit Report**: `cucumber.xml`

---

## Dependencies
The project uses the following dependencies:

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

Refer to the `pom.xml` file for more details.

---

## Contributing
Contributions are welcome! Feel free to open a pull request or create an issue for any feature requests or bug fixes.

## Contact
For any queries or assistance, please reach out to [Yuvraj Chavale](https://github.com/yuvrajchavale).

