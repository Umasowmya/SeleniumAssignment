import PageObjectFiles.HomePO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class WithoutLoginTest extends Base {

    @BeforeTest
    public void before() throws IOException {
        driver =initializeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

    }

    @Test()
    public void deals() throws  InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        HomePO rd=new HomePO(driver);
        Thread.sleep(20000);
        wait.until(ExpectedConditions.elementToBeClickable(rd.getDeals())).click();
        rd.getThirdEle().click();
        wait.until(ExpectedConditions.elementToBeClickable(rd.getFirstEle())).click();
        rd.getAddToCart().click();

        Thread.sleep(2000);
        driver.findElement(By.id("attach-close_sideSheet-link")).click();
        rd.getCart().click();
        Thread.sleep(2000);
        Assert.assertEquals("1",rd.getQuantity().getText());


        rd.getSearchTab().click();
        rd.getSearchTab().sendKeys("smart phones");
        rd.getSearchSubmit().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 5900)");


        rd.getLastEle().click();

        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it=handles.iterator();
        String parentWindowId = it.next();
        String childWindow =it.next();
        System.out.println(childWindow);
        driver.switchTo().window(childWindow);
        System.out.println(rd.getProductTitle().getText());
        driver.switchTo().defaultContent();

        rd.getNavbar().click();
        wait.until(ExpectedConditions.elementToBeClickable(rd.getMobileBtn())).click();
        wait.until(ExpectedConditions.elementToBeClickable(rd.getSelectMobileBtn())).click();



    }

}
