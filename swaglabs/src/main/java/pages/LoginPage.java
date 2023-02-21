package pages;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class LoginPage {
    public WebDriver driver;
    //public WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker().enableRecording();

    private By userNameInputField = By.id("user-name");

    private By passwordInputField = By.id("password");

    private By logInButton = By.id("login-button");

    private By errorMessage = By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");
    private By errorMessage1 = By.xpath("//*[text()='Epic sadface: Password is required']");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserNameEnterPassword(String textToEnterToUserNameInputField,String textToEnterToPasswordInputField) throws InterruptedException {
        driver.findElement(getUserNameInputField()).sendKeys(textToEnterToUserNameInputField);
        driver.findElement(passwordInputField).sendKeys(textToEnterToPasswordInputField);
        driver.findElement(logInButton).click();
        Thread.sleep(5000);
        if(textToEnterToPasswordInputField=="standard_user"&&textToEnterToPasswordInputField=="secret_sauce"){
        String zeljeniUrlPosleLogovanja="https://www.saucedemo.com/inventory.html";
        String  dobijeniUrlPosleLogovanja=driver.getCurrentUrl();
        Assert.assertTrue( zeljeniUrlPosleLogovanja.equals( dobijeniUrlPosleLogovanja),"nije ulogovan USER");
    }}
    public void enterUserName(String textToEnterToUserNameInputField){
        driver.findElement(getUserNameInputField()).sendKeys(textToEnterToUserNameInputField);
    }

    public void enterPassword(String textToEnterToPasswordInputField){
        driver.findElement(passwordInputField).sendKeys(textToEnterToPasswordInputField);
    }


    public void clickOnLogInButton(){
        driver.findElement(logInButton).click();
    }

    public String getErrorMessageText(){
        return driver.findElement(errorMessage).getText();
    }
    public String getErrorMessageTextForNoPassword(){
        return driver.findElement(errorMessage1).getText();
    }

    public By getUserNameInputField() {return userNameInputField;}



}

