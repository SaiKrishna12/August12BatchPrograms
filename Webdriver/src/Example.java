import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				count++;
				if(count==6)
				{
					links.get(i).click();
				}
			}
		}
	}

}
