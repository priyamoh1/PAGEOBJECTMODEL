package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createtypeofwork 
{
	//@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	//private WebElement settings;
	
	//@FindBy(xpath = "//a[.='Types of Work']")
	//private WebElement typeofwork;
	
	@FindBy(xpath = "//span[@unselectable='on']")
	private WebElement createtypeofwork;
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	
	public createtypeofwork(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	
	public void createtyeofwork() throws InterruptedException
	{
		//settings.click();
		//Thread.sleep(2000);
		//typeofwork.click();
		//Thread.sleep(1000);
		createtypeofwork.click();
		Thread.sleep(1000);
		name.sendKeys("lalal");
		Thread.sleep(1000);
		submit.click();
		
	}
}
