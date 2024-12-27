package tests;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BookDetailPage;
import pages.BooksPage;
import pages.CartPage;
import pages.HomePage;

public class Kitap_Yurdu_Test extends BaseTest {
    HomePage homePage;
    BooksPage booksPage;
    BookDetailPage bookDetailPage;
    CartPage cartPage;

    @Test
    public void test() throws InterruptedException {

    homePage = new HomePage(driver);
    homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
    homePage.clickCookieButton();
    homePage.setSearch_Input();

    booksPage = new BooksPage(driver);
    booksPage.listingDropDown();
    booksPage.inStock();
    booksPage.pageClick();
    booksPage.bookClick();

    bookDetailPage = new BookDetailPage(driver);
    bookDetailPage.setBookPrice();
    bookDetailPage.addCart();
    bookDetailPage.goToCartPlace();
    bookDetailPage.cartBooksControl();
    bookDetailPage.cartClick();

        cartPage = new CartPage(driver);
        cartPage.valueAdd();
        Thread.sleep(2000);
        cartPage.compareProductPrice();
        cartPage.cleanCart();
        Thread.sleep(2000);
        cartPage.setCartLastControl();

















}

}
