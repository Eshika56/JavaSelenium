package com.wiprojuly.javasdet;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class RadioButtonEg {


		public static void main(String[] args) throws InterruptedException {
			// allows the customization of ChromeDriver sessions by modifying browser properties
					ChromeOptions chromeOptions = new ChromeOptions();
					// webdriver manager - download, setup and maintenance of the different browsers
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver(chromeOptions);
					driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   
					WebElement Radio3 = driver.findElement(By.xpath("//input[@value = 'radio3']"));
					Radio3.click();
					Thread.sleep(2000);
				}

			}


