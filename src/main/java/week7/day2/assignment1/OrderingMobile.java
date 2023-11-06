package week7.day2.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class OrderingMobile {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("start-Maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://dev140572.service-now.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("P-qQ7@umSYz8");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	WebElement ele1 = driver.findElement(By.xpath("//span[text()='Navigator options']"));
	WebElement ele2 = driver.findElement(By.xpath("//div[text()='All']"));
	Actions builder=new Actions(driver);
	builder.moveToElement(ele1).click(ele2).perform();
	driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Service catalog",Keys.ENTER);
	
	
}
}
