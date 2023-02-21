package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    public WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    private  By inventoryItemName=By.xpath("//*[text()='Sauce Labs Backpack']");
    public String getinventoryItemName(){return  driver.findElement(inventoryItemName ).getText();}
    private By checkoutButton = By.id("checkout");
    private By continueShoppingButton = By.id("continue-shopping");
    public void clickOnContinueShoppingButton(){
        driver.findElement(continueShoppingButton).click();}
        public void clickOnCheckoutButton(){
            driver.findElement(checkoutButton).click();}
}
