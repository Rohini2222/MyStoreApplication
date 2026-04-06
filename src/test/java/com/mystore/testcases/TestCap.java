package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCap {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement user =driver.findElement(By.id("loc"));
		user.sendKeys("userName");
		WebElement pwd =driver.findElement(By.id("loc"));
		pwd.sendKeys("passWord");
		WebElement btn =driver.findElement(By.id("loc"));
		btn.click();
		WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("")));
       
		
/*		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Screenshots\\test.png");
		FileUtils.copyFile(src, dest);*/
		
/*        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
     wait1.pollingEvery(10,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);*/
        
       /* wait.pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        		FileUtils.copyFile(src, src);
        		   		
        int a =10;
        int b =40;
        
        if(a%2==0) {
        	System.out.println("boolen");
        }*/
        
                int[] arr = {1, 3, 4,};
                int n = 4; // maximum number in array
                int sum = n * (n + 1) / 2;
                System.out.println(sum);
                

                int arraySum = 0;
                for(int num : arr) {
                    arraySum += num;
                }

                int missing = sum - arraySum;
                System.out.println("Missing number: " + missing);
          
        
        
        
  
	}

}
