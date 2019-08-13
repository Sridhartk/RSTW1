package in.roytalsundaram.scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import in.royalsundaram.generics.BaseTest;
import in.royalsundaram.generics.XL;
import in.royalsundaram.pages.OtherCompanyInsurancePages;
import in.royalsundaram.pages.TWOther_Company_Renewal_EditPage;

public class TWOCRE extends BaseTest {
	@Test(priority=2)
	public void testTWOCR() throws InterruptedException, AWTException
	{
		String Regno=XL.getData(XL_PATH, "RSTW", 1, 0);
	  	String mob=XL.getData(XL_PATH, "RSTW", 1, 1);
		//String MY=XL.getData(XL_PATH, "TWOCR", 1, 0);
		String MC=XL.getData(XL_PATH, "TWOCR", 1, 1);
		String RD=XL.getData(XL_PATH, "TWOCR", 1, 2);
		String PED=XL.getData(XL_PATH, "TWOCR", 1, 3);
		String MN=XL.getData(XL_PATH, "TWOCR", 1, 4);
		String mname=XL.getData(XL_PATH, "TWOCR", 1, 5);
		
		OtherCompanyInsurancePages oci=new OtherCompanyInsurancePages(driver);
		  oci.setRegno(Regno);
		  oci.setMob(mob);
		  oci.Clickon();
		
		TWOther_Company_Renewal_EditPage twocr=new TWOther_Company_Renewal_EditPage(driver);
		Thread.sleep(2000);
		
		 twocr.ClickRY();
		 Thread.sleep(3000);
		 
		  
		 twocr.clickMC(MC);
		 Thread.sleep(3000);
		 
		 twocr.clickMFC();
		 Thread.sleep(3000);
		 
		 twocr.clickMD();
		 Thread.sleep(3000);
		 
		 twocr.setMD();
		 Thread.sleep(3000);
		 
		 twocr.clickPED();
		 Thread.sleep(3000);
		 
		 twocr.setPED();
		 Thread.sleep(3000);
		 
		 twocr.clickmanufacturename(MN);
		 Thread.sleep(3000);
		 
		 twocr.clickMFN();
		 Thread.sleep(3000);
		 
		 twocr.clickMN(mname);
		 Thread.sleep(3000);
		 
		 twocr.setMN();
		 Thread.sleep(3000);
		 
		 twocr.clicknext();
		 Thread.sleep(3000);
		 
		}

}
