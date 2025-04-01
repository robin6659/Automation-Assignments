package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AxesMethods extends Base {

	public void parent ()
	//button[@id='button-one']//parent::form
	{
		WebElement parent1=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}

	public void child ()
	////div[@id='collapsibleNavbar']//child::ul
	{
		WebElement child1=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}

	public void followingSibling ()
	//button[@id='button-one']//following-sibling::div
	//button[@id='button-one']//following-sibling::div[@id='message-one']
	{
		WebElement followingSibling1=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
		WebElement followingSibling2=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
	}

	public void following ()
	//button[@id='button-one']//following::div[@class='card']
	{
		WebElement following1=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));

	}

	public void preceding ()
	//button[@id='button-one']//preceding::div[@class='header-top']	
	{
		WebElement preceding1=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']	"));
	}

	public void ancestor ()
	//button[@id='button-one']//ancestor::div[@class='container page']
	{
		WebElement ancestor1=driver.findElement(By.xpath("(//button[@id='button-one']//ancestor::div[@class='container page']"));
	}

	public void descendant () 
	{
		WebElement descendant1=driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)[2]"));
	}

	public void indexing ()
	//	(//button[@id='button-one']//following-sibling::div[@id='message-one'])[1])
	{
		WebElement indexing1=driver.findElement(By.xpath("(//button[@id='button-one']//following-sibling::div[@id='message-one'])[1])"));
	}

	public static void main(String[] args) {

	}

}
