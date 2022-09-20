 package secondproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).click();
		driver.findElement(By.id("email")).sendKeys("tyui");
		driver.findElement(By.name("pass")).sendKeys("you");
		driver.findElement(By.name("login")).click();
		
		

	}

}
