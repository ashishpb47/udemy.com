package Framework;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends BaseClass {
	@Test
	public void homePageNavigation() throws IOException {
		
	driver = initializeDriver();
	driver.get("http://www.qaclickacademy.com/");
		
		
	}

}
