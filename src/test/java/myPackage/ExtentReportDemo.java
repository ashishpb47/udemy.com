package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
	
	ExtentReports Er;
	
	
	@BeforeTest
	public void config() {
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter Es = new ExtentSparkReporter(path);
		Es.config().setReportName("Web Automation Report");
		Es.config().setDocumentTitle("Test Results");
		
		
		
		Er = new ExtentReports();
		Er.attachReporter(Es);
		Er.setSystemInfo("Tester","Ashish Sharma");
		
				
				
	}
	
	
	
	
	
	@Test
	public  void initialDemo() {
		// TODO Auto-generated method stub
		
		Er.createTest("initialDemo");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Er.flush();
		
		
		
	}

}
