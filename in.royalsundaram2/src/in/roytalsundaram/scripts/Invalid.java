package in.roytalsundaram.scripts;
import org.testng.Reporter;
import org.testng.annotations.Test;


import in.royalsundaram.generics.BaseTest;
import in.royalsundaram.generics.XL;
import in.royalsundaram.pages.OtherCompanyInsurancePages;
public class Invalid  extends BaseTest {
	@Test
	public void twowheelerinsu() throws InterruptedException
	{
	  	//String Regno=XL.getData(XL_PATH, "RSTW", 1, 0);
	  	//String mob=XL.getData(XL_PATH, "RSTW", 1, 1);
//	  	String Regnospc=XL.getData(XL_PATH, "RSTW", 3, 0);
//	  	String mobnospc=XL.getData(XL_PATH, "RSTW", 3, 1);
	  	String InvRegno=XL.getData(XL_PATH, "RSTW", 4, 0);
	  	String Invmobno=XL.getData(XL_PATH, "RSTW", 4, 1);
	  	
	  	
	  OtherCompanyInsurancePages oci=new OtherCompanyInsurancePages(driver);
	  oci.setRegno(InvRegno);
	  oci.setMob(Invmobno);
	  Thread.sleep(2000);
	  oci.Clickon();
	  
	}
	}


