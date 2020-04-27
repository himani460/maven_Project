package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class maven_Page {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HImani\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
//		//driver.findElement(By.xpath("//a[@class='nav-imageHref']")).click();;
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	    List<WebElement> elements = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
//	    //System.out.println(elements.size()); 
//	   for(int i = 1; i<=elements.size();i++)
//	    {
//	    	System.out.println(elements.get(3).getText());
//	    	break;
//	    	
//	    }
//	   driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).click();
//	    driver.findElement(By.xpath("//div//input[@id='GLUXZipUpdateInput']")).sendKeys("201009");
//	    driver.findElement(By.xpath("//span[@id='GLUXZipUpdate']")).click();
//	    

}
}
