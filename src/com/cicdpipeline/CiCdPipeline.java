package com.cicdpipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class CiCdPipeline {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\archana devi\\eclipse-workspace\\cicdpipeline\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://swpos.surfersway.in/test/init_app/login");
		
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField .sendKeys("developer");
		WebElement password =driver.findElement(By.id("pass"));
		password .sendKeys("developer@0000");
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']"));
		submit .click();
		
		
	}

}
