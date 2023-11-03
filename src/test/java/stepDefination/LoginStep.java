package stepDefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pagaObjects.LoginPom;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStep extends Base{
	public LoginPom lp;
	@Given("Launch the ChromeBrowser")
	public void launch_the_chrome_browser() {
		driver=new ChromeDriver();
		lp=new LoginPom();

	}
	@When("Open the Url")
	public void open_the_url() throws IOException {
		driver.manage().window().maximize();

		launchWeb();
	}
	

	@When("Enters the UserName")
	public void enters_the_user_name() {
	
		implicitWait();
		lp.setUserN(lp.getUserName());
	}

	@When("Enters the Password")
	public void enters_the_password() {

		implicitWait();
		lp.setPass(lp.getPass());

	}

	@When("Click on login")
	public void click_on_login() {

		implicitWait();
		lp.clickOnLogin();

	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		String A_Title=driver.getTitle();
		Assert.assertEquals(title,A_Title);
	}
	

	@When("Enters the UserName as {string} and enters the Password as {string}")
	public void enters_the_user_name_as_and_enters_the_password_as(String user, String pass) {
		implicitWait();
		lp.setUserN(user);
		lp.setPass(pass);
	}
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}







}
