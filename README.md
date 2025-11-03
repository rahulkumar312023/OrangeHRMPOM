# OrangeHRM Automation Project

## Overview
This project automates key functionalities of [OrangeHRM Demo](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login) using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**. The automated scenarios cover:
- Logging into the platform with valid credentials.
- Navigating to the Leave module.
- Applying leave with specified leave type, dates, and comments.
- Validating success message ("Successfully Saved").

## Project Structure
OrangeHRMAutomation
├── src
│ └── main/java/pages # Page classes (LoginPage, DashboardPage, LeavePage, BasePage)
│ └── test/java/testcases # Test classes (TestLogIn)
│ └── utilities # Driver setup, reusable methods
├── pom.xml
└── README.md

## Tools & Technologies
- **Language:** Java
- **Framework:** TestNG
- **Build Tool:** Maven
- **Testing Library:** Selenium WebDriver

## Prerequisites
1. Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install [Apache Maven](https://maven.apache.org/install.html).
3. Install an IDE such as [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/).
4. Add ChromeDriver (or Edge/Firefox driver) to your system PATH.

## Setup Instructions
1. Clone this repository:
   ```bash
   git clone https://github.com/rahulkumar312023/OrangeHRMPOM.git

Author

Rahul Kumar

GitHub: https://github.com/rahulkumar312023
