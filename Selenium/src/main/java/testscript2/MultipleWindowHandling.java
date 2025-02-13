package testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleWindowHandling extends Base {

	public void multipleWindowHandling() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contact = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		WebElement login = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));

		contact.click();
		login.click();

		//Assigning string
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window"+parentWindow);
		System.out.println("********SEPERATION 1********");

		//Multiple window being handled here, so we used getWindowHandles method
		Set<String> allWindows = driver.getWindowHandles();

		for(String temp:allWindows) {
			System.out.println("Window"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("********SEPERATION 2********");

		}
	}

	public static void main(String[] args) {
		MultipleWindowHandling multiplewindowhandling = new MultipleWindowHandling();
		multiplewindowhandling.initializeBrowser();
		multiplewindowhandling.multipleWindowHandling();
	}

}

//getWindowHandle() Parent Window Handle:
//getWindowHandles() All Opened Window Handles:
