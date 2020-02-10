package tests.smokeTest;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void login(){
        pages.login().singInLink.click();
        pages.login().emailInput.sendKeys(ConfigurationReader.getProperty("email"));
        pages.login().passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        pages.login().loginButton.click();
    }
}
