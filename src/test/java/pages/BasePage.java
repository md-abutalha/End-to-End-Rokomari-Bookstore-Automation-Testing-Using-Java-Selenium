package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utilities.DriverSetup;

import java.io.ByteArrayInputStream;

public class BasePage extends DriverSetup {

    // Find Element
    public WebElement getElement(By locator) {
        try {
            return getDriver().findElement(locator);
        } catch (Exception e) {
            System.out.println("Element not found: " + locator);
            return null;
        }
    }

    // Click Element
    public void clickElement(By locator) {
        WebElement element = getElement(locator);
        if (element != null) {
            element.click();
        } else {
            System.out.println("Unable to click. Element not found: " + locator);
        }
    }

    // Send Keys
    public void writeOnElement(By locator, String text) {
        WebElement element = getElement(locator);
        if (element != null) {
            element.sendKeys(text);
        } else {
            System.out.println("Unable to send keys. Element not found: " + locator);
        }
    }

    // Page URL
    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    // Page Title
    public String getPageTitle() {
        return getDriver().getTitle();
    }

    // Load Web Page
    public void loadWebPage(String url) {
        getDriver().get(url);
    }

    // Displayed Method
    public boolean isElementDisplayed(By locator) {
        WebElement element = getElement(locator);
        return element != null && element.isDisplayed();
    }

    // Screenshots Method
    public void addScreenshots() {
        Allure.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
