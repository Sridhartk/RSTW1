package in.royalsundaram.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSTWIntroPage {
	@FindBy(xpath="//a[@title='Two Wheeler Insurance']")
	WebElement TWIBTN;
	
	public RSTWIntroPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickBTN()
	{
		TWIBTN.click();
	}
}
