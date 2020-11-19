package StepDef;

import Utils.UtilClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAlexa {
    test.Pages.AmazonPage object =new test.Pages.AmazonPage();




    @Given("^User navigates to \"([^\"]*)\"$")
    public void user_navigates_to(String url) throws Throwable {


        UtilClass.driver.get(url);
        UtilClass.driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(UtilClass.driver.getTitle());
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",UtilClass.driver.getTitle());




    }

    @When("^Searches for the \"([^\"]*)\"$")
    public void searches_for_the(String item) throws Throwable {
         object.searchButton.click();
        Thread.sleep(2000);
        object.searchButton.sendKeys(item);
      object.clickSeachButton.click();
         Thread.sleep(3000);
    }

    @When("^Scroll down to the second page$")
    public void scroll_down_to_the_second_page() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) UtilClass.driver;
        js.executeScript("window.scrollBy(0, 6500)", "");
        object.SecondPage.click();
        Thread.sleep(2000);
    }

    @When("^Select the third item$")
    public void select_the_third_item() throws Throwable {

        for (int i=0;i<object.results.size(); i++){
            if(i==1){
                System.out.println(object.results.get(i).getText());
                object.results.get(i).click();
            }

        }

        Thread.sleep(3000);
    }

    @When("^Add item to cart$")
    public void add_item_to_cart() throws Throwable {
       object.addToCard.click();

       Thread.sleep(2000);

    }


    @Then("^Item is in a cart$")
    public void item_is_in_a_cart() throws Throwable {
      object.Cart.click();
      Thread.sleep(2000);
    }

    @Then("^Item details displayed$")
    public void item_details_displayed() throws Throwable {
        System.out.println(object.ItemCart.getText());

        UtilClass.closeDriver();
    }




//    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        String baseURL = "https://www.amazon.com/";
//        driver.get(baseURL);
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        AmazonPage object =new AmazonPage();
//        object.searchButton.click();
//        Thread.sleep(2000);
//        object.searchButton.sendKeys("alexa");
//        WebElement clickSeachButton=driver.findElement(By.xpath("//input[@type='submit']"));
//        clickSeachButton.click();
//        Thread.sleep(3000);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//
//

}
