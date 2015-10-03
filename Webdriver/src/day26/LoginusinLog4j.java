package day26;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginusinLog4j {

	private static Logger log=Logger.getLogger(LoginusinLog4j.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser launched");
		driver.get("http://yahoomail.com");
		log.info("opened yahoomail");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("saikrishna");
		log.info("entered username");
		driver.findElement(By.id("login-passwd")).sendKeys("pass@123");
		log.info("entered password");
		driver.findElement(By.name("signin")).click();
		log.info("logged into the app");

	}

}
