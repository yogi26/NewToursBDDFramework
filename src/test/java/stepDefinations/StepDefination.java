package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.BaseTest;
import WebPages.FindFlightPage;
import WebPages.SignOnPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends BaseTest
{
	WebDriver driver=null;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		signOn=new SignOnPage(driver);
	}
	@When("^title of New tours is \"([^\"]*)\"$")
	public void title_of_New_tours_is(String title)
	{
		Assert.assertTrue(signOn.getPageTitle().equals(title));
	}

	@Then("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String username, String password)
	{
		signOn.performSignOn(username, password);
	}
	@Then("^user click on sign on button$")
	public void user_click_on_sign_on_button()
	{
		signOn.clickOnLogin();
		
	}

	@Then("^user is on Find a Flight page$")
	public void user_is_on_Find_a_Flight_page()
	{
		flightPage=new FindFlightPage(driver);
		boolean flag=flightPage.getPageTitle().equalsIgnoreCase("Find a Flight: Mercury Tours: ");
		Assert.assertTrue(flag);
	}
	@Then("^user close the browser$")
	public void user_close_the_browser(){
		driver.quit();
	}
}
