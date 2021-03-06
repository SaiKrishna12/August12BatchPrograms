package day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailLoginusingProperties {
	
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		FileInputStream f=new FileInputStream("E:\\August12Batch\\Webdriver\\GmailLogin.properties");
		Properties pr=new Properties();
		pr.load(f);
		driver.findElement(By.id(pr.getProperty("txtUsername"))).sendKeys("gandham.saikrishna");
		driver.findElement(By.id(pr.getProperty("btnNext"))).click();
		Thread.sleep(1000);
		driver.findElement(By.id(pr.getProperty("txtPassword"))).sendKeys("pass@123");
		driver.findElement(By.id(pr.getProperty("btnSignin"))).click();
	}

}
