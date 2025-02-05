package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {

	public void xpath() {
		//Syntax - //tag[@attribute='value']

		// // :-Select current node
		//	@ :-Selects attribute
		// []=to filter elements based on conditions.

		WebElement xp1 = driver.findElement(By.xpath("//button[@id='button-one']"));
	}
	public void contains() {
		// Syntax //tag[contains(@attribute,'value')] only a small portion needed

		WebElement c1 = driver.findElement(By.xpath("//label[contains(@for,'inputEmail4')]"));

	}
	public void startswith() {
		// Syntax //tag[starts-with(@id,'value')] jus starting needed
		WebElement sw1 = driver.findElement(By.xpath("//label[starts-with(@for,'inputEmail4')]"));

	}
	public void text() {
		// Syntax //tag[text()='text']
		WebElement t1 = driver.findElement(By.xpath("//label[text()='Enter Message']"));

	}
	public void and() {
		//Syntax //tag[@attribute='value' and @attribute='value']
		WebElement an1 = driver.findElement(By.xpath("//input[@type='text' and @id='single-nput-field']"));

	}
	public void or() {
		//Syntax //tag[@attribute='value' or @attribute='value']

	}

	public static void main(String[] args) {

	}
}
