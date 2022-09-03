package basePackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.DriverSetup;

public class BaseTest extends AbstractTestNGCucumberTests
{
    public WebDriver driver;
    @BeforeClass
    public void invokeBrowser()
    {
        //this.driver = DriverSetup.DriverInitiate("chrome");
    }
    @AfterClass
    public void tearDown()
    {
        //this.driver.quit();
    }
}
