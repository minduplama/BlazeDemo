package Blaze;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class login {
	public static void logininfo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver log= new ChromeDriver();
		log.get("https://blazedemo.com/login");
		 
		log.findElement(By.id("email")).sendKeys("lamablue33@gmail.com");
		log.findElement(By.id("password")).sendKeys("type22");
		log.findElement(By.xpath("//input[@name='remember']")).click();
		log.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		log.close();
	}

}
