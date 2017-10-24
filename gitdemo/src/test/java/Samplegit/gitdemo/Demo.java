package Samplegit.gitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
static WebDriver driver;
	
	@BeforeClass
	public static void openbrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 1)
	public static void username()
	{
		WebElement uname = driver.findElement(By.xpath(".//*[@id='email']"));
		uname.sendKeys("hyt");
	}

	@Test(priority = 2)
	public static void password()
	{
		WebElement pass = driver.findElement(By.xpath(".//*[@id='pass']"));
		pass.sendKeys("hjiog");
		System.out.println("hi");
	}
	@Test(priority = 3)
	public static void login()
	{
		WebElement log = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		log.click();
	}

}


