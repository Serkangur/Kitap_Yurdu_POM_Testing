package constants;

import org.openqa.selenium.By;

public class ConstantsBookDetailPage {
    public static By urun_fiyat = By.xpath("//div[@class=\"pr_price__content pr_sell-price\"]");
    public static By sepeteEkle= By.id("button-cart");
    public static By bookName= By.xpath("//h1[@class=\"pr_header__heading\"]");
    public  static By cartPlace= By.xpath("//div[@class=\"heading\"]");
    public  static By cartBookName = By.xpath("//div[@class=\"ellipsis\"]");
    public static By cartClick = By.xpath("//a[@id=\"js-cart\"]");
}
