package slaesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceDelete {
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
		driver.findElement(By.xpath("//a[@title='SalesForce Automation by krishnaveni']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//runtime_platform_actions-action-renderer[@title='Delete']")).click();
		driver.findElement(By.xpath("(//span[text()='Delete'])[last()]")).click();
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text);
		driver.get("https://qeagle-dev-ed.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("SalesForce Automation by krishnaveni", Keys.ENTER);
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//lightning-formatted-rich-text[@class='slds-rich-text-editor__output']/span")).getText();
		System.out.println(text2);
		driver.close();
	}
}
