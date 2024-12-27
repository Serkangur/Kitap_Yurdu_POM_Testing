package pages;

import base.BasePage;

import org.openqa.selenium.WebDriver;
import static constants.ConstantsHomePage.*;



public class HomePage extends BasePage {




    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickCookieButton() {
        clickToWebElement(cerez_Button);
    }

public void setSearch_Input() {
        searchInputMethod("Sabahattin Ali",search_Input);
}

}
