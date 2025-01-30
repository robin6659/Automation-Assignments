package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	//	WebElement elementname=driver.findElement(By.Locator("locator value")); SYNTAX

	public void id() 
	{
		WebElement id1=driver.findElement(By.id("single-input-field"));
		//		id1.sendKeys("ABC");
		WebElement id2=driver.findElement(By.id("button-one"));
		WebElement id3=driver.findElement(By.id("message-one"));
		WebElement id4=driver.findElement(By.id("value-a"));
		WebElement id5=driver.findElement(By.id("value-b"));
		WebElement id6=driver.findElement(By.id("button-two"));
		WebElement id7=driver.findElement(By.id("message-two"));

	}

	public void className () 
	{
		WebElement class1=driver.findElement(By.className("header-top"));
		WebElement class2=driver.findElement(By.className("container page"));
		WebElement class3=driver.findElement(By.className("clearfix"));
		WebElement class4=driver.findElement(By.className("list-group list-group-flush"));
		WebElement class5=driver.findElement(By.className("copyright"));
	}

	public void name () 
	{
		WebElement name1=driver.findElement(By.name("viewport"));
		WebElement name2=driver.findElement(By.name("description"));
		WebElement name3=driver.findElement(By.name("keywords"));
		WebElement name4=driver.findElement(By.name("author"));
	}
	
	public void linkText ()
	{
		WebElement linktext1=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linktext2=driver.findElement(By.linkText("Home"));
		WebElement linktext3=driver.findElement(By.linkText("Input Form"));
		WebElement linktext4=driver.findElement(By.linkText("Date Pickers"));
		WebElement linktext5=driver.findElement(By.linkText("Table"));
		WebElement linktext6=driver.findElement(By.linkText("Progress Bars"));
		WebElement linktext7=driver.findElement(By.linkText("Alerts and Modals"));
		WebElement linktext8=driver.findElement(By.linkText("List Box"));
		WebElement linktext9=driver.findElement(By.linkText("Others"));

	}
	
	public void partialLinkText ()
	{
		WebElement partiallinktext1=driver.findElement(By.partialLinkText("Radio But"));
		WebElement partiallinktext2=driver.findElement(By.partialLinkText("Ajax F"));
		WebElement partiallinktext3=driver.findElement(By.partialLinkText("Jquery S"));
		WebElement partiallinktext4=driver.findElement(By.partialLinkText("Simple F"));
		WebElement partiallinktext5=driver.findElement(By.partialLinkText("Checkbox D Select I"));
		WebElement partiallinktext6=driver.findElement(By.partialLinkText("Select I"));
	}
	public static void main (String[] args) 
	{

	}

}