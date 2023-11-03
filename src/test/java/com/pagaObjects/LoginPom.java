package com.pagaObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefination.Base;

public class LoginPom extends Base {
	//Object Block created
		{
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//p[text()='Username : Admin']")
		private WebElement username;
		@FindBy(xpath="//input[@name='username']")
		private WebElement Name;
		@FindBy(xpath="//p[text()='Password : admin123']")
		private WebElement password;
		
		@FindBy(xpath="//input[@name='password']")
		 private WebElement Pass;
		@FindBy(xpath="//button[@type='submit']")
		 private WebElement button;
		
		@FindBy(xpath="//p[text()='Forgot Your Password? ']")
		private WebElement forgetPass;
		
		
		public String getUserName()
		{
			String uName=username.getText();
			return uName.substring(uName.indexOf('A'));
			
		}
		public String getPass()
		
		{
			
			String pass=password.getText();
			String pass1=pass.replace(':', ' ');
			String pass2= pass1.substring(pass1.indexOf(' '));
			String pass3="";
			for (int i=0;i<pass2.length();i++)
			{
				char c=pass2.charAt(i);
				if(!Character.isWhitespace(c))
				{
					pass3+=c;
				}
			}
			return pass3;
		}
		public void setUserN(String name)
		{
			
			Name.sendKeys(name);
		}
		public void setPass(String password)
		{
			
			Pass.sendKeys(password.trim());
		}
//		public AdminPom clickOnLogin()
//		{
//			button.click();
//			return new AdminPom();
//		}
		public void clickOnLogin()
		{
			button.click();
		}

}
