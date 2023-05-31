package Testcase;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Homepage;


public class Home_page_login {

	@Test
	public void login() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://blazedemo.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, Homepage.class);

		String ab=	Homepage.text.getText();
		if(ab.contains("Welcome to the Simple Travel Agency!")) {
			System.out.println("homepage is correct");
		}else {
			System.out.println("not a correct page");
		}

		Homepage.link.click();
		String url=	driver.getCurrentUrl();
		if(url.contains("vacation")) {
			System.out.println("correct page is navigate");
		}else {
			System.out.println("navigate page is not correct");
		}
		driver.navigate().back();
		
		
	
		
		
	}

}
