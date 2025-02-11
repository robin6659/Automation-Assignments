package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class Action extends Base {

	public void actionHandling() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragNo1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dragNo2 = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));

		Actions actions = new Actions(driver);

		actions.contextClick(dragNo1).build().perform();
		actions.dragAndDrop(dragNo1, drop).build().perform();
		actions.contextClick(dragNo2).build().perform();
		actions.moveToElement(dragNo1).build().perform();
		actions.doubleClick(dragNo1).build().perform();
	}

	public static void main(String[] args) {
		Action action = new Action();
		action.initializeBrowser();
		action.actionHandling();

	}
}