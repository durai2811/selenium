package selenium.Learn;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		//File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//full page screen shot
       File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File desc=new File("./snaps/img.png");
       org.openqa.selenium.io.FileHandler.copy(screenshot, desc);
       
      // button screenshot 
      WebElement src= driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-warning']"));
      File screensht=src.getScreenshotAs(OutputType.FILE);
      File desc1=new File("./snaps/img1.png");
      FileHandler.copy(screensht, desc1);
      //portion screen shot
      WebElement src1=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[1]"));
      File from=src1.getScreenshotAs(OutputType.FILE);
      File to=new File("./snaps/img3.png");
      FileHandler.copy(from, to);
      driver.close();
	}

}
