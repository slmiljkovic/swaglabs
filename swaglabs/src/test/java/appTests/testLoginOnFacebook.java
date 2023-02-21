package appTests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import pages.ProductsPage;

import static org.junit.Assert.assertTrue;

public class testLoginOnFacebook extends LoginPageTests{
    ProductsPage productsPage = new ProductsPage(driver);
    @Test
    public void testLoginOnFacebook() throws InterruptedException {
        logInPage.enterUserNameEnterPassword("standard_user","secret_sauce");
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2200)");
        productsPage.clickOnloginFacebookButton();
        Thread.sleep(5000);
        driver.navigate().to("https://www.facebook.com/saucelabs");
        String zeljeniUrlPosleLogovanja1= "https://www.facebook.com/saucelabs";
        String dobijeniUrlPosleLogovanja1= driver.getCurrentUrl();
        assertTrue("Nije PRONADJEN Url TWITTER",zeljeniUrlPosleLogovanja1.equals(dobijeniUrlPosleLogovanja1));
    }
}
