package utilities;

import pages.*;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private AccountPage accountPage;
    private ProductPage productPage;
    private RegistrationPage registrationPage;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }

        return loginPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public AccountPage accountPage() {
        if (accountPage == null) {
            accountPage = new AccountPage();
        }
        return accountPage;
    }

    public RegistrationPage registration() {
        if (registrationPage == null) {
            registrationPage = new RegistrationPage();
        }
        return registrationPage;
    }

    public ProductPage productPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }
}
