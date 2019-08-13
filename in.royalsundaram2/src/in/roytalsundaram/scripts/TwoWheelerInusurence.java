package in.roytalsundaram.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;


import in.royalsundaram.generics.BaseTest;
import in.royalsundaram.generics.XL;
import in.royalsundaram.pages.OtherCompanyInsurancePages;

public class TwoWheelerInusurence extends BaseTest {
@Test(priority=1)
public void twowheelerinsu()
{
  	String Regno=XL.getData(XL_PATH, "RSTW", 1, 0);
  	String mob=XL.getData(XL_PATH, "RSTW", 1, 1);
  	/*String Regnospc=XL.getData(XL_PATH, "RSTW", 3, 0);
  	String mobnospc=XL.getData(XL_PATH, "RSTW", 3, 1);
  	String InvRegno=XL.getData(XL_PATH, "RSTW", 4, 0);
  	String Invmobno=XL.getData(XL_PATH, "RSTW", 4, 1);*/
  	
  	
  OtherCompanyInsurancePages oci=new OtherCompanyInsurancePages(driver);
  oci.setRegno(Regno);
  oci.setMob(mob);
  oci.Clickon();
  
}
}
