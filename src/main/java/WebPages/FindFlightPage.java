package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindFlightPage 
{
	WebDriver driver;
	public FindFlightPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
}
