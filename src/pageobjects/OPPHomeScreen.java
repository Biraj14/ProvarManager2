package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "OPP Home Screen", summary = "", relativeUrl = "", connection = "admin")

public class OPPHomeScreen {
	WebDriver driver;

	// cons
	public OPPHomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	public String color(String status){
	WebElement t = driver.findElement(By.xpath("//div/ul[@class='slds-path__nav']/li[@data-name='"+status+"']"));
      //obtain color in rgba
      String s = t.getCssValue("background-color");
      // convert rgb to hex
      String c = Color.fromString(s).asHex();
	return s;
	}
	
}
