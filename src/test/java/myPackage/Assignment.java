package myPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
	Thread.sleep(3000);
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(4000);
		
		WebElement	StaticDrop	= driver.findElement(By.xpath("//select[@class='form-control']"));
	
		Select dropDown = new Select(StaticDrop);
		dropDown.selectByValue("consult");
		driver.findElement(By.name("signin")).click();
		
		Thread.sleep(4000);
		List<WebElement>	add =	driver.findElements(By.cssSelector(".card-footer.btn-info"));
		
		for(int i=0;i<add.size();i++) {
			add.get(i).click();
			driver.quit();
			
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		
	
		
		
		
		
		
	}

}
