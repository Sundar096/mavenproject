package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	@FindBy(xpath = "/html/body/div[2]/div/h1")
	public static WebElement text;
	@FindBy(xpath = "/html/body/div[2]/div/p[2]/a")
	public static WebElement link;
	@FindBy(xpath = "/html/body/div[3]/form/select[1]")
	public static WebElement from;
	@FindBy(xpath = "/html/body/div[3]/form/select[2]")
	public static WebElement to;
	@FindBy(xpath = "/html/body/div[3]/form/div/input")
	public static WebElement search;
	

}
