package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class LoginPage extends BasePage {

    By signIn = By.xpath("//a[@class='logged-out-user-menu-btn']");
    By google = By.xpath("//button[@class='btn btn-social-google']");
    By emailField = By.xpath("//input[@id='identifierId']");
    By nextButton = By.xpath("//span[contains(text(),'পরবর্তী')]");
    By passwordField = By.xpath("//input[@name='Passwd']");

    HomePage homePage = new HomePage();

    @Test
    public void loginRokomariTest() throws InterruptedException {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(homePage.url);

        // Click the Sign In button
        wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();

        // Click the Google login button
        wait.until(ExpectedConditions.elementToBeClickable(google)).click();

        // Enter email
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys("doublemusk@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();

        // Enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys("passtalha");
        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
    }
}
