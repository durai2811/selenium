package selenium.Learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		WebElement one=driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(one);
		driver.findElement(By.id("Click")).click();
		Thread.sleep(2000l);
		//count frames
		driver.switchTo().defaultContent();
		/*
		 * WebElement two=driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		 * driver.switchTo().frame(two);
		 */
		List<WebElement> ele=driver.findElements(By.tagName("iframe"));
		int count=ele.size();
		System.out.println(count);
		Thread.sleep(2000l);
		//nested frames
		WebElement one1=driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(one1);
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		Thread.sleep(1000l);
		
		driver.quit();
		
	}

}
