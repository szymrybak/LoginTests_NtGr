package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.selectors.LoginPageSelectors;
import static org.testng.Assert.assertTrue;

public class LoginPage extends LoginPageSelectors {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//<-------------------------------------------------------------------------------------------------->
//Methods

    public void loginToWebsite() {
        checkIfLoginModalIsDisplayed();
        typeEmailAddress("larrysmith");
        typePassword("testowePass123");
        submitLogin();
        checkIfUserAccountIsDisplayed();
    }

    public void checkIfLoginModalIsDisplayed() {
        assertTrue(loginModal.isDisplayed());
    }

    public void typeEmailAddress(String email) {
        loginEmailInput.sendKeys(email);

    }

    public void typePassword(String password) {
        loginPasswordInput.sendKeys(password);
    }

    public void submitLogin() {
        loginButton.click();
    }

    public void checkIfUserAccountIsDisplayed() {
        assertTrue(userNameAfterLogin.isDisplayed());
    }

    public void checkLackOfEmailAndPasswordAlerts() {
        loginButton.click();
        assertTrue(noEmailAlert.isDisplayed());
        assertTrue(noPassAlert.isDisplayed());

    }

}


