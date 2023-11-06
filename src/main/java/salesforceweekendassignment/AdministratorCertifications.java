package salesforceweekendassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AdministratorCertifications {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-Maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//span[text()='Learn More']")).click();
	Thread.sleep(10000);
	Set<String> childWindow = driver.getWindowHandles();
	System.out.println(childWindow.size());
	List<String> openedWindow=new ArrayList<String>(childWindow);
	driver.switchTo().window(openedWindow.get(1));
	driver.findElement(By.xpath("(//div//button)[2]")).click();
	//JavascriptExecutor jse=(JavascriptExecutor) driver;
	//WebElement shadowRootHandle = (WebElement) jse.executeScript("return document.querySelector(\"#c360-hgf-nav\").shadowRoot.querySelector(\"#main-menu-0 > ul > li.c360-nav__nav-item.c360-nav__nav-item--l1.active-l1 > h3 > hgf-button > span.nav-item-label--l1\")");
	//shadowRootHandle.click();
	//jse.executeScript("arguments[0].click();", shadowRootHandle);
	/*
	Shadow shadowhandle=new Shadow(driver);
	shadowhandle.findElementByXPath("//span[text()='Learning']").click();
	WebElement element = driver.findElement(By.xpath("//span[text()='Learning on Trailhead']"));
	WebElement element2 = driver.findElement(By.xpath("//a[text()='Salesforce Certification']"));
	Actions builder=new Actions(driver);
	builder.moveToElement(element).click(element2).perform(); 
	driver.findElement(By.xpath("//a[text()='Administrator']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	List<WebElement> listOfElements = driver.findElements(By.xpath("//div[text()='Classes and Workshops']//following::ul//li"));
	for (int i = 0; i < listOfElements.size(); i++) {
		System.out.println(listOfElements.get(i));
	}
	*/
}
}
