import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author Selenium
 *
 */
public class GoogleTest {
	
	@Test
	public void testGoogle()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com/");
	}

}
