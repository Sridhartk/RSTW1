package in.royalsundaram.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumPage {
	@FindBy(id="scale-slider")
	private WebElement slider;
	
	//span[@style='left: 66.6667%;']
	
	@FindBy(xpath="//span[@data-value='7']")
	private WebElement  clickslide;
	
	@FindBy(xpath="//button[@title='Buy']")
	private WebElement buyBTN;
	
	
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement okBTN;
	
	public PremiumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Clickslider1() throws AWTException
	{
		slider.click();
		Robot r=new Robot();
		r.mousePress(0);
		r.mouseMove(5, 0);
		r.mouseRelease(0);
	}
	
	public void clikcslider2() throws AWTException
	{
		Robot r1=new Robot();
		r1.mousePress(1);
		r1.mouseMove(66, 0);
		r1.mouseRelease(0);
		clickslide.click();
	}
	public void clickbuyBTN()
	{
		buyBTN.click();
	}
	
	
	
	public void clickok() 
	{
			
		okBTN.click();
	}

}
