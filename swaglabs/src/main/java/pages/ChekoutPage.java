package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChekoutPage {
    public WebDriver driver;

    public ChekoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public ChekoutPage(By firstNameInputField) {
        this.firstNameInputField = firstNameInputField;
    }
    private  By continueButton = By.id("continue");
    private By firstNameInputField = By.id("first-name");
    private By lastNameInputField = By.id("last-name");
    private By zipPostalCodeField = By.id("postal-code");

    public void enterfirstNameInputField(String textToEnterToFirstNameInputField)
    {
        driver.findElement(gettextToEnterToFirstNameInputField()).sendKeys(textToEnterToFirstNameInputField);}
    public void enterFirstLastZip(String textToEnterToFirstNameInputField,String textToEnterToLastNameInputField,String textToEnterTozipPostalNameInputField) throws InterruptedException {
        Thread.sleep(5000);
        enterfirstNameInputField( textToEnterToFirstNameInputField);
        enterlastNameInputField(textToEnterToLastNameInputField);
        enterzipPostalNameInputField( textToEnterTozipPostalNameInputField);
        Thread.sleep(5000);
        clickOncontinueButton();
    }
    public  By gettextToEnterToFirstNameInputField() {return firstNameInputField;}
    public void enterlastNameInputField(String textToEnterToLastNameInputField){
        driver.findElement(gettextToEnterToLasttNameInputField()).sendKeys(textToEnterToLastNameInputField);}
    public By gettextToEnterToLasttNameInputField() {return lastNameInputField;}
    public void enterzipPostalNameInputField(String textToEnterTozipPostalNameInputField){
        driver.findElement(gettextToEnterTozipPostalNameInputField()).sendKeys(textToEnterTozipPostalNameInputField);}
    public By gettextToEnterTozipPostalNameInputField() {return zipPostalCodeField;}
    public void clickOncontinueButton(){
        driver.findElement(continueButton).click();
    }
}
