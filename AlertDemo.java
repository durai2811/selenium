package selenium.Learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		//simple alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		Alert alert=driver.switchTo().alert();
		String name=alert.getText();
		System.out.println(name);
		alert.accept();
		Thread.sleep(2000l);
		//confirm alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Alert alert1=driver.switchTo().alert();
		String confirm=alert1.getText();
		System.out.println(confirm);
		Thread.sleep(2000l);
		alert1.dismiss();
		//sweet alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]")).click();
		//alert prompt
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Hello");
		System.out.println(alert2.getText());
		driver.quit();

		/*
		 * /Exception
           1.unhandledalert exception 
           2.noalertpresent exception
		 */



	}

}
