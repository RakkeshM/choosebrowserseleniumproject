package selinter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignClasses {
	public static void main(String[] str) {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
			WebElement element =null;
			Thread.sleep(3000);
			
			element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]"));
			element.click();
			Thread.sleep(3000);
			
			element = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[25]/div/div[2]/div/div/div[1]/div/div[1]/div/div/div[1]/div[1]/a"));
			String title = element.getText();
			System.out.println("Title :"+title);
			
			element = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[25]/div/div[2]/div/div/div[1]/div/div[1]/div/div/div[1]/div[3]/div/div[1]"));
			String price =element.getText();
			System.out.println("Price :"+price);
			
			element = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[25]/div/div[2]/div/div/div[1]/div/div[1]/div/div/div[1]/div[3]/div/div[3]/span"));
			String dicount = element.getText();
			System.out.println("Discount :"+dicount);
			
			element = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[25]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div[1]/a"));
			String Title2=element.getText();
			System.out.println("Title2 :"+Title2);
			
			
			element= driver.findElement(By.xpath("/html/body/div/div/div[3]/div[25]/div/div[2]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/a"));	
			String title3 = element.getText();
			System.out.println("Title3"+title3);
			
			
			Thread.sleep(3000);
			driver.close();
			
			
		}
		catch(Exception obj){
			obj.printStackTrace();
			
		}
	}

}
