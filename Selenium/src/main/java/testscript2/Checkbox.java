package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Checkbox extends Base {

	public void checkboxHanlding() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singleCheck = driver.findElement(By.xpath("//input[@id='gridCheck']"));

		singleCheck.click();
	}


	public void checkboxConditional() {
		//	if not selected then select
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singleCheck = driver.findElement(By.xpath("//input[@id='gridCheck']"));

		if (singleCheck.isSelected()) {
			System.out.println("Not Selected");
		} else {
			singleCheck.click();
			System.out.println("Selected");
		}
	}

	public static void main(String[] args) {
		Checkbox checkBox = new Checkbox();
		checkBox.initializeBrowser();
		//checkBox.checkboxHanlding();
		checkBox.checkboxConditional();
	}
}
