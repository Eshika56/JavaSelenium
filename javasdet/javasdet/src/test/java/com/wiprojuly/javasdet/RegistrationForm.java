package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeoptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// enter name
		
		WebElement username= driver.findElement(By.xpath("	//input[@id='name']"));
		username.sendKeys("Eshika");
		
		//enter email
		
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("eshikabose6@gmail.com");
		
		// enter gender
		
		WebElement checkbox =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		checkbox.click();	
		Thread.sleep(2000);
		
		//enter mobile number
		
		WebElement num= driver.findElement(By.xpath("	//input[@id='mobile']"));
		num.sendKeys("909090909");
		
		//enter dob
		
		 WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
	     dob.sendKeys("29-04-2002");
	     Thread.sleep(2000);
	    

	     //enter subject

		WebElement sub= driver.findElement(By.xpath("//input[@id='subjects']"));
		sub.sendKeys("Maths");
		
		//enter hobbies
		
		WebElement checkbox1 =driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		checkbox1.click();	
		Thread.sleep(2000);
		
		//upload pic
		
		WebElement uploadPicture = driver.findElement(By.id("picture"));
        uploadPicture.sendKeys("D://WhatsApp Image 2024-06-19 at 11.22.10_392ecf05.jpg"); // Change path to your file
        Thread.sleep(2000);
		
        //engter address
        

		WebElement add= driver.findElement(By.xpath("//textarea[@id='picture']"));
		add.sendKeys("GLT Road");
		
		//select state
		

		WebElement drdwn= driver.findElement(By.xpath("//select[@id='state']"));
		Select sel=new Select(drdwn);	
		sel.selectByVisibleText("Rajasthan");
		
		//select city
		

		WebElement drdwn1= driver.findElement(By.xpath("//select[@id='city']"));
		Select sel1=new Select(drdwn1);	
		sel1.selectByVisibleText("Agra");
		
		
		//click on login

		
		WebElement login= driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
	}

}
