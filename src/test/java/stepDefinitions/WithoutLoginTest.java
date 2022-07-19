package stepDefinitions;

import PageObjectFiles.HomePO;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import resources.Base;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WithoutLoginTest extends Base {
    @When("initialize driver")
    public void initialize_driver() throws IOException {
        driver =initializeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

    }
    @When("click on today's deals and add item to cart")
    public void click_on_today_s_deals_and_add_item_to_cart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd = new HomePO(driver);
        Thread.sleep(20000);
        rd.getDeals().click();
        Thread.sleep(2000);
        rd.getThirdEle().click();

        rd.getFirstEle().click();
        Thread.sleep(2000);
        rd.getAddToCart().click();
        Thread.sleep(2000);
        driver.findElement(By.id("attach-close_sideSheet-link")).click();

    }
    @Then("verify item is added to cart")
    public void verify_item_is_added_to_cart() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd = new HomePO(driver);
        rd.getCart().click();
        Thread.sleep(2000);
        Assert.assertEquals("1", rd.getQuantity().getText());
    }


    @When("clicks on last item in mobiles section")
    public void clicks_on_last_item_in_mobiles_section() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd=new HomePO(driver);
        Thread.sleep(20000);
        rd.getSearchTab().click();
        Thread.sleep(2000);
        rd.getSearchTab().sendKeys("smart phones");
        Thread.sleep(2000);
        rd.getSearchSubmit().click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 5900)");
        Thread.sleep(2000);
        rd.getLastEle().click();


    }
    @Then("item details should be displayed")
    public void item_details_should_be_displayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd=new HomePO(driver);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it=handles.iterator();
        String parentWindowId = it.next();
        String childWindow =it.next();
        driver.switchTo().window(childWindow);
        System.out.println(rd.getProductTitle().getText());
        driver.switchTo().defaultContent();


    }



    @When("clicks on mobile phones button in sidebar")
    public void clicks_on_mobile_phones_button_in_sidebar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd=new HomePO(driver);
        rd.getNavbar().click();
        wait.until(ExpectedConditions.elementToBeClickable(rd.getMobileBtn())).click();
        wait.until(ExpectedConditions.elementToBeClickable(rd.getSelectMobileBtn())).click();

    }
    @Then("should display mobile phones")
    public void should_display_mobile_phones() {
        HomePO rd=new HomePO(driver);
        Assert.assertEquals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in", driver.getTitle().toString());

    }


}
