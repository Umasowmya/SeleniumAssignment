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


    @FindBy(xpath = "//div[@id='hmenu-content']/ul[@class='hmenu hmenu-visible']/li[28]")
    WebElement accountBtn;


    @FindBy(css = ".ya-card-cell")
    WebElement ordersBtn;


    @FindBy(id="time-filter")
    WebElement dropDown;


    @FindBy(xpath = "(//div[@class='ya-card-cell'])[4]")
    WebElement addressBtn;

    @FindBy(id = "ya-myab-plus-address-icon")
    WebElement addAddressBtn;

    public WebElement getAddAddressBtn(){
        return addAddressBtn;
    }

    public WebElement getAddressBtn(){
        return addressBtn;
    }



    @FindBy(xpath = "(//a[@class='a-link-normal yohtmlc-order-details-link'])[1]")
    WebElement viewOrderBtn;

    @FindBy(xpath = "(//div[@class='a-row a-size-small'])[1]")
    WebElement orderDate;



    @FindBy(id = "address-ui-widgets-enterAddressFullName")
    WebElement fullName;


    @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
    WebElement phoneNumber;

    @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
    WebElement pinCode;


    @FindBy(id = "address-ui-widgets-enterAddressLine1")
    WebElement flatNo;

    @FindBy(id = "address-ui-widgets-enterAddressCity")
    WebElement city;


    @FindBy(id="address-ui-widgets-enterAddressLine2")
    WebElement street;


    @FindBy(id = "address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")
    WebElement state;


    @FindBy(className = "a-button-input")
    WebElement addressSubmit;

    @FindBy(xpath = "(//div[@class='ya-card-cell'])[5]")
    WebElement paymentBtn;


    @FindBy(xpath = "(//span[@class='a-button-inner'])[2]")
    WebElement addCreditCard;

    @FindBy(name="addCreditCardNumber")
    WebElement cardNo;

    @FindBy(name="ppw-accountHolderName")
    WebElement cardName;


    @FindBy(name = "ppw-expirationDate_month")
    WebElement expiryMonth;

    @FindBy(name = "ppw-expirationDate_year")
    WebElement expiryYear;

    @FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
    WebElement addCard;


    @FindBy(name = "ppw-widgetEvent:SelectAddressEvent")
    WebElement allotAddress;


    @FindBy(id="ap_email")
    WebElement email;


    @FindBy(id="ap_password")
    WebElement password;

    @FindBy(id  ="signInSubmit")
    WebElement loginSubmit;

    @FindBy(id  ="continue")
    WebElement continueBtn;


    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    WebElement signIn;

    public WebElement getSignIn(){
        return signIn;
    }

    public WebElement getLoginSubmit(){
        return loginSubmit;
    }

    public WebElement getContinueBtn(){
        return continueBtn;
    }

    public WebElement getEmail(){
        return email;
    }

    public WebElement getPassword(){
        return password;
    }
    public WebElement getAllotAddress(){
        return allotAddress;
    }

    public WebElement getAddCard(){
        return addCard;
    }

    public WebElement getExpiryMonth(){
        return expiryMonth;
    }

    public WebElement getExpiryYear(){
        return expiryYear;
    }
    public WebElement getCardName(){
        return cardName;
    }


    public WebElement getCardNo(){
        return cardNo;
    }


    public WebElement getAddCreditCard(){
        return addCreditCard;
    }


    public WebElement getPaymentBtn(){
        return paymentBtn;
    }

    public WebElement getAddressSubmit(){
        return addressSubmit;
    }

    public WebElement getState(){
        return state;
    }


    public WebElement getStreet(){
        return street;
    }

    public WebElement getCity(){
        return city;
    }


    public WebElement getFlatNo(){
        return flatNo;
    }
    public WebElement getPinCode(){
        return pinCode;
    }

    public WebElement getPhoneNumber(){
        return phoneNumber;
    }



    public WebElement getFullName(){
        return fullName;
    }


    public WebElement getOrderDate(){
        return orderDate;
    }


    public WebElement getViewOrderBtn(){return viewOrderBtn;}

    public WebElement getDropDown(){
        return dropDown;
    }



    public WebElement getOrdersBtn(){
        return ordersBtn;
    }



    public WebElement getAccountBtn(){
        return accountBtn;
    }



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
