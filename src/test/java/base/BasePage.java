package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getDriver(String url){
        driver.get(url);
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public  void clickToWebElement (By locator){
        find(locator).click();
    }
    public void searchInputMethod(String input,By locator) {
        find(locator).sendKeys(input, Keys.ENTER);
    }
    public void selectElement(By locator, String selected){
        Select select =new Select(find(locator));
        select.selectByVisibleText(selected);
    }

    public void stockControl(By locator){
        if(!find(locator).isSelected()){

            find(locator).click();
        }
    }

    public void getTextMethod(By locator){
        String text = find(locator).getText();
        System.out.println(text);
    }
    public String getTextMethodString(By locator) {
        String text = find(locator).getText();
        return text;
    }

    public void assertEquals(By locator1,By locator2){
        Assert.assertEquals(find(locator1).getText(),find(locator2).getText());
        getTextMethod(locator1);
    }

    public void actionsClickElement(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(locator)).click().perform();
    }

    public void cartControl(By locator){
       String cart= getTextMethodString(locator);

        if (cart.contains("0")){
            System.out.println("Sepet boştur");
        }else{
            System.out.println("Sepetteki ürün miktarı: "+cart);
        }


    }


}
