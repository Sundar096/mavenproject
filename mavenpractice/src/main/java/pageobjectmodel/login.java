package pageobjectmodel;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

@Test
public void login() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		PageFactory.initElements(driver, loginobjects.class);
		
		loginobjects.emailid.sendKeys("user@phptravels.com");
		loginobjects.password.sendKeys("demouser");
		loginobjects.loginbutton.click();
		
		/*
		 * loginobjects.emailid(driver).sendKeys("user@phptravels.com");
		 * loginobjects.password(driver).sendKeys("demouser");
		 * loginobjects.loginbutton(driver).click();
		 */
		
		
		
		/*
		 * WebElement emailid=driver.findElement(By.name("email"));
		 * emailid.sendKeys("user@phptravels.com");
		 * 
		 * WebElement password=driver.findElement(By.name("password"));
		 * password.sendKeys("demouser");
		 * 
		 * WebElement loginbutton=driver.findElement(By.xpath(
		 * "//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
		 * loginbutton.click();
		 */

}

}
