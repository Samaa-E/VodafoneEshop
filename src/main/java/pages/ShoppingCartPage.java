package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartPage extends BasePage
{
    private By checkoutBtn = By.xpath("//button[text()='Proceed to Checkout ']");
    public ShoppingCartPage(WebDriver driver)
    {
        super(driver);
    }
    public void pressCheckoutBtn()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutBtn));
        driver.findElement(checkoutBtn).click();
    }
}
