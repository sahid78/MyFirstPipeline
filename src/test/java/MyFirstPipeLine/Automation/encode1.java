package MyFirstPipeLine.Automation;


import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class encode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement element= driver.findElement(By.id("user-name"));
		element.sendKeys("standard_user");
		
		byte[] decodePassword=Base64.decodeBase64("c2VjcmV0X3NhdWNl");
		
		WebElement el1=driver.findElement(By.id("password"));
		el1.sendKeys(new String(decodePassword));
		
		WebElement btn= driver.findElement(By.name("login-button"));
		btn.click();

	}

}
