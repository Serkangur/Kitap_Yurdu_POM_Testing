package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import static constants.ConstantsBookDetailPage.*;

public class BookDetailPage extends BasePage {

    public BookDetailPage(WebDriver driver) {
        super(driver);
    }

    public void setBookPrice(){
        getTextMethod(urun_fiyat);
    }

    public void addCart(){
        clickToWebElement(sepeteEkle);
    }

    public void goToCartPlace(){
        clickToWebElement(cartPlace);
    }

   public void cartBooksControl(){
       assertEquals(bookName,cartBookName);
   }

   public void cartClick(){
        clickToWebElement(cartClick);
   }



}
