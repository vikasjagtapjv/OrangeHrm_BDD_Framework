package stepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagaObjects.LoginPom;


public class Base {
	public static  WebDriver driver;
	FileInputStream fis;
	public static String projectPath=System.getProperty("user.dir");
	 
	public void launchWeb() throws IOException
	{
		fis=new FileInputStream(projectPath+"\\src\\main\\resources\\property\\config.properties");
		Properties pro=new Properties();
		
		pro.load(fis);
	
		pro.getProperty("WebUrl");
		
			
	     driver.get(pro.getProperty("WebUrl"));
	    //Utility.implicitWait(); 
		 }
	public void implicitWait(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		
	}


}
