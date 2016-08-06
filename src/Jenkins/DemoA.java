package Jenkins;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class DemoA {
		
		@Test
		public void testA(){
			//System.setProperty("webdriver.gecko.driver", "C:/Users/CBT/Downloads/geckodriver-v0.9.0-win64/geckodriver.exe ");
			WebDriver d1 = new FirefoxDriver();
			d1.get("https://github.com/mozilla/geckodriver/releases");
			d1.close();
		}
}
