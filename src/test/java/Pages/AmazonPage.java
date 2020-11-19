package test.Pages;

import Utils.UtilClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.List;

public class AmazonPage {
    WebDriver driver;

    public AmazonPage(){
        this.driver= UtilClass.driversSetUp("chrome");
        PageFactory.initElements(driver,this);

    }


    @FindBy(id="twotabsearchtextbox")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement clickSeachButton;

    @FindBy(xpath = "//a[contains(@href,'pg_2')]")
    public WebElement SecondPage;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement> results;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCard;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    public WebElement Cart;

    @FindBy(xpath = "//span[@class='a-size-medium sc-product-title a-text-bold']")
    public WebElement ItemCart;


}
