package steps;

import Page.LoginPage;
import Page.UserWelcomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import runner.Runner;

public class LoginStep extends Runner {
    public LoginPage loginPage;
    public UserWelcomePage userWelcomePage;
    public static WebDriver driver;

    @After
    public static void killSession(){
        driver.quit();
    }

    @Before
    public static void setUp(){
        WebDriverManager.edgedriver().setup();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        EdgeOptions options = new EdgeOptions();
        desiredCapabilities.setCapability("browserName", "chrome");
        options.merge(desiredCapabilities);
        driver = new EdgeOptions(options);
        driver.get("https://www.saucedemo.com/");
    }

    @Then("User enter username {string} and password {string} and sumbit login form")
    public void user_enter_username_and_password_and_sumbit_login_form(String string, String string2) {
        loginPage = new LoginPage(driver);
        loginPage.login(string, string2, "Entered successfully username and password");
    }
    @Then("User verify Home screen")
    public void user_verify_home_screen() {
        userWelcomePage = new UserWelcomePage(driver);
        Assert.assertTrue(userWelcomePage.verifyLogoPresent());
    }
}
