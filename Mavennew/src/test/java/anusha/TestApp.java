package anusha;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class TestApp {
	
private WebDriver driver;
	
	private String baseUrl;
	
	
	@BeforeMethod

	public void setUp() throws Exception 
	{
		driver = new FirefoxDriver();
		
		
		baseUrl = "http://localhost/anusha/";
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	
	}

	@Test
		public void test() throws Exception 
		{
			
			driver.get(baseUrl);
			
			
			
			// STEP 1(Home)
			
			   Thread.sleep(3000);
		
		 		driver.findElement(By.id("checkbox")).click(); 
		 		driver.findElement(By.id("next")).click(); 
		 		 
		 		// step 2 sign up
		 		
		 		driver.findElement(By.id("forenames")).sendKeys("anusha");
		 		Thread.sleep(1000);
				driver.findElement(By.id("surename")).sendKeys("sandra");
				Thread.sleep(1000);
				driver.findElement(By.id("radiof")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("address1")).sendKeys("kphb");
				Thread.sleep(1000);
				driver.findElement(By.id("address2")).sendKeys("jntu");
				Thread.sleep(1000);
				driver.findElement(By.id("city")).sendKeys("hyderabad");
				Thread.sleep(1000);
				driver.findElement(By.id("postalcode")).sendKeys("500001");
				Thread.sleep(1000);
				driver.findElement(By.id("telephone")).sendKeys("9087654321");
				Thread.sleep(1000);
				Select sel1=new Select(driver.findElement(By.name("country")));
			    sel1.selectByVisibleText("India");
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//input[@id='submit']")).click();
			    Thread.sleep(3000);
						    
			 // step 3 flight booking
			    Thread.sleep(3000);
			    
			    Select sel2=new Select(driver.findElement(By.name("depart")));
			    sel2.selectByVisibleText("London");
			    driver.findElement(By.id("datepicker")).sendKeys("29/9/2015");
			    Select sel3=new Select(driver.findElement(By.name("arrive")));
			    sel3.selectByVisibleText("Paris");
			    Thread.sleep(1000);
			    driver.findElement(By.id("datepicker1")).sendKeys("01/10/2015");
			    Thread.sleep(1000);
			    driver.findElement(By.xpath(".//*[@id='passengers']/input")).sendKeys("2");
			    driver.findElement(By.id("tripcheckbox")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.id("window")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.id("first")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.id("confirm")).click();
			    Thread.sleep(1000);
			    
			    
			    // step 4 payment
			    Thread.sleep(3000);
			    
			    driver.findElement(By.id("ccnum")).sendKeys("5765443333");
			    driver.findElement(By.id("ccname")).sendKeys("anusha");
				Select sel4=new Select(driver.findElement(By.id("ccmonth")));
			    sel4.selectByVisibleText("March");
			    Select sel5=new Select(driver.findElement(By.id("ccyear")));
			    sel5.selectByVisibleText("2018");
			    driver.findElement(By.id("ccvc")).sendKeys("155");
			    driver.findElement(By.id("paynow")).click(); 
			    
			
			    }
	
	    
	

@AfterMethod
public void tearDown() throws Exception {
	driver.quit();

}
}

