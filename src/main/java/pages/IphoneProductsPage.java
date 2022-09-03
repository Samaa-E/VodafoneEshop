package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IphoneProductsPage extends BasePage
{
    private By appleWatchNikeSEGPS44mm = By.xpath("//*[@id=\"home-0\"]/div/ul/li[1]");

    public IphoneProductsPage(WebDriver driver)
    {
        super(driver);
    }
    public void selectAppleWatchNikeSEGPS44mm()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(appleWatchNikeSEGPS44mm));
        driver.findElement(appleWatchNikeSEGPS44mm).click();
    }
}
