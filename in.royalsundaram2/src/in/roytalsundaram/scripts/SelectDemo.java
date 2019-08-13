package in.roytalsundaram.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "H:\\Sridhar\\chromedriver_win32\\chromedriver.exe");
		}
  @Test
  public void testselect() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.royalsundaram.in/web/guest/two-wheeler-insurance");
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter your registration number')]")).sendKeys("KA05WE8745");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter mobile number')]")).sendKeys("9877456141");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@title='Get Quote']")).click();
	  Thread.sleep(2000);
	  WebElement list = driver.findElement(By.xpath("//select[1]"));
	  Select select=new Select(list);
	  List<WebElement> alloptions = select.getOptions();
	  for(WebElement options:alloptions)
	  {
		  options.findElement(By.xpath("//option[3]")).click();
	  }
	  
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@title='Select Monday, Apr 1, 2019']")).click();
	
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@placeholder='DD/MM/YYYY'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@title='Select Tuesday, Apr 2, 2019']")).click();
	  
	  Thread.sleep(4000);
	  WebElement lst = driver.findElement(By.xpath("(//select)[2]"));
	  lst.click();
	  Select slct=new Select(lst);
	  slct.selectByVisibleText("BENGALURU");
//	  List<WebElement> allslct = slct.getOptions();
//	  Thread.sleep(4000);
//	  for(WebElement slt:allslct)
//	  {
//		  
//		  slt.findElement(By.xpath("//*[text()=\"BENGALURU\"]")).click();
//	  }
	  Thread.sleep(5000);
	  WebElement lst1 = driver.findElement(By.xpath("(//select)[3]"));
	  
	  Select sel=new Select(lst1);
	  sel.selectByIndex(2);
//	  List<WebElement> alloption = select.getOptions();
//	  for(WebElement options:alloption)
//	  {
		  //options.findElement(By.xpath("//button[text()=\"Activa\"]")).click();
//	  }
	  
	  Thread.sleep(5000);
	  WebElement lst2 = driver.findElement(By.xpath("(//select)[4]"));
	  Select sel1=new Select(lst2);
	  sel1.selectByVisibleText("CB New Shine SP CBS-2 Seater");
//	  List<WebElement> alloption1 = select.getOptions();
//	  System.out.println(alloption1.size());
//	  for(WebElement options:alloption1)
//	  {
//		  options.findElement(By.xpath("//button[text()='Activa Std 125-2 Seater']")).click();
//	  }
//	  
	  Thread.sleep(4000);
	   
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title='Next']")).click();
	
  }
}
