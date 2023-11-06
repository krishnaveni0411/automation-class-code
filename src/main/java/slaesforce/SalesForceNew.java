package slaesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceNew {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-Maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://qeagle-dev-ed.my.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.className("slds-icon-waffle")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", ele);
	driver.findElement(By.xpath("//div[text()='New']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("SalesForce Automation by krishnaveni");
    Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	driver.findElement(By.xpath("//span[text()='31']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux ')]")).click();
	driver.findElement(By.xpath("(//span[text()='Needs Analysis'])[last()]")).click();
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	driver.close();
}
}