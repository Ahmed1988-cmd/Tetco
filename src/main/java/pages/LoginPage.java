package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ActionUtils;

public class LoginPage extends PageBase

{
    WebDriver driver;

    public LoginPage(WebDriver driver)

    {
        super(driver);
        this.driver=driver;
    }

    @FindBy(name = "UserName")
    WebElement UsernameText;
    @FindBy(name = "password")
    WebElement PasswordText;
    @FindBy(id = "m_login_signin_submit")
    WebElement LoginButton;

    public void Login(String username ,String pass)
    {
        ActionUtils.fillElement(driver,UsernameText,username);
        ActionUtils.fillElement(driver,PasswordText,pass);
        ActionUtils.clickOnElement(driver,LoginButton);
    }


}
