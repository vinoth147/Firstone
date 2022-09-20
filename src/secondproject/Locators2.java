package secondproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.linkText("Join now")).click();
		driver.findElement(By.name("email-or-phone")).sendKeys("vinothbala20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Bala");

	}

}
