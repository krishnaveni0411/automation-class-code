import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-Maximized" , "--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.linkText("Men's Fashion"));
		Actions selectSportShoes=new Actions(driver);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		selectSportShoes.moveToElement(element).click(element2).perform();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		String totalShoes= text.replaceAll("[^0-9]", "");
		System.out.println("Total no of Sports Shoes :" +totalShoes);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//Actions builder1=new Actions(driver);
		//WebElement ele = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
		//WebElement ele1 = driver.findElement(By.xpath("//li[@class='search-li']/span"));
		
		// builder1.moveToElement(ele).click(ele).pause(20).click(ele1).perform();
		
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		By locator = By.xpath("//li[@class='search-li']/span");
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(By.xpath("//li[@class='search-li']/span")).click();
		
		
		Actions selectThePrice=new Actions(driver);
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='price-text-box']/span"));
		WebElement ele3 = driver.findElement(By.xpath("(//div[@class='price-text-box'])[2]/span"));
		WebElement ele4 = driver.findElement(By.xpath("//div[contains(text(),'GO')]"));
		WebElement ele5 = driver.findElement(By.xpath("//div[@class='filter-content']"));
		selectThePrice.moveToElement(ele5).moveToElement(ele2).sendKeys("400").moveToElement(ele3).sendKeys("500").moveToElement(ele4).click(ele4).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='filter-color-tile Black ']")).click();
		
		List<String> filter=Arrays.asList("price","Color");
		System.out.println(filter);
		List<WebElement> filterElements=driver.findElements(By.xpath("//div[@class='filters']/div"));
		if (filterElements.size() == 2) {
		    System.out.println("All filters are applied successfully");
		} else {
		    System.out.println("One or more filters have issues");
		}
		
		WebElement firstResult = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions resultPage=new Actions(driver);
		WebElement quickView = driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']"));
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(50));
		By locator1 = By.xpath("//img[@class='product-image wooble']");
		wait1.until(ExpectedConditions.presenceOfElementLocated(locator1));
		int count=0;
		try {
			resultPage.pause(20).moveToElement(firstResult).click(quickView).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			count++;
		}
		Set<String> opendWindow = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(opendWindow);
		System.out.println(window.size());
		driver.switchTo().window(window.get(0));
		
		
		String rate = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("price of the selected shoe : "+rate);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discout of the selected Shoe : "+discount);
		File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/001.JPEG");
		FileUtils.copyFile(source, dest);
		driver.close();
		
		
		
}
}