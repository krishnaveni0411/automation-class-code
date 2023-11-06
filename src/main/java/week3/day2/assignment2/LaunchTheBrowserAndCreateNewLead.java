package week3.day2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver; 

public class LaunchTheBrowserAndCreateNewLead {
public static void main(String[] args) {
	EdgeDriver browser=new EdgeDriver();
	browser.get("http://leaftaps.com/opentaps/control/main");
	browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	browser.manage().window().maximize();
	browser.findElement(By.id("username")).sendKeys("Demosalesmanager");
	browser.findElement(By.id("password")).sendKeys("crmsfa");
	browser.findElement(By.className("decorativeSubmit")).click();
	String text= browser.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	browser.findElement(By.linkText("CRM/SFA")).click();
	browser.findElement(By.linkText("Leads")).click();
	browser.findElement(By.partialLinkText("Create")).click();
	//browser.findElement(By.linkText("Create Lead")).click();
	browser.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
	browser.findElement(By.id("createLeadForm_firstName")).sendKeys("Akash");
	browser.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
	browser.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Akash");
	browser.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
	browser.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
	browser.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
	browser.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
	browser.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("12,00,000");
	browser.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("8");
	browser.findElement(By.id("createLeadForm_sicCode")).sendKeys("5634");
	browser.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("alpi");
	browser.findElement(By.id("createLeadForm_description")).sendKeys("Create a new Lead");
	browser.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nothing");
	browser.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+44");
	browser.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("527");
	browser.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8547692138");
	browser.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("45");
	browser.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Ram");
	browser.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("akash421@gmail.com");
	browser.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://akash.com/");
	browser.findElement(By.id("createLeadForm_generalToName")).sendKeys("Akash");
	browser.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Ram");
	browser.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Plot No D-13");
	browser.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Anna Street");
	browser.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	browser.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600057");
	browser.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("3");
	browser.findElement(By.name("smallSubmit")).click();
}
}
