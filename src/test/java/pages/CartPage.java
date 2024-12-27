package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static constants.ConstantsCartPage.*;

public class CartPage extends BasePage {


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void valueAdd(){
        clickToWebElement(bookAdd);
    }

    public void compareProductPrice(){
        assertEquals(productDetailPrice,productPrice);

    }

    public void cleanCart() throws InterruptedException {
        clickToWebElement(cleanCart);
        Thread.sleep(1000);
        clickToWebElement(cleanCartClick);
    }

    public void setCartLastControl(){
        cartControl(cartLastControl);
    }
}
