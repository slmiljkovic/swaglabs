package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    public WebDriver driver;



    private  By addToChartButton = By.id("add-to-cart-sauce-labs-backpack");
    private  By  addToChartButtonCss = By.cssSelector("button.btn btn_primary btn_small btn_inventory[name=add-to-cart-sauce-labs-backpack]");
    private  By addToChartButton1 = By.id("add-to-cart-sauce-labs-bike-light");
    private  By removeFromChartButton = By.id("remove-sauce-labs-backpack");
    private  By removeFromChartButton1 = By.id("remove-sauce-labs-bike-light");
    private  By shoppingCartContainer = By.id("shopping_cart_container");
    private  By inventoryItemName = By.xpath("//*[text()='Sauce Labs Backpack']");
    private  By inventoryItemName1 = By.xpath("//*[text()='Sauce Labs Bike Light']");
    private  By loginTwitterButton = By.className("social_twitter");
    private  By loginFacebookButton = By.className("social_facebook");
    private  By loginLinkedinButton= By.className("social_linkedin");
    public ProductsPage(WebDriver driver) {this.driver = driver;}

    public void clickOnloginFacebookButton(){
        driver.findElement( loginFacebookButton).click();
    }
    public void clickOnloginLinkedinButton(){
        driver.findElement( loginLinkedinButton).click();
    }
    public void clickOnloginTwitterButton(){
        driver.findElement( loginTwitterButton).click();
    }
    public String getButtonName(){return driver.findElement(addToChartButton).getText();}
    public String getinventoryItemName(){return  driver.findElement(inventoryItemName ).getText();}
    public String getinventoryItemName1(){return  driver.findElement(inventoryItemName1 ).getText();}
    public void clickOnRemoveFromChartButton(){driver.findElement(removeFromChartButton).click();}
    public void clickOnAddToChartButton(){driver.findElement(addToChartButton).click();}
    public void clickOnAddToChartButton1(){
        driver.findElement(addToChartButton1).click();
    }
    public void clickOnShoppingCartContainer(){
        driver.findElement(shoppingCartContainer).click();
    }
    public void addItemToChart(){clickOnAddToChartButton();
    clickOnShoppingCartContainer();}
}
