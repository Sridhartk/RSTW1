package in.royalsundaram.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Factory;

public class TWOCREPage {
	@FindBy(xpath="//select[@onchange='ncbcurrentpolicy();']")
	private WebElement NoClaimBouns;
	
	@FindBy(xpath="//option[text()='-- Select --']")
	private WebElement NCB;
	
	@FindBy(xpath="(//select)[3]")
	private WebElement Title;
	
	@FindBy(xpath="//option[text()='-- Select Title --']")
	private WebElement title;
	
	@FindBy(xpath="//input[@placeholder='Please enter your name']")
    private WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Please enter your email id']")
	private WebElement email;
	
	@FindBy(xpath="//button[@title='Get Quote']")
	private WebElement getqoute;
	
	public TWOCREPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickNCB()
	{
		Select select=new Select(NoClaimBouns);
		 select.selectByIndex(3);
	}
	public void ClickNCB1()
	{
		NCB.click();
	}
	
	public void Clicktitle()
	{
		Select select=new Select(Title);
		 select.selectByIndex(2);
	}
	
	public void clicktitle1()
	{
		title.click();
	}
	
	public void setName(String n)
	{
		name.sendKeys(n);
	}
	
	public void setEmail(String e)
	{
		email.sendKeys(e);
	}
	
	public void clickGC()
	{
		getqoute.click();
	}
	
}
