package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathCreation1 {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("http://gmail.com");
		driver.findElement(By.linkText("Sign in")).click();
		
	}
	@Test
	public void xpathTest()
	{
		String x=driver.findElement(By.xpath
				         ("//p[@class='tagline']")).getText();
		System.out.println(x);
	}

}
