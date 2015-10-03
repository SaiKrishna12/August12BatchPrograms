package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sanitytesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		int a=myRandomNo(dropdown.size()-1);
		dropdown.get(a).click();
		if(dropdown.get(a).isSelected())
		{
			System.out.println(dropdown.get(a).getText()+" is active");
		}
		else
		{
			System.out.println(dropdown.get(a).getText()+" is inactive");
		}
		driver.close();
	}
	public static int myRandomNo(int x)
	{
		double  d=Math.random()*x;
		int a=(int)d;
		return a;
	}

}
