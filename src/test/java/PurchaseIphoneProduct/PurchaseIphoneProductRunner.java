package PurchaseIphoneProduct;

import basePackage.BaseTest;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions (glue = "PurchaseIphoneProduct",
        features = "src/test/java/PurchaseIphoneProduct",
        plugin = {"pretty","html:tsrget/cucumber-html-report"})
public class PurchaseIphoneProductRunner extends BaseTest
{

}
