package appTests;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import pages.*;

import static appTests.BaseTests.driver;
import static org.junit.Assert.assertTrue;

public class testSuccesBuingProduct  extends LoginPageTests{

    ProductsPage productsPage = new ProductsPage(driver);
    ChekoutPage chekoutPage = new ChekoutPage(driver);
   Checkout1Page checkout1Page = new Checkout1Page(driver);

    @Test
    public void testSuccesBuingProduct() throws InterruptedException {
        testLogInWithValidUsernameAndPassword();
        productsPage.addItemToChart();
        String itemNameOnProductPage=productsPage.getinventoryItemName();
        Thread.sleep(5000);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        String itemOnShoppingCartPage=shoppingCartPage.getinventoryItemName();
        assertTrue("Nije isti proizvod",itemNameOnProductPage.equals(itemOnShoppingCartPage));
        shoppingCartPage.clickOnCheckoutButton();
        Thread.sleep(5000);
        chekoutPage.enterFirstLastZip("Sladjana","Miljkov","11080");
        String getInventoronCheckoutPage1 = checkout1Page.getInventoryItemName();
        assertTrue("Nije isti prizvod",itemOnShoppingCartPage.equals(getInventoronCheckoutPage1));
        checkout1Page.clickOnFinishButton();
        Thread.sleep(5000);
    }
    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

}
