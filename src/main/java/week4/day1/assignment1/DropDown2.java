package week4.day1.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDown2 {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		 driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		 driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")).click();
		 driver.findElement(By.xpath("//option[text()='Playwright']")).click();
		 driver.findElement(By.xpath("//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right']")).click();
		 driver.findElement(By.xpath("//li[text()='India']")).click();
		 driver.findElement(By.xpath("//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right ui-state-hover']")).click();
		 driver.findElement(By.xpath("//li[text()='Chennai']")).click(); 
		 driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		 driver.findElement(By.xpath("//li[text()='PostMan']")).click();
		 driver.findElement(By.xpath("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[3]")).click();
		 driver.findElement(By.xpath("//li[text()='English']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[@role='combobox'])[4]")).click(); 
		 driver.findElement(By.xpath("//li[text()='Two']")).click();
	}
}
