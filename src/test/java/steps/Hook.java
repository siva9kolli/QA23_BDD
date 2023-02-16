package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hook {

    @BeforeAll
    public static void startSession(){
        System.out.println("Intialize Report");
    }

    @AfterAll
    public static void endSession(){
        System.out.println("KIll Session");
    }

    @Before
    public void beforeStep(){
        System.out.println("Before Step");
    }

    @After
    public void afterStep(){
        System.out.println("After Step");
    }
}
