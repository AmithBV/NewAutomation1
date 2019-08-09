package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pom.LoginPage;

public class Invalidlogin extends BaseTest {
	
	@Test
	public void testInvalidLogin(){
		int rc=Excel.getRowCount(Xl_PATH, "invalidLogin");
		for (int i = 0; i <=rc; i++) {
			String un=Excel.getCellValue(Xl_PATH, "invalidLogin", i, 0);
			String pw=Excel.getCellValue(Xl_PATH, "invalidLogin", i, 1);
		
		
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.login();
		l.verifyErrMsgDisplayed();
	}
	}
}
