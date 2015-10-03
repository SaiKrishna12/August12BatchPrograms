import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ChromeLaunch {

	 ChromeDriver driver;
	@Test
	public  void mainMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32(7)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://bing.com");
		driver.findElement(By.linkText("Help")).click();
		switchWindow("//*[@id='privacyLabel']");
		switchWindow("//*[@id='psp_microsoft_services_agreement']");
		
		
	}
	public  void switchWindow(String x)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath(x)).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		
		
	}
	

}
