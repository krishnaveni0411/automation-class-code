package slaesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesForceEdit {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-Maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("SalesForce Automation by krishnaveni", Keys.ENTER);
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//span[@class='triggerContainer']/following::span[@class='slds-truncate']")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//a[@title='SalesForce Automation by krishnaveni']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//span[text()='Edit'])[last()]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='CloseDate']")).clear();
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	driver.findElement(By.xpath("(//table[@class='slds-datepicker__month']//tr[1]/td)[last()]")).click();
	driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux ')])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
	driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).clear();
	driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Sales Force");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	By locator = By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[last()]");
    wait.until(ExpectedConditions.elementToBeClickable(locator));
    driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[last()]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='In progress']")).click();
	driver.findElement(By.xpath("//button[text()='Save']")).click();
    String text2 = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	System.out.println(text2);
    Thread.sleep(2000);
	driver.get("https://qeagle-dev-ed.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("SalesForce Automation by krishnaveni", Keys.ENTER);
	Thread.sleep(2000);
	String text1 = driver.findElement(By.xpath("//span[@class='triggerContainer']/following::span[@class='slds-truncate']")).getText();
	System.out.println(text1+"\n");
	if(text.equals(text1)) {
		System.out.println("The Oppurtunity is Not Edited");
	} else {
		System.out.println("The Oppurtunity is Edited Successfully");
	} 
	driver.close();
}
}
