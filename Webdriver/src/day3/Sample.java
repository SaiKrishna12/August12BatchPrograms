package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.findElement(By.id("UHSearchBox")).sendKeys("mail.google.com");
		driver.findElement(By.id("UHSearchWeb")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@id,'0')]/div/div/div[2]/div[2]/ul[1]/li[2]/a")).click();

	}

}
