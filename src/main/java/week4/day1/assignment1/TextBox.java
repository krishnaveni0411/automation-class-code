package week4.day1.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TextBox {
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
	 driver.findElement(By.xpath("//span[text()='Text Box']")).click();
     driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("K.Krishnaveni");
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).clear();
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).sendKeys("Goa");
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
     driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).sendKeys("04.11.2000");
     boolean enabled = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt93']")).isEnabled();
     System.out.println(enabled);	 
}
}
