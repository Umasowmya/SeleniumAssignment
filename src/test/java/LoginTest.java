import PageObjectFiles.HomePO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;
import java.time.Duration;


public class LoginTest extends Base {

    @BeforeTest
    public void beforeTest() throws IOException, InterruptedException {
        driver =initializeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));


    }


    @Test()
    public void Login() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd=new HomePO(driver);
        Thread.sleep(20000);
        rd.getNavbar().click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#nav-hamburger-menu').scrollTop=5000");

        rd.getSignIn().click();
        rd.getEmail().sendKeys(prop.getProperty("username"));
        rd.getContinueBtn().click();
        rd.getPassword().sendKeys(prop.getProperty("password"));
        rd.getLoginSubmit().click();

    }

    @Test()
    public void previousOrders() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd=new HomePO(driver);
        Thread.sleep(20000);
        rd.getNavbar().click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#nav-hamburger-menu').scrollTop=5000");
        Thread.sleep(2000);

        rd.getAccountBtn().click();
        Thread.sleep(1000);
        rd.getOrdersBtn().click();

        Thread.sleep(2000);
        Select s = new Select(rd.getDropDown());
        Thread.sleep(1000);
        s.selectByVisibleText("2019");
        Thread.sleep(1000);
        rd.getViewOrderBtn().click();
        Thread.sleep(1000);
        Assert.assertEquals("05-Apr-2019",rd.getOrderDate().getText().toString().substring(24));

    }


    @Test(dependsOnMethods = {"Login"})
    public void addAddress() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd=new HomePO(driver);
        Thread.sleep(20000);
        rd.getNavbar().click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#nav-hamburger-menu').scrollTop=5000");

        Thread.sleep(2000);
        rd.getAccountBtn().click();

        Thread.sleep(2000);
        rd.getAddressBtn().click();

        Thread.sleep(2000);
        rd.getAddAddressBtn().click();

        rd.getFullName().sendKeys(prop.getProperty("fullName"));
        rd.getPhoneNumber().sendKeys(prop.getProperty("phoneNo"));
        rd.getPinCode().sendKeys(prop.getProperty("pinCode"));
        rd.getFlatNo().sendKeys(prop.getProperty("houseNo"));
        rd.getStreet().sendKeys(prop.getProperty("street"));
        Select s = new Select(rd.getState());
        s.selectByVisibleText("TELANGANA");


        js.executeScript("window.scrollBy(0,500)");

        rd.getAddressSubmit().click();
        Thread.sleep(2000);
        Assert.assertEquals("Address saved",driver.findElement(By.xpath("//h4[@class='a-alert-heading']")).getText());

    }

    @Test()
    public void addPayment() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd=new HomePO(driver);
        Thread.sleep(20000);
        rd.getNavbar().click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#nav-hamburger-menu').scrollTop=5000");

        Thread.sleep(2000);
        rd.getAccountBtn().click();

        Thread.sleep(2000);
        rd.getPaymentBtn().click();

        Thread.sleep(2000);
        rd.getAddCreditCard().click();

        Thread.sleep(5000);
        driver.switchTo().frame(driver.findElement(By.className("apx-secure-iframe")));
        Thread.sleep(2000);
        rd.getCardNo().sendKeys(prop.getProperty("cardNo"));
        rd.getCardName().sendKeys(prop.getProperty("cardName"));

        Select month = new Select(rd.getExpiryMonth());
        month.selectByVisibleText("12");

        Select year = new Select(rd.getExpiryYear());
        year.selectByVisibleText("2026");

        rd.getAddCard().click();

        rd.getAllotAddress().click();


    }

}


