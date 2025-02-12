package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base {

	public void tablePrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}

	public void rowPrinting() {
		//table[@id='dtBasicExample']/tbody/tr[3]
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(row.getText());
	}

	public void cellPrinting() {
		//table[@id='dtBasicExample']/tbody/tr[3]/td[3]
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		WebElement cell = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
		System.out.println(cell.getText());
	}

	public void colPrinting() {
		//table[@id='dtBasicExample']/tbody/tr/td[3]
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		List<WebElement> col = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		//		here 1 of 10 item needs to be print
		for(WebElement colList:col) {
			System.out.println(colList.getText());
		}
	}

	public static void main(String[] args) {
		TableHandling tablehandling = new TableHandling();
		tablehandling.initializeBrowser();
		//		tablehandling.tablePrinting();
		//		tablehandling.rowPrinting();
		//		tablehandling.cellPrinting();
		tablehandling.colPrinting();
	}

}