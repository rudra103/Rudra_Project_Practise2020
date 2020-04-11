package com.screenfunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
public class NopCommerceRegister {
	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName")
	public static WebElement FirstName;
	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName")
	public static WebElement LastName;

	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Email")
	public static WebElement Email;

	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName")
	public static WebElement UserName;
	
	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlCountry")
	public static WebElement Country;

	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlRole")
	public static WebElement yourrole;
	
	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_cbNewsletter")
	public static WebElement newsLetters;

	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Password")
	public static WebElement Password;

	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ConfirmPassword")
	public static WebElement CPassword;
	
	@FindBy(how=How.ID,using="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm___CustomNav0_StepNextButton")
	public static WebElement Register;
	
	public static void register(){
		FirstName.sendKeys("rudraa");
		LastName.sendKeys("posiyaa");
		Email.sendKeys("mymail123@gmail.com");
		UserName.sendKeys("rudra456");
		Select count=new Select(Country);
		count.selectByValue("41");//India
		Select role=new Select(yourrole);
		role.selectByValue("10");//Technical/Developer
		Password.sendKeys("pass1234");
		CPassword.sendKeys("pass1234");
		Register.click();
	}
}
//https://www.nopcommerce.com/register.aspx