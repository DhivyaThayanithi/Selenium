package SteppDeffPackg;

import ObbjjPckg.LogiiObjj;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logiistep {
	
	LogiiObjj Obj;
	@Given("^launch the application$")
	public void launch_the_application() throws Throwable {
		Obj=new LogiiObjj();
	    
	}

	@When("^enter the UserName \"([^\"]*)\" and PassWord \"([^\"]*)\"$")
	public void enter_the_UserName_and_PassWord(String Name, String Pass) throws Throwable {
		
		Obj.TextBox(Obj.getUser(), Name);
		Obj.TextBox(Obj.getPass(), Pass);

	    
	}

	@Then("^click the button$")
	public void click_the_button() throws Throwable {
	    
		Obj.getLogin().click();
	
	}


	

}
