package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetup;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

import javax.swing.*;

public class TestHomePage extends DriverSetup {
    //object Create of home page
    HomePage homePage = new HomePage();


    //handle po-up banner
    public void popUpHandle() {
        try {
            // Locate the pop-up element using the `By` locator from HomePage
            WebElement popUpElement = getDriver().findElement(homePage.popUpBanner);

            // Check if the pop-up is displayed and click to close it
            if (popUpElement.isDisplayed()) {
                popUpElement.click();
                System.out.println("Pop-up banner closed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Pop-up banner not found");
        }
    }

//    @Test
//    public void loginUrl() throws InterruptedException {
//        getDriver().get(homePage.loginUrl);
//        Thread.sleep(2000);
//    }

    // url & popUp banner handle
    @Test(priority = 1)
    public void homePageUrlAndPopupBannerTest() throws InterruptedException {
        getDriver().get(homePage.url);
        Thread.sleep(4000);
        popUpHandle();
    }

    // Select লখক from the menu
    // Select মায়ুন আহেমদ
//    @Test(priority = 2)
//    public void testHomePageWritterSelect() {
//        getDriver().get(homePage.url);
//        Actions action = new Actions(getDriver());
//        action.scrollByAmount(0,300).build().perform();
//        action.moveToElement(getDriver().findElement(homePage.writterList)).build().perform();
//        action.click(getDriver().findElement(homePage.WritterName)).build().perform();
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//        action.scrollByAmount(0, 600).build().perform();
//        homePage.clickElement(homePage.somokalinOporNash);
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        action.scrollByAmount(0, 600).build().perform();
//        homePage.clickElement(homePage.upornashSomogroho);
//
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        action.scrollByAmount(0, 6000).build().perform();
//        homePage.clickElement(homePage.nextPage);
//    }

    @Test(priority = 2)
    public void testHomePage() {
        getDriver().get(homePage.url);
        popUpHandle();
        Actions action = new Actions(getDriver());

        // Scroll to the position of writer list
        action.scrollByAmount(0, 300).build().perform();

        // Hover over the writer list and click the specific writer
        WebElement writerListElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.writterList));
        action.moveToElement(writerListElement).perform();

        WebElement writerNameElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.WritterName));
        writerNameElement.click();

        // Scroll and interact with other elements
        action.scrollByAmount(0, 600).build().perform();

        WebElement somokalinOporNashElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.somokalinOporNash));
        somokalinOporNashElement.click();

        action.scrollByAmount(0, 600).build().perform();

        WebElement upornashSomogrohoElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.upornashSomogroho));
        upornashSomogrohoElement.click();

        action.scrollByAmount(0, 5500).build().perform();
        WebElement nextPageElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.nextPage));
        nextPageElement.click();

        //add to cart
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        action.scrollByAmount(0,5100).build().perform();
        homePage.clickElement(homePage.addToCartBook);
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.clickElement(homePage.clickCartPage);
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


}
