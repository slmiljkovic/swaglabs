package appTests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import pages.ProductsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testLoginOnTwitter extends LoginPageTests {
    ProductsPage productsPage = new ProductsPage(driver);
    @Test
    public void testLoginOnTwiterr() throws InterruptedException {
        testLogInWithValidUsernameAndPassword();
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2200)");
        productsPage.clickOnloginTwitterButton();
        Thread.sleep(5000);
        driver.navigate().to("https://twitter.com/saucelabs");
        Thread.sleep(5000);
        String zeljeniUrlPosleLogovanja1= "https://twitter.com/saucelabs";
        Thread.sleep(10000);
        String dobijeniUrlPosleLogovanja1= driver.getCurrentUrl();
        assertTrue("Nije PRONADJEN Url TWITTER",zeljeniUrlPosleLogovanja1.equals(dobijeniUrlPosleLogovanja1));
    }
    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
