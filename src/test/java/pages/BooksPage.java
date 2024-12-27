package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import static constants.ConstantsBooksPage.*;

public class BooksPage extends BasePage {


    public BooksPage(WebDriver driver) {
        super(driver);
    }

    public void listingDropDown(){
        selectElement(siralama,"Alfabetik");
    }
    public void inStock (){
        stockControl(stokta_olanlar_Button);
    }
    public void pageClick(){
        clickToWebElement(sayfa_Tiklama);
    }
    public void bookClick(){
        clickToWebElement(secilen_kitap);
    }


}
