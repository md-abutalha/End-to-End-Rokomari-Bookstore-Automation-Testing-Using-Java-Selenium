package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {
    public String cartUrl = "https://www.rokomari.com/cart";
    // Fixed to use cssSelector for compound class name
    public By shippingPageEdit = By.cssSelector(".btn.btn-link.js--edit-address");

    // Fixed to use a valid CSS selector
    public By homeRadioInfo = By.cssSelector("label[for='home']");
    public By nameInfo = By.xpath("//input[@id='name']");
    public By phoneInfo = By.xpath("//input[@id='phone']");

    public By dropDownCity = By.xpath("//select[@id='js--add-city']");
    public By dropDownClickCity = By.xpath("//*[@id=\"js--add-city\"]/option[2]");

    public By dropDownSubCity = By.xpath("//select[@id='js--add-area']");
    public By subAreaClick = By.xpath("//*[@id=\"js--add-area\"]/option[2]");
    public By detailsAddress = By.xpath("//textarea[@id='address']");

    public By saveButton = By.xpath("//input[@value='Save']");



    //logout locator
    public By clickAccount = By.xpath("//i[@class='ion-arrow-down-b']");
    public By signOutButton = By.xpath("//a[normalize-space()='Sign Out']");
}
