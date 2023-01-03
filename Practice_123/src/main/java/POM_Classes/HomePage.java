package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="(//summary[@class='Header-link'])[2]")private  WebElement accountbtn;
	@FindBy(xpath="//strong[text()='sachin7173']")private  WebElement verifyusername;
	@FindBy(xpath="(//h2[@class='h2 lh-condensed mb-2']")private  WebElement verifytext;
	//@FindBy(xpath="//strong[text()='sachin7173']")private  WebElement verifyusername;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);}
	public void accountbtn123() {
		accountbtn.click();
	}
	public String verifyusernme12() {
		String actResult = verifyusername.getText();
		return actResult;
		
	}
	public String verifytext1() {
String actResult = "Discover interesting projects and people to populate your personal news feed.";
return actResult;
		
		
	
		
	
		
	}
}
