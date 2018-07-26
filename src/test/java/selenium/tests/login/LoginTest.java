package selenium.tests.login;

import org.openqa.selenium.*;
import selenium.pages.common.navbar.NavBar;
import selenium.pages.login.*;

public class LoginTest {
	private Enduser enduser;

	@Test
	public void enterInvalidCredentials() {

		Webdriver driver = new FirefoxDriver();
		LoginPage loginpage = open(LoginPage.class);

		driver.navigate().to("https://www.smilereminder.com/sr/login.jsp");
		Assert.assertTrue("homepage should display",
			driver.getTitle.startsWith("Solutionreach"));


		loginpage.loginAsUser(enduser.badCredentials());
		Assert.assertTrue (message: "Invalid token provided");

		driver.close();

	}

}
