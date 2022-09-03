package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppleWatchNikeSEGPS44mmPage extends BasePage
{
    //private By addToBasketBtn = By.xpath("//button[@class=\"btn btn-red btn-block fontLightEnAr\"]");
    private By addToBasketBtn = By.xpath("/html/body/app-root/app-product-details/div/div[1]/div/div[3]/div/div/div[2]/button");
    private By productTitle = By.xpath("//h1[@id=\"productNameHeading\"]");
    public AppleWatchNikeSEGPS44mmPage(WebDriver driver)
    {
        super(driver);
    }
    public void PressAddToBasketBtn()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToBasketBtn));
        driver.findElement(addToBasketBtn).click();
    }
    public String getProductTitle()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        return driver.findElement(productTitle).getText();
    }
}
