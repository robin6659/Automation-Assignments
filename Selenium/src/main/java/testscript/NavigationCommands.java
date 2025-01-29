package testscript;

public class NavigationCommands extends Base {

	public void navigationCommands() 
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();//redirects to the First page
		driver.navigate().forward();//redirects to the Amazon page
		driver.navigate().refresh();//Refreshes the Amazon
	}

	public static void main (String[] args) {
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.navigationCommands();
	}
}
