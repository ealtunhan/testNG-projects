package tests.smokeTest;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class LoginTest extends TestBase {
    public LoginTest() {
    }

    @Test
    public void login() {
        this.pages.login().singInLink.click();
        this.pages.login().emailInput.sendKeys(new CharSequence[]{ConfigurationReader.getProperty("email")});
        this.pages.login().passwordInput.sendKeys(new CharSequence[]{ConfigurationReader.getProperty("password")});
        this.pages.login().loginButton.click();
    }
}
