package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class Dropdown extends Base {

	public void dropdownHanlding() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdownValues = driver.findElement(By.xpath("//select[@id='single-input-field']"));

		Select dropdown = new Select(dropdownValues);
		//dropdown.selectByValue("Red");
		//plain text
		//dropdown.selectByVisibleText("Yellow");
		//int
		dropdown.selectByIndex(3);

	}

	public static void main(String[] args) {
		Dropdown dropdown = new Dropdown();
		dropdown.initializeBrowser();
		dropdown.dropdownHanlding();
	}

}
