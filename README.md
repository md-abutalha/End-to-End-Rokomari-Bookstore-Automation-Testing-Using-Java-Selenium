# End-to-End-Rokomari-Bookstore-Automation-Testing-Using-Java-Selenium
## Rokomari Bookstore End-to-End Automation Testing

This project performs end-to-end automation testing for the Rokomari Bookstore platform, covering essential user journeys from sign-up through checkout.

## Table of Contents
- [Project Overview](#project-overview)
- [Features Tested](#features-tested)
- [Technologies Used](#technologies-used)
- [Automation Steps](#automation-steps)
- [Installation](#installation)
- [Running Tests](#running-tests)
- [Generating Allure Reports](#generating-allure-reports)
- [Folder Structure](#folder-structure)
- [Author](#author)

## Project Overview
The objective of this project is to ensure that core features on the Rokomari bookstore website function as expected for users, from signing up to adding books to the cart and providing shipping information. The project utilizes Selenium WebDriver for interaction with UI elements, TestNG for test structure, and Allure for reporting.

## Features Tested
1. **User Sign-Up**: Verification of sign-up functionality using Google.
2. **Menu and Category Navigation**: Ability to navigate to different authors and book categories.
3. **Filter Application**: Filter books by specific categories.
4. **Add to Cart**: Adding books to the cart and validating cart contents.
5. **Checkout Process**: Ensuring smooth checkout with accurate shipping information.
6. **Logout**: Ensuring the user can log out successfully.

## Technologies Used
- **Java**: Core programming language.
- **Selenium WebDriver**: For browser automation.
- **TestNG**: Framework for test structuring and assertions.
- **Maven**: Dependency management.
- **Allure**: Test reporting.

## Automation Steps
The following end-to-end automation steps were implemented in this project to cover critical user workflows on the Rokomari website:

1. **Sign Up using Google**: Initiates a new user sign-up flow using Google authentication.
2. **Navigate to Author Menu**: Selects the "লেখক" (Authors) section from the main menu.
3. **Select Author মায়ুন আহেমদ**: Filters books by the selected author, Mayoon Ahmed.
4. **Apply Category Filters**: Applies filters such as "সমকালীন উপন্যাস" (Contemporary Novels) and "রচনা সংকলন ও সম" (Collections & Anthologies).
5. **Scroll Down and Navigate Pages**: Scrolls through the book listings and moves to the next page if available.
6. **Add Book to Cart**: Adds a book to the cart from the filtered list.
7. **Click on Cart Icon**: Opens the cart to review added items.
8. **Go to Shipping Page**: Proceeds to the shipping page to finalize checkout.
9. **Provide Shipping Information**: Fills in required shipping details such as name, address, city, and contact number.
10. **Log Out**: Ends the session by logging out of the account.

## Installation
1. **Clone the repository**:
```bash
git clone https://github.com/md-abutalha/End-to-End-Rokomari-Bookstore-Automation-Testing-Using-Java-Selenium.git
```
2. **Navigate to project directory**
```bash
cd End-to-End-Rokomari-Bookstore-Automation-Testing-Using-Java-Selenium
```
3. **Install dependencies:**
```bash
 mvn clean install
 mvn test


```
##Generating Allure Reports
**Generate Allure Report & Open Allure Report:**
```bash
allure generate .\allure-results\ --clean
allure open .\allure-report\ 
```
## Folder Structure
- `src/main/java`: Core page classes and utilities.
- `src/test/java`: Test classes and methods.
- `pom.xml`: Maven configuration.
- `testng.xml`: TestNG configuration.
- `allure-results/`: Directory for Allure test results.
- `allure-report/`: Allure-generated HTML reports.

## E2E Automation Project Vedio
[![Watch the video](https://img.youtube.com/vi/2-FjDvooIL0/0.jpg)](https://youtu.be/Op4NIyb5KAE?si=8KAITpadhWXCdaWd)


## _Screenshots_
![image](https://github.com/user-attachments/assets/8051acdf-2627-4a5f-ab19-97f28adabf43)
![image](https://github.com/user-attachments/assets/441b2558-18eb-40a2-aa0f-9f82be6abe47)
![image](https://github.com/user-attachments/assets/55cd1ef6-b6d0-4fa9-8603-7dea53bd9343)
![image](https://github.com/user-attachments/assets/8a2252cd-2792-4402-ad68-4425165dd4ff)
![image](https://github.com/user-attachments/assets/3abc2846-bb35-4ff9-b9c0-94d581a64381)

## Authors

- [@abutalha](https://github.com/md-abutalha)


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/md-abutalha)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/abu-talha1/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://x.com/abu_talha0x)







