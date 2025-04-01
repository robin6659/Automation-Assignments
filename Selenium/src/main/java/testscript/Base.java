package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver; // WebDriver instance

	/**
	 * Initializes the Chrome browser and opens the specified URL.
	 */
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();

	}

	public void driverQuitAndClose () {
		driver.quit();
		//		driver.close(); //Parent Window
	}

	public static void main(String[] args) {
		Base obj = new Base();
		obj.initializeBrowser();
		obj.driverQuitAndClose();
	}
}
