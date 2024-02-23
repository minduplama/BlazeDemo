package Blaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blazedemo {
	@Test
	public static void flightbooking() throws InterruptedException{
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver flight=new ChromeDriver();
		
		flight.get("https://blazedemo.com/");//open URL in Browser
		
		Select dcity=new Select(flight.findElement(By.xpath("//Select[@name='fromPort']")));//made object for departure
		dcity.selectByValue("Portland");//use object and select the value
		
		Select des=new Select(flight.findElement(By.xpath("//Select[@name='toPort']")));//made object for destination
		des.selectByValue("Berlin");//using object and select the index
		flight.findElement(By.xpath("//input[@type='submit']")).click();//click on find fights button
		
		//navigated to flight section page
		flight.findElement(By.xpath("(//input[@type='submit'])[2]")).click();//choosing virgin America button flight to click
		//input user information
		flight.findElement(By.id("inputName")).sendKeys("mindup");
		flight.findElement(By.id("address")).sendKeys("jhapa,pokhara,ktm");
	    flight.findElement(By.id("city")).sendKeys("damak");
		flight.findElement(By.id("state")).sendKeys("1");
		flight.findElement(By.id("zipCode")).sendKeys("112233");
		
		Select cardtype= new Select(flight.findElement(By.id("cardType")));
		//cardtype.selectByValue("visa");
		//cardtype.selectByIndex('2');
		cardtype.selectByVisibleText("Visa");
		
		flight.findElement(By.id("creditCardMonth")).sendKeys("10");
		flight.findElement(By.id("creditCardYear")).sendKeys("2024");
		flight.findElement(By.id("nameOnCard")).sendKeys("lama");
		
		flight.findElement(By.id("rememberMe")).click();
		flight.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(5000);
		//flight.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));//implicitly of selenium4
		WebDriverWait objWait=new WebDriverWait(flight, Duration.ofSeconds(10));//Explicitly of selenium4
		objWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]")));
		flight.close();
		 
	}

}
