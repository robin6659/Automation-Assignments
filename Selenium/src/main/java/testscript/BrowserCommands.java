package testscript;

public class BrowserCommands extends Base {

	public void browserCommands() 
	{
		String Title = driver.getTitle();
		System.out.println(Title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Page = driver.getPageSource();
		System.out.println(Page);
	}
	public static void main (String[] args) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.browserCommands();
		//		browsercommands.driverQuitAndClose();
	}

}
