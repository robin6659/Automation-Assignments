package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButton extends Base {

	public void radioButtonHandling () {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioMale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement selectedValue = driver.findElement(By.xpath("//button[@id='button-one']"));

		radioMale.click();
		selectedValue.click();
	}

	public void radioConditionalHandling () {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioMale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement selectedValue = driver.findElement(By.xpath("//button[@id='button-one']"));


		if (radioMale.isSelected()) {
			System.out.println("Not selected");

		} else {
			radioMale.click();
			selectedValue.click();
			System.out.println("Selected");
		}
	}

	public static void main(String[] args) {
		RadioButton radioButton = new RadioButton();
		radioButton.initializeBrowser();
		radioButton.radioButtonHandling();
//		radioButton.radioConditionalHandling();
		//radioButton.driver.quit(); 
	}
}
