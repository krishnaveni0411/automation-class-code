package week3.day3.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sri");
		driver.findElement(By.id("lastNameField")).sendKeys("Priya");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("S");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("P");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software Tester");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Create a new Contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sripriya@gmail.com ");
		WebElement element=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state=new Select(element);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("New Contact");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Title : "+ driver.getTitle());
		
	}
}
