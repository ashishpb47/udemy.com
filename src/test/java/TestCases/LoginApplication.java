package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.ReddifHomePage;
import objectrepository.RediffLoginPage;

public class LoginApplication {
	@Test
	public void Login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("Do It");
		Thread.sleep(3000);
		rd.PasswordNote().sendKeys("Rediff");
		rd.GoBtn().click();
		rd.GoHome().click();
		ReddifHomePage rh = new ReddifHomePage(driver);
		rh.Searches().sendKeys("reddif");
		rh.Submitted().click();
		
			
		
		
		
		
	}
}
