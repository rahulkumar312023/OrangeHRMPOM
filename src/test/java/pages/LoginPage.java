package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public String loginPageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    public By usernameBox = By.xpath("//input[@placeholder='Username']");

    public By passwordInputBox = By.xpath("//input[@placeholder='Password']");

    public By loginButton = By.xpath("//button[normalize-space()='Login']");

}
