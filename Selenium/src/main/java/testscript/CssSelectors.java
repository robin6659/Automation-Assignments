package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectors extends Base {

	public void tagandid() {
		//tag#id
		WebElement tid1 = driver.findElement(By.cssSelector("button#button-one"));
		WebElement tid2 = driver.findElement(By.cssSelector("div#collapsibleNavbar"));
	}

	public void tagandclass() {
		//tag.class
		WebElement tc1 = driver.findElement(By.cssSelector("div.header-top"));
		WebElement tc2 = driver.findElement(By.cssSelector("a.navbar-brand"));
	}

	public void tagandattribute() {
		//tag[attribute=value]
		WebElement ta1 = driver.findElement(By.cssSelector("button[id='button-one']"));

	}
	public void tagclassandattribute() {
		//tag.classname[attribute=value]
		WebElement tca1 = driver.findElement(By.className("input.form-control[id='single-input-field']"));
	}
	public static void main(String[] args) {

	}

}
