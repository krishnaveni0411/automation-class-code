package slaesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesForceAscendingOrderCloseDate {
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
	driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon slds-button_icon-more'])[2]")).click();
	driver.findElement(By.xpath("//li[@class='slds-dropdown__item slds-is-selected grid']")).click();
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("//span[@title='Close Date']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
	
	
	
	
	
}
}
