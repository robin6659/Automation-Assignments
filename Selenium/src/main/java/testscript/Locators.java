package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	//	WebElement elementname=driver.findElement(By.Locator("locator value")); SYNTAX

	public void id() 
	{
		WebElement id1=driver.findElement(By.id("single-input-field"));
		//		id1.sendKeys("ABC");
		WebElement idButton1=driver.findElement(By.id("button-one"));
		WebElement idMessage1=driver.findElement(By.id("message-one"));
		WebElement idInput2=driver.findElement(By.id("value-a"));
		WebElement idInput3=driver.findElement(By.id("value-b"));
		WebElement idButton2=driver.findElement(By.id("button-two"));
		WebElement idMessage2=driver.findElement(By.id("message-two"));

	}

	public static void main (String[] args) 
	{

	}	
}