package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	
	//int i=1;
	//while(i<5) {
		
		//i++;
	//}
	for(int i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	
	
	}

}
