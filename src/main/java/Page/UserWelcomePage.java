package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserWelcomePage {

    public UserWelcomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS , using = ".title")
    WebElement logo;

    public boolean verifyLogoPresent(){
        return logo.isDisplayed();
    }

}
