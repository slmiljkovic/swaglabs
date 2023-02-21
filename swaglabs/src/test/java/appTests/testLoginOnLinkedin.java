package appTests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import pages.ProductsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testLoginOnLinkedin extends  LoginPageTests{
    ProductsPage productsPage = new ProductsPage(driver);
    @Test
    public void testLoginOnLinkedin() throws InterruptedException {
        logInPage.enterUserNameEnterPassword("standard_user","secret_sauce");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2200)");
        productsPage.clickOnloginLinkedinButton();
        Thread.sleep(10000);
        String zeljeniUrlPosleLogovanja1= "https://www.linkedin.com/authwall?trk=gf&trkInfo=AQGF0M-_cwGTCgAAAYVAH_-Ioig_lDPa2yxOzZye-dcxtGuul2jmNm05KMjORXZMloua0CSZkdG1u3zlA7LBBCebIwve7l23YjWU9AHVaQWphYQPZo4cHb7oKVYHZHAzRsWDp5s=&original_referer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F";
        String dobijeniUrlPosleLogovanja1= driver.getCurrentUrl();
        assertTrue("Nije PRONADJEN Url Linkedin",zeljeniUrlPosleLogovanja1.contains("www.linkedin.com"));
    }
    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

}
