package org.stepdefin;

import java.util.List;
import java.util.Map;

import org.base.FunctionalLib;
import org.openqa.selenium.WebElement;
import org.pageobject.PageObjectModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdefinition extends FunctionalLib {
	
	@Given("user is on chrome")
	public void user_is_on_chrome() {
		browserlaunch("chrome", "https://demoqa.com/automation-practice-form");
	}

	@When("filling the form firstname and lastname and email")
	public void filling_the_form_firstname_and_lastname_and_email(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> asLists = dataTable.asLists();
	List<String> list = asLists.get(1);
	String first = list.get(0);
	String last = list.get(1);
	String mail = list.get(2);
	PageObjectModel page =  new PageObjectModel();
	WebElement firstname = page.getFirstname();
	passtext(firstname, first);
	WebElement lastname = page.getLastname();
	passtext(lastname, last);
	WebElement email = page.getEmail();
	passtext(email, mail);
	
	}



	
	
	
	
	
	
	
	
}



