package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/waris/Downloads/chromedriver"); //driver path
		
		WebDriver driver = new ChromeDriver();// Yes == up casting 
		driver.get("https://www.google.com/longin");
	

    }
}
