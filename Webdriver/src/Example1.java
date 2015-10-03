import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Example1 {

	
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		WebElement frame=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		Select sel=new Select(driver.findElement(By.name("cars")));
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Saab");
		driver.findElement(By.xpath("html/body/form/input")).click();

	}

}
