package constants;

import org.openqa.selenium.By;

public class ConstantsBooksPage {

    public static By siralama =By.xpath("(//select[@onchange=\"location = this.value;\"])");
    public  static By stokta_olanlar_Button= By.xpath("(//span[@class=\"custom-checkmark\"])[2]");
    public  static By sayfa_Tiklama= By.xpath("(//div[@class=\"links\"])/a[1]");
    public static  By secilen_kitap= By.xpath("//div[@class=\"product-list\"]/div[3]//a");
}
