package in.royalsundaram.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TWOther_Company_Renewal_EditPage {
	@FindBy(xpath="//select[1]")
	private WebElement ManufacturingYear;
	
	@FindBy(xpath="//option[3]")
	private WebElement MFY;
	
	@FindBy(xpath="(//select)[2]")
	private WebElement Manufacturingcity;
	
	@FindBy(xpath="//button[text()='BENGALURU']")
	//@FindBy(xpath="//button[text()='"+MFC+"']")
	private WebElement MFC;
	
	@FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
	private WebElement RegDate;
	
	@FindBy(xpath="//a[@title='Select Monday, Apr 1, 2019']")
	private WebElement RD;
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[2]")
	private WebElement Policyenddate;
	
	@FindBy(xpath="//a[@title='Select Tuesday, Apr 2, 2019']")
	private WebElement PED;
	
	@FindBy(xpath="(//select)[3]")
	private WebElement Manufacturername;
	
	@FindBy(xpath="//button[text()='Activa']")
	private WebElement MFN;
	
	@FindBy(xpath="(//select)[4]")
	private WebElement Modelname;
	
	@FindBy(xpath="//button[text()='Activa Std 125-2 Seater']")
	//@FindBy(xpath="//option[text()='Activa Std 125-2 Seater']")
	private WebElement MN;
	
	@FindBy(xpath="//button[@title='Next']")
	private WebElement Next;
	
	public TWOther_Company_Renewal_EditPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickRY()
	{
		Select select=new Select(ManufacturingYear);
		 select.selectByIndex(1);
		
	}
	/*public void setMY()
	{
		MFY.sendKeys(Keys.ENTER);
	}*/
    public void clickMC(String city)
    {Select select=new Select(Manufacturingcity);
	 select.selectByVisibleText(city);
    }
    public void clickMFC()
    {
    	MFC.click();
    }
    public void clickMD()
    {
    	RegDate.click();
    }
    public void setMD()
    {
    	RD.click();
    }
    
    public void clickPED()
    {
    	Policyenddate.click();
    }
    
    public void setPED()
    {
    	PED.click();
    }
    
    public void clickmanufacturename(String mname)
    {
    	Select select=new Select(Manufacturername);
   	 select.selectByVisibleText(mname);
    }
    public void clickMFN()
    {
    	MFN.click();
    }
    
    public void clickMN(String modname)
    {
    	Select select=new Select(Modelname);
      	 select.selectByVisibleText(modname);
    	
    	
    }
    public void setMN()
    {
    	MN.click();
    }
    
    public void clicknext()
    {
    	Next.click();
    }
}
