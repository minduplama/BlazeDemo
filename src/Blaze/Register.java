package Blaze;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Register {
		public static void reginfo() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://blazedemo.com/register");
			driver.findElement(By.id("name")).sendKeys("mindup");
			driver.findElement(By.id("company")).sendKeys("broadway.pvt.ltd");
			driver.findElement(By.id("email")).sendKeys("mindupqq@gmail.com");
			driver.findElement(By.id("password")).sendKeys("2367mm");
			driver.findElement(By.id("password-confirm")).sendKeys("2367mm");
			driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
			Thread.sleep(5000);	
			driver.close();
	}

}
