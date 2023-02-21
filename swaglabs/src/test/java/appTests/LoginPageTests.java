package appTests;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import pages.*;
import static org.junit.Assert.assertTrue;
public class LoginPageTests extends BaseTests{
    LoginPage logInPage = new LoginPage(driver);
 //   @Before
  //  public void setUp() {driver.get("https://www.saucedemo.com/");}
    //TEST 1
    @Test
    public void testLogInWithValidUsernameAndPassword() throws InterruptedException {

       logInPage.enterUserNameEnterPassword("standard_user","secret_sauce");
        }
    @Test
    public void testLogInWithValidUsernameInvalidPassword() throws InterruptedException {
        logInPage.enterUserNameEnterPassword("standard_user","XXXX");
        //Thread.sleep(5000);
        String desiredErrorMessage="Epic sadface: Username and password do not match any user in this service";
        String  expectedErrorMessage=logInPage.getErrorMessageText();
        assertTrue("GRESKA",desiredErrorMessage.equals(expectedErrorMessage));}
    @Test
    public void testLogInWithInvalidUsernameInvalidPassword() throws InterruptedException {
        logInPage.enterUserNameEnterPassword("AAAAAAAA","XXXX");
       // Thread.sleep(10000);
        String desiredErrorMessage="Epic sadface: Username and password do not match any user in this service";
        String  expectedErrorMessage=logInPage.getErrorMessageText();
        assertTrue("GRESKA",desiredErrorMessage.equals(expectedErrorMessage));}
    @Test
    public void testLogInWithInalidUsernameValidPassword() throws InterruptedException {
        logInPage.enterUserNameEnterPassword("AAAAAAAA","secret_sauce");
        //Thread.sleep(10000);
        String desiredErrorMessage="Epic sadface: Username and password do not match any user in this service";
        String  expectedErrorMessage=logInPage.getErrorMessageText();
        assertTrue("GRESKA",desiredErrorMessage.equals(expectedErrorMessage));
    }
    @Test
    public void testLogInWithUsernameNoPassword() throws InterruptedException{
        logInPage.enterUserName("standard_user");
        logInPage.clickOnLogInButton();
        //Thread.sleep(5000);
        String desiredErrorMessage="Epic sadface: Password is required";
        String  expectedErrorMessage=logInPage.getErrorMessageTextForNoPassword();
        assertTrue("GRESKA Morate ukucati lozinku",desiredErrorMessage.equals(expectedErrorMessage));
    }




}
