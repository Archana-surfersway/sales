package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Jenk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\archana devi\\eclipse-workspace\\TEST\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://swpos.surfersway.in/test/init_app/login");
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField .sendKeys("abinaya");
		WebElement password =driver.findElement(By.id("pass"));
		password .sendKeys("abinaya");
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']"));
		
		submit .click();
		submit .click();
		
	
			
	}

}
