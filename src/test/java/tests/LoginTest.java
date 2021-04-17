package tests;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginTest extends TestBase {

    @Test(description = "Verifies successful user login")
    public void verifySuccessfulUserLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToWebsite();
    }

    @Test(description = "Verifies lack of email and password alert message")
    public void verifyLackEmailAndPasswordAlerts() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLackOfEmailAndPasswordAlerts();

    }

}
