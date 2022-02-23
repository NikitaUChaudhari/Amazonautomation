package testCases;

import org.testng.annotations.Test;

import PageObjects.SignInObjects;
import utilities.Logs;
import utilities.ReadConfigurations;

public class TC01_SimpleSignIn extends BaseClass {
	
	ReadConfigurations rc = new ReadConfigurations();
	String URL = rc.getUrl();
	String Username = rc.getUsername();
	String Password = rc.getPassword();
	
	@Test
	public void test1() throws InterruptedException {
		Logs.startTestCase("Test case 1");
		driver.get(URL);
		Thread.sleep(3000);
		
		SignInObjects sio= new SignInObjects(driver);
		
		sio.hoverSign();
		
		sio.clickSign();
		
		sio.setUsername(Username);
		Logs.info("Username entered");
		
		sio.clickContinue();
	
		sio.setPassword(Password);
		
		sio.logIn();
		Thread.sleep(2000);
		
		screenShot("Login test");
		
		sio.hoverSign();
		
		sio.logOut();
		
		Logs.endTestCase("Test case 1");
	}

}
