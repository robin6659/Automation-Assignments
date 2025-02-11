package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base {

	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertSimple = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

		alertSimple.click();
		//for accessing the alert modal
		driver.switchTo().alert().accept();
	}

	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

		alertConfirm.click();
		driver.switchTo().alert().accept();
	}

	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

		alertPrompt.click();
		driver.switchTo().alert().sendKeys("Java Hello World");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.initializeBrowser();
		//		alerthandling.simpleAlert();
		//		alerthandling.confirmationAlert();
		alerthandling.promptAlert();

	}
}
