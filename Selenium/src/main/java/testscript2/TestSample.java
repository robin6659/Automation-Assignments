package testscript2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TestSample extends Base {

	public void test1 () {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement xp1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement xp2 = driver.findElement(By.xpath("//button[@id='button-one']"));

		xp1.sendKeys("hello world java");
		xp2.click();
	}

	public void test2 () {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));

		enterValueA.sendKeys("5");
		enterValueB.sendKeys("8");
		getTotal.click();
	}

	public static void main(String[] args) {
		TestSample testSample = new TestSample();
		testSample.initializeBrowser();
		//		testSample.test1();
		testSample.test2();
		//testSample.driver.quit(); 
	}
}
