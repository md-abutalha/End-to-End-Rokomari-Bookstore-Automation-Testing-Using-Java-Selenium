package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import utilities.DriverSetup;

import java.time.Duration;

public class TestCartPage extends DriverSetup {
    //    This code should now perform the following tasks:
//    Open the cart URL.
//    Navigate to the shipping page and select "Home" as the delivery type.
//    Enter name and phone information.
//    Choose a city and sub-area from dropdowns.
//    Enter the full address and click save.
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();



    // Shipping page info test
    @Test(priority = 6, description = "Test cart edit all info and test")
    public void shippingPageInfoTest() {
        getDriver().get(cartPage.cartUrl);
        homePage.addScreenshots();  // fo the screenshots
        // Navigate to shipping page
        homePage.clickElement(cartPage.shippingPageEdit);
        homePage.addScreenshots();
        homePage.clickElement(cartPage.homeRadioInfo);

        // Fill in the shipping information
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage.clearField(cartPage.nameInfo);
        homePage.writeOnElement(cartPage.nameInfo, "Talha");

        homePage.clearField(cartPage.phoneInfo);
        homePage.writeOnElement(cartPage.phoneInfo, "8801761670029");

        // Select City
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homePage.clickElement(cartPage.dropDownCity);
        homePage.clickElement(cartPage.dropDownClickCity);

        // Select Sub-city
        homePage.clickElement(cartPage.dropDownSubCity);
        homePage.clickElement(cartPage.subAreaClick);

        // Fill in address details
        homePage.clearField(cartPage.detailsAddress);
        homePage.writeOnElement(cartPage.detailsAddress, "House # 12, Road # 5, Sector # 4, Uttara, Dhaka-1230, Bangladesh");
        homePage.addScreenshots();
        homePage.addScreenshots(); // add screenshots
        // Save the address
        homePage.clickElement(cartPage.saveButton);

    }

    @Test(priority = 7, description = "Logs out of the account after testing cart page features", dependsOnMethods = {"shippingPageInfoTest"})
    public void testLogOut() {
        getDriver().get(cartPage.cartUrl);
        homePage.addScreenshots();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homePage.clickElement(cartPage.clickAccount);
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.clickElement(cartPage.signOutButton);

    }
//Md. Abu Talha
//abutalhabd88@gmail.com
//phone: 01310105350
}
