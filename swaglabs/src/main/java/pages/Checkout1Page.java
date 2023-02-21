package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout1Page {
    public WebDriver driver;
    private  By finshButton = By.id("finish");
    private By inventoryItemName = By.xpath("//*[text()='Sauce Labs Backpack']");
    private By inventoryItemName1 = By.xpath("//*[text()='Sauce Labs Bike Light']");
    public String getInventoryItemName(){return  driver.findElement(inventoryItemName ).getText();}
    public String getInventoryItemName1(){return  driver.findElement(inventoryItemName1 ).getText();}
    public Checkout1Page(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnFinishButton(){
        driver.findElement(finshButton).click();
    }
}
