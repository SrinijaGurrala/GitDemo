import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//Invoking browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinija\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Testing documents\\geckodriver.exe");
		
		//System.setProperty("webdriver.edge.driver", "D:\\Testing documents\\msedgedriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.netmeds.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
