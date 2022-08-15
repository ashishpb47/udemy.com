package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifHomePage {

	
	
	WebDriver driver;
	
	public   ReddifHomePage(WebDriver driver) {
		this.driver= driver;
		

	}
	
		By search =	By.id("srchword");
		By Submitt = By.xpath("//input[@value=' ']");
			
		public WebElement Searches() {
			return driver.findElement(search);
		}
	
		public WebElement Submitted() {
			return driver.findElement(Submitt);
			
		}
}


