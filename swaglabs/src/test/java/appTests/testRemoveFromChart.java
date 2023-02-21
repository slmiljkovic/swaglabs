package appTests;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import pages.Checkout1Page;
import pages.ChekoutPage;
import pages.ProductsPage;

import static appTests.BaseTests.driver;
import static org.junit.Assert.assertTrue;

public class testRemoveFromChart extends testAddToChartProduct {
    ProductsPage productsPage = new ProductsPage(driver);
    ProductsPage productsPage2=new ProductsPage( driver);
    ChekoutPage chekoutPage = new ChekoutPage(driver);
    Checkout1Page checkout1Page = new Checkout1Page(driver);

    @Test
    public void removeFromChartProduct() throws InterruptedException {
          testAddToChartProduct();
        productsPage.clickOnRemoveFromChartButton();
        assertTrue("Greska NIJE Uklonjen Priozvod",productsPage2.getButtonName().equals("ADD TO CART"));
    }
}
