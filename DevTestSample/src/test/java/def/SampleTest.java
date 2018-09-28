package def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	

 WebDriver driver;
 
  @Test
  public void baseTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");	  
	 System.out.println(driver.getTitle());
	  }  
  
  @Test
  public void tLogin() {
	  
	  driver.findElement(By .name("userName")).sendKeys("demo");
	  driver.findElement(By .name("password")).sendKeys("demo");
	  driver.findElement(By .name("login")).click();
	  String str=driver.findElement(By .linkText("SIGN-OFF")).getText();
	  if(str.equalsIgnoreCase("SIGN-OFF")) {
		  System.out.println("Login is success");
		 System.out.println(driver.getTitle());
		 
		  driver.findElement(By .linkText("SIGN-OFF")).click();
	  }
	  else {
		  System.out.println("Login is failed");
		  System.out.println(driver.getTitle());
	  }
	  
	  
	  
	  
	  
  }
}
