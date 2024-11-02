package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String loginUrl = "https://www.rokomari.com/book";
    public String url = "https://www.rokomari.com/book";
    public String url_1 = "https://www.rokomari.com/book/author/1/humayun-ahmed?xyz=&categoryIds=680&categoryIds=677&priceRange=0to45100&discountRange=0to40";
    public String url_page2 = "https://www.rokomari.com/book/author/1/humayun-ahmed?xyz=&categoryIds=680&categoryIds=677&priceRange=0to45100&discountRange=0to40&page=2";

    public By popUpBanner = By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']");
    public By writterList = By.xpath("//a[@id='js--authors']");
    public By WritterName = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
    public By somokalinOporNash = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By upornashSomogroho = By.xpath("//label[contains(text(),'উপন্যাস সমগ্র')]");
    public By nextPage = By.xpath("//a[normalize-space()='2']");
    public  By hoverAddToCartImage = By.xpath("//img[@alt='Chaittar Ditiyo Dibosh image']");
    public By addToCartBook = By.xpath("//div[@title='চৈত্রের দ্বিতীয় দিবস হুমায়ূন আহমেদ']//div[1]//div[3]//button[1]");
    public By clickCartPage = By.xpath("//img[@alt='cart']");

}
