package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoSkillraryTest 
{
	
	@Test
	
	public void sendData()
	{
		String URL = System.getProperty("url");
		String email = System.getProperty("email");
		 String password = System.getProperty("password");
		
		Reporter.log(URL,true);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Reporter.log(URL+"launched successfully");
		
		
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='login_Btn']")).click();
		Assert.assertEquals(driver.getTitle(), "SkillRary Ecommerce","Home page is not displayed");
		Reporter.log("Home page is displayed",true);
	}

}
