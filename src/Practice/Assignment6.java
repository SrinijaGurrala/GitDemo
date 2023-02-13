package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {

       WebDriver driver=new ChromeDriver();
	   driver.get("http://qaclickacademy.com/practice.php");
	   driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
	   String selection=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
	   WebElement drop=driver.findElement(By.id("dropdown-class-example"));

       Select src=new Select(drop);

       src.selectByVisibleText(selection);

       driver.findElement(By.name("enter-name")).sendKeys(selection);

       driver.findElement(By.id("alertbtn")).click();

    String alertText=  driver.switchTo().alert().getText();

    if(alertText.contains(selection))

    {

   System.out.println("Successfully done");

    }

    else

   System.out.println("failed");

}


}
