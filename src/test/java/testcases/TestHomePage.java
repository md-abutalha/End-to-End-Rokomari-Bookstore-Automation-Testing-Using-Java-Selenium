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


    // url & popUp banner handle
//    @Test(priority = 2)
//    public void homePageUrlAndPopupBannerTest() throws InterruptedException {
//        getDriver().get(homePage.url);
//        Thread.sleep(4000);
//        popUpHandle();
//    }

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

//    ##########################################################################################################################
//    @Test(priority = 1, description = "test main feature of the home page")
//    public void testHomePageFeatures() {
//        getDriver().get(homePage.url);
//        popUpHandle();
//        homePage.addScreenshots();
//        Actions action = new Actions(getDriver());
//
//        // Scroll to the position of writer list
//        action.scrollByAmount(0, 300).build().perform();
//
//        // Hover over the writer list and click the specific writer
//        WebElement writerListElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(homePage.writterList));
//        action.moveToElement(writerListElement).perform();
//
//        WebElement writerNameElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(homePage.WritterName));
//        writerNameElement.click();
//
//        // Scroll and interact with other elements
//        action.scrollByAmount(0, 600).build().perform();
//
//        WebElement somokalinOporNashElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(homePage.somokalinOporNash));
//        somokalinOporNashElement.click();
//
//        action.scrollByAmount(0, 600).build().perform();
//
//        WebElement upornashSomogrohoElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(homePage.upornashSomogroho));
//        upornashSomogrohoElement.click();
//
//        action.scrollByAmount(0, 5500).build().perform();
//        WebElement nextPageElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(homePage.nextPage));
//        nextPageElement.click();
//
//        homePage.addScreenshots();
//
//        //add to cart
////        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////        action.scrollByAmount(0,5100).build().perform();
////        action.moveToElement(homePage.getElement(homePage.hoverAddToCartImage)).build().perform(); //hover
////        homePage.clickElement(homePage.addToCartBook);
////        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////        homePage.clickElement(homePage.clickCartPage);
////        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // Set implicit wait once, globally.
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//// Scroll to bring the element into view.
//        action.scrollByAmount(0, 5100).perform();
//
//// Hover over the "Add to Cart" image
//        action.moveToElement(homePage.getElement(homePage.hoverAddToCartImage)).perform();
//
//// Explicit wait for "Add to Cart" button to be clickable
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(homePage.getElement(homePage.addToCartBook)));
//
//// Click "Add to Cart" button
//        homePage.clickElement(homePage.addToCartBook);
//
//// Explicit wait for Cart page button to be clickable
//        wait.until(ExpectedConditions.elementToBeClickable(homePage.getElement(homePage.clickCartPage)));
//
//// Click on the cart page link/button
//        homePage.clickElement(homePage.clickCartPage);
//
//    }
//#######################################################################################################################

    //****************************************************************************************************************
    @Test(priority = 1, description = "Navigate to home page and handle the popup")
    public void testNavigateToHomePageAndHandlePopup() {
        getDriver().get(homePage.url);
        popUpHandle();
        homePage.addScreenshots();
    }

    @Test(priority = 2, description = "Scroll to writer list and hover over the writer list")
    public void testScrollToWriterListAndHover() {
        getDriver().get(homePage.url);
        homePage.addScreenshots();
        Actions action = new Actions(getDriver());
        action.scrollByAmount(0, 300).build().perform();

        WebElement writerListElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.writterList));
        action.moveToElement(writerListElement).perform();

        WebElement writerNameElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.WritterName));
        writerNameElement.click();

        action.scrollByAmount(0, 600).build().perform();

        WebElement somokalinOporNashElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.somokalinOporNash));
        somokalinOporNashElement.click();

        action.scrollByAmount(0, 600).build().perform();

        WebElement upornashSomogrohoElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.upornashSomogroho));
        upornashSomogrohoElement.click();
    }


    @Test(priority = 3, description = "Navigate to the next page")
    public void testNavigateToNextPage() {
        getDriver().get(homePage.url_1);
        homePage.addScreenshots();
        Actions action = new Actions(getDriver());
        action.scrollByAmount(0, 5500).build().perform();

        WebElement nextPageElement = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(homePage.nextPage));
        nextPageElement.click();
    }

    @Test(priority = 4, description = "Add an item to the cart")
    public void testAddItemToCart() {
        getDriver().get(homePage.url_page2);
        homePage.addScreenshots();
        Actions action = new Actions(getDriver());
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Scroll to bring the element into view.
        action.scrollByAmount(0, 5100).perform();

        // Hover over the "Add to Cart" image
        action.moveToElement(homePage.getElement(homePage.hoverAddToCartImage)).perform();

        // Explicit wait for "Add to Cart" button to be clickable
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getElement(homePage.addToCartBook)));

        // Click "Add to Cart" button
        homePage.clickElement(homePage.addToCartBook);
    }

    @Test(priority = 5, description = "Navigate to the cart page")
    public void testNavigateToCartPage() {
        getDriver().get(homePage.url_page2);
        homePage.addScreenshots();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getElement(homePage.clickCartPage)));

        // Click on the cart page link/button
        homePage.clickElement(homePage.clickCartPage);
    }
//*********************************************************************************************************


}
