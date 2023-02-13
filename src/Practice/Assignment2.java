package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
   
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("srinija");

		driver.findElement(By.name("email")).sendKeys("hello@sre.com");

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("122233");

		driver.findElement(By.id("exampleCheck1")).click();

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select src = new Select(dropdown);

		src.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.name("bday")).sendKeys("15/08/1998");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();
	}

}
