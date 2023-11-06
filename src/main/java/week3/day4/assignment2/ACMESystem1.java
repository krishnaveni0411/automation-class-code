package week3.day4.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACMESystem1 {
public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://acme-test.uipath.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	System.out.println("Title :" + driver.getTitle());
	driver.findElement(By.linkText("Log Out")).click();
	driver.close();
}
}
