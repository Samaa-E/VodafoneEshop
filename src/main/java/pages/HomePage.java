package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage
{

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    private By englishBtn = By.xpath("//div[@class=\"tabs fluid headerSecondryColor tab-container\"]//span[@class=\"lang\"]");
    private By iphoneBrandBtn = By.xpath("//ul[@class=\"brandContainer-brands-list utag--brands\"]//a[@href=\"/shop/shopByBrand/Apple\"]");

    public void pressEnglishBtn()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(englishBtn));
        driver.findElement(englishBtn).click();
    }
    public void pressIphoneBrandBtn()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(iphoneBrandBtn));
        driver.findElement(iphoneBrandBtn).click();
    }
}
