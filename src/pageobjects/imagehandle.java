package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="imagehandle"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class imagehandle {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Log a CallLog a Call']/lightning-icon/span/lightning-primitive-icon/svg/g/path")
	public WebElement LogACall;
			
}
