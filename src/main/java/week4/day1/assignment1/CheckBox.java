package week4.day1.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
	driver.findElement(By.xpath("//span[text()='Check Box']")).click();
	driver.findElement(By.xpath("//span[text()='Basic']")).click();
	driver.findElement(By.xpath("//span[text()='Ajax']")).click(); 
	driver.findElement(By.xpath("//label[text()='Java']")).click();
	driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]")).click();
	driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
	driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
	driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
	driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
	boolean enabled = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isSelected();
    System.out.println(enabled);
    driver.close();
}
}
