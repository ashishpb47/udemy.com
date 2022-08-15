package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	
	
	WebDriver driver;
	
	public  RediffLoginPage(WebDriver driver) {
		this.driver= driver;
		
		
	}
	
	
	By username = By.xpath("//input[@id='login1']");
	By password =			By.name("passwd");
	By signin =			By.name("proceed");
	By	Hommie	=	By.xpath("//a[@class='f12']");
	
	
	
	public WebElement EmailId() {
		
	return 	driver.findElement(username);
		
	}
	
	public WebElement PasswordNote() {
	return	driver.findElement(password);
	}
	
	public WebElement GoBtn( ) {
	return	driver.findElement(signin);
	}
	
	public WebElement GoHome() {
	return	driver.findElement(Hommie);
	}
}
