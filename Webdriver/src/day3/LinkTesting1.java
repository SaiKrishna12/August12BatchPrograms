package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTesting1 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String exptitle="Gmail";
		driver.findElement(By.linkText("Gmail")).click();
		String acttitle=driver.getTitle();
		if(acttitle.equals(exptitle))
		{
			System.out.println("Gmail link working correctly");
		}
		else
		{
			System.out.println("Gmail link not working correctly");
		}
		driver.close();
		
		

	}

}
