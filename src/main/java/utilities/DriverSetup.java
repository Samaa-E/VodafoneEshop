package utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverSetup
{
    private static String url = "https://eshop.vodafone.com.eg/eshop/";
    public static WebDriver DriverInitiate(String browser)
    {
        WebDriver driver = null;
        if (browser == "chrome")
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser == "firefox")
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browser == "edge")
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Browser is not Supported");
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
