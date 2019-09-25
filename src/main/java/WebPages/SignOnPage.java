package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage
{
	WebDriver driver=null;
	public SignOnPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	//Actions Methods
	public void setUsername(String username)
	{
		userName.sendKeys(username);
	}
	public void setPassword(String password)
	{
		this.password.sendKeys(password);
	}
	public void clickOnLogin()
	{
		login.click();
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void performSignOn(String unm,String pass)
	{
		setUsername(unm);
		setPassword(pass);
	}
}
