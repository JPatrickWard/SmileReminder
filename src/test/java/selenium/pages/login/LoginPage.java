package selenium.pages.login;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.pages.core.PageBase;
import selenium.pages.elements.Input;

public class LoginPage extends PageBase {

	@FindBy(id="okta-signin-username")
	private WebElement usernameInput;

	@FindBy(id="okta-signin-password")
	private WebElement passwordInput;

	@FindBy(id="okta-signin-submit")
	private WebElement signInButton;

}
