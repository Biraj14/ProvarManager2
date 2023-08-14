package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Click In Edge"                                
     , summary=""
     , relativeUrl=""
     , connection="amazon"
     )             
public class ClickInEdge {

	WebDriver driver;
	public ClickInEdge(WebDriver driver){
	this.driver=driver;
	}
	public String sendingtext(String text){
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(text);
	return text;
	}
		public void clickingMethod(){
			driver.findElement(By.xpath("")).click();
		}
}
