package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderBar {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		
	}
	@Test
	public void sliderTest() throws InterruptedException
	{
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		int x=slider.getLocation().x;
		int y=slider.getLocation().y;
		System.out.println(x+"---"+y);
		action.dragAndDropBy(slider,45,y).build().perform();
		
		
		//action.doubleClick(webelement).build().perform();
		
		
		
		
		
		
		
	}

}
