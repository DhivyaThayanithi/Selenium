package ObbjjPckg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasseePckg.LogiiBasee;

public class LogiiObjj extends LogiiBasee {
	
	public LogiiObjj() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="txtUsername")
	private WebElement User;

	@FindBy(id="txtPassword")
	private WebElement Pass;

	@FindBy(id="btnLogin")
	private WebElement button;

	public WebElement getUser()
	{
		return User;
		}

	public WebElement getPass()
	{
		return Pass;
		
	}

	public WebElement getLogin()
	{
		return button;

}
}