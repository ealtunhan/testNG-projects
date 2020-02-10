package utilities;

import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.RegistrationPage;

public class Pages {
    private LoginPage loginPage;
    private HomePage homePage;
    private AccountPage accountPage;
    private ProductPage productPage;
    private RegistrationPage registrationPage;

    public Pages() {
    }

    public LoginPage login() {
        if (this.loginPage == null) {
            this.loginPage = new LoginPage();
        }

        return this.loginPage;
    }

    public HomePage homePage() {
        if (this.homePage == null) {
            this.homePage = new HomePage();
        }

        return this.homePage;
    }

    public AccountPage accountPage() {
        if (this.accountPage == null) {
            this.accountPage = new AccountPage();
        }

        return this.accountPage;
    }

    public RegistrationPage registration() {
        if (this.registrationPage == null) {
            this.registrationPage = new RegistrationPage();
        }

        return this.registrationPage;
    }

    public ProductPage productPage() {
        if (this.productPage == null) {
            this.productPage = new ProductPage();
        }

        return this.productPage;
    }
}
