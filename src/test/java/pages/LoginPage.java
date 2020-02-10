package pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestBase;

public class LoginPage extends TestBase {
    @FindBy(
            xpath = "//*[@class='login']"
    )
    public WebElement singInLink;
    @FindBy(
            id = "email"
    )
    public WebElement emailInput;
    @FindBy(
            id = "passwd"
    )
    public WebElement passwordInput;
    @FindBy(
            id = "SubmitLogin"
    )
    public WebElement loginButton;
    @FindBy
    public WebElement logoutButton;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
