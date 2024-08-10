package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParametersTest 
{
	@Test
	public void  recieveData()
	{
		String URL = System.getProperty("url");
		String email = System.getProperty("email");
		 String password = System.getProperty("password");
		
		Reporter.log(URL,true);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Reporter.log(URL+"launched successfully");
		
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}

}
