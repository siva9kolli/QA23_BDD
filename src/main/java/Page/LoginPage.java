package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#user-name")
    WebElement userNameInputField;

    @FindBy(id = "password")
    WebElement passwordInputField;

    @FindBy(name = "login-button")
    WebElement signInButton;

    public void login(String userName, String pwd, String description){
        userNameInputField.sendKeys(userName);
        passwordInputField.sendKeys(pwd);
        signInButton.click();
        System.out.println("Test result :: " + description);
    }

}
