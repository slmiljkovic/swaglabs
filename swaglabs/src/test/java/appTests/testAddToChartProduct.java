package appTests;

import org.junit.Test;
import pages.Checkout1Page;
import pages.ChekoutPage;
import pages.ProductsPage;
import pages.ShoppingCartPage;

import static org.junit.Assert.assertTrue;

public class testAddToChartProduct extends LoginPageTests {

    ProductsPage productsPage = new ProductsPage(driver);
    ProductsPage productsPage1=new ProductsPage( driver);
    ChekoutPage chekoutPage = new ChekoutPage(driver);
    Checkout1Page checkout1Page = new Checkout1Page(driver);
    @Test
    public void testAddToChartProduct() throws InterruptedException {

        testLogInWithValidUsernameAndPassword();
        productsPage.addItemToChart();
        String itemNameOnProductPage=productsPage.getinventoryItemName();
        Thread.sleep(10000);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        String itemOnShoppingCartPage=shoppingCartPage.getinventoryItemName();
        assertTrue("Nije isti proizvod",itemNameOnProductPage.equals(itemOnShoppingCartPage));
        shoppingCartPage.clickOnContinueShoppingButton();
        Thread.sleep(10000);
        productsPage1.clickOnAddToChartButton1();
        Thread.sleep(5000);
        String itemNameOnProductPage1=productsPage1.getinventoryItemName1();
        assertTrue("Nije isti prizvod",itemNameOnProductPage1.equals("Sauce Labs Bike Light"));
        Thread.sleep(5000);}

}