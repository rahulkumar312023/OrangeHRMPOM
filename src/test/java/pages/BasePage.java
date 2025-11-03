package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utilities.DriverSetUp.getBrowser;

public class BasePage {
    public WebElement getElement(By locator){

        return getBrowser().findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text){
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(text);
    }


}
