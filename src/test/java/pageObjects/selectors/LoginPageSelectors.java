package pageObjects.selectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageSelectors {

    //<-------------------------------------------------------------------------------------------------->
//Selectors

    //Login modal
    @FindBy(css = ".user-box__form")
    protected WebElement loginModal;

    //Inputs
    @FindBy(css = "input[name='username']")
    protected WebElement loginEmailInput;

    @FindBy(css = "input[name='password']")
    protected WebElement loginPasswordInput;

    @FindBy(css = "[invalid-text='Wpisz swój login']")
    protected WebElement noEmailAlert;

    @FindBy(css = "[invalid-text='Wpisz swoje hasło']")
    protected WebElement noPassAlert;

    //Login button
    @FindBy(css = ".user-box__btn")
    protected WebElement loginButton;

    //User account after login
    @FindBy(css = ".user-box__user-name span")
    protected WebElement userNameAfterLogin;


}
