package PageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePO {

    WebDriver driver;
    public HomePO(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Today's Deals")
    WebElement dealsBtn;

    @FindBy(xpath = "//div[@aria-label='Deals grid']//div[3]")
    WebElement thirdEle;


    @FindBy(xpath="//ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-none']//li[2]")
    WebElement firstEle;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCart;


    @FindBy(id = "twotabsearchtextbox")
    WebElement searchTab;

    @FindBy(id="nav-search-submit-button")
    WebElement searchSubmit;


    @FindBy(xpath = "//div[@data-component-type='s-search-result'][last()]//span")
    WebElement lastEle;

    @FindBy(id="productTitle")
    WebElement productTitle;


    @FindBy(id="nav-hamburger-menu")
    WebElement navbar;


    @FindBy(xpath = "//a[@data-menu-id='8']")
     WebElement mobileBtn;

    @FindBy(xpath = "//li/a[contains(text(),'All Mobile Phones')]")
    WebElement selectMobileBtn;

    public WebElement getSelectMobileBtn(){
        return selectMobileBtn;
    }


    public WebElement getMobileBtn(){
        return mobileBtn;
    }

    public WebElement getNavbar(){
        return navbar;
    }

    public WebElement getProductTitle(){
        return productTitle;
    }

    public WebElement getLastEle(){
        return lastEle;
    }



    public WebElement getSearchSubmit(){
        return searchSubmit;
    }

    public WebElement getSearchTab(){
        return searchTab;
    }


    @FindBy(id="nav-cart")
    WebElement cartBtn;

    @FindBy(className = "a-dropdown-prompt")
    WebElement quantity;

    public WebElement getQuantity(){
        return quantity;
    }

    public WebElement getCart(){
        return cartBtn;
    }

    public WebElement getAddToCart(){
        return addToCart;
    }

    public WebElement getDeals(){
        return dealsBtn;
    }

    public WebElement getThirdEle(){
        return thirdEle;
    }

    public WebElement getFirstEle(){
        return firstEle;
    }


}
