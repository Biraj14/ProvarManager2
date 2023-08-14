package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Orange CRM"                                
     , summary=""
     , relativeUrl=""
     , connection="OrangeDemo"
     )             
public class OrangeCRM {

@FindBy(xpath = "//input[@name='username']")
public WebElement EnterUsername;
@FindBy(xpath = "")



			
}
