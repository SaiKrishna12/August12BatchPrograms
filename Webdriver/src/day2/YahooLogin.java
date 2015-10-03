package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLogin {

		public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://yahoomail.com");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("saikrishna");
		driver.findElement(By.id("login-passwd")).sendKeys("pass@123");
		driver.findElement(By.name("signin")).click();

	}

}
