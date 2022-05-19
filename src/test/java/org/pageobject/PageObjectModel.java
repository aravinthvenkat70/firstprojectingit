package org.pageobject;

import org.base.FunctionalLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel extends FunctionalLib  {
	public PageObjectModel() {
			PageFactory.initElements(driver, this);
		}
		
		@FindAll({@FindBy(xpath="(//div[@class='avatar mx-auto white'])[2]")})
		private WebElement forms;
		@FindAll({@FindBy(xpath="//div[@class='main-header']")})
		private WebElement practiceforms;
		@FindAll({@FindBy(id="firstName"),@FindBy(xpath="(//input[@class=' mr-sm-2 form-control'])[1]")})
		private WebElement firstname;
		@FindAll({@FindBy(xpath="(//input[@class=' mr-sm-2 form-control'])[2]"),@FindBy(id="lastName")})
		private WebElement lastname;
		@FindAll({@FindBy(xpath="//input[@class='mr-sm-2 form-control']"),@FindBy(id="userEmail")})
		private WebElement email;
		@FindAll({@FindBy(xpath="custom-control custom-radio custom-control-inline")})
		private WebElement gender;
		@FindAll({@FindBy(xpath="(//input[@class=' mr-sm-2 form-control'])[3]"),@FindBy(id="lastName")})
		private WebElement mobileno;       
		@FindAll({@FindBy(xpath="(//input[@class='form-control'])"),@FindBy(id="dateOfBirthInput")})
		private WebElement dob;
		@FindAll({@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")})
		private WebElement subject;
		@FindAll({@FindBy(xpath="//div[@id='hobbiesWrapper']//child::div//following-sibling::div[2]")})
		private WebElement hobies;       
		
		
		public WebElement getforms() {
			return forms;
		}
		
		public WebElement getPracticeforms() {
			return practiceforms;
		}
		public WebElement getFirstname() {
			return firstname;
		}
		public WebElement getLastname() {
			return lastname;
		}
		public WebElement getEmail() {
			return email;
		}
		public WebElement getGender() {
			return gender;
		}
		public WebElement getMobileno() {
			return mobileno;
		}
		public WebElement getDob() {
			return dob;
		}
		public WebElement getSubject() {
			return subject;
		}
		public WebElement getHobies() {
			return hobies;
		}
		
		
		
		

	}




