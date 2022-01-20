package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBaselogin {

	//first i need to create a method 
	public void getlogin(){
		//(this is selenium code)
		System.setProperty("webdriver.chrome.driver","/Users/waris/Downloads/chromedriver");//path
		
	WebDriver Driver =new ChromeDriver();//(what is webdriver? webdriver is a selenium main 
		// component it is a interface.
		//what is Driver? Driver  is a object.//what is new? new is  java keyword when i create anything new
		//i have to use New keyword.what is ChromeDriver? ChromedDriver is a Class.)
		
	Driver.get("https://shopwali.com/");
		 
		
		
	}
}
