package in.royalsundaram.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OtherCompanyInsurancePages {
	@FindBy(xpath="//input[contains(@placeholder,'Please enter your registration number')]")
	private WebElement Regno;
	
	@FindBy(xpath="//input[contains(@placeholder,'Please enter mobile number')]")
	private WebElement Mobileno;
	
	@FindBy(xpath="//button[@title='Get Quote']")
	private WebElement GetBTN;
	
	@FindBy(xpath="//div[text()='Registration Number field is required.']")
	private WebElement MtRegnoSPC;
	
	@FindBy(xpath="//div[text()='Mobile Number field is required.']")
	private WebElement MTMobSPC;
	
	@FindBy(xpath="//div[text()='Please enter a valid Vehicle Number']")
	private WebElement InVRegno;
	
	@FindBy(xpath="//div[text()='Mobile Number should be 10 characters.']")
	private WebElement InVMobno;
	
	public OtherCompanyInsurancePages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setRegno(String reg)
	{
		Regno.sendKeys(reg);
	}
	
	public void setMob(String mob)
	{
		Mobileno.sendKeys(mob);
	}
	
	public void setMTSPC(String MtRegSPC)
	{
		MtRegnoSPC.sendKeys(MtRegSPC);
		Assert.assertTrue(MtRegnoSPC.isDisplayed());
	}
	
	public void setMTMobSPC(String mtmobspc)
	{
		MTMobSPC.sendKeys(mtmobspc);
		Assert.assertTrue(MTMobSPC.isDisplayed());
	}
	
	public void setInvreg(String invreg)
	{
		InVRegno.sendKeys(invreg);
		Assert.assertTrue(InVRegno.isDisplayed());
	}
	public void setInvmob(String invmob)
	{
		InVMobno.sendKeys(invmob);
		Assert.assertTrue(InVMobno.isDisplayed());
	}
	
	public void Clickon()
	{
		GetBTN.click();
	}
	
	
	

}
