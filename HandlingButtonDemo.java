package selenium.Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingButtonDemo {
	{
		System.out.println("welcome to Automation testing");
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		//get location in x y position.
		WebElement ele=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
		Point re=ele.getLocation();
		System.out.println("x is:"+re.getX());
		System.out.println("y is:"+re.getY());
		//get button color
		WebElement color=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
		String colors=color.getCssValue("background");
		System.out.println("the color is :"+colors);
		////height and width
		WebElement element=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
		Rectangle rect=element.getRect();
		System.out.println("height of the button is:"+rect.getHeight());
		System.out.println("width of the button is:"+rect.getWidth());
		//is enabled?
		boolean isenable= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		System.out.println(isenable);
		//quit
		driver.quit();

	}

}
