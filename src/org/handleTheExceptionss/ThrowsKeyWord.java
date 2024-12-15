package org.handleTheExceptionss;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowsKeyWord {

	public static void main(String[] args) throws InterruptedException, AWTException,FileNotFoundException, IOException{
		Thread.sleep(2000);
		Robot r = new Robot();
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		WebDriver driver = new ChromeDriver();
		
		WebElement element = driver.findElement(By.xpath(""));
		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		FileUtils.copyFile(source, destination);
	}
}
