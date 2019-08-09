package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest{
	
	@Test
	public void testValidLoginLogout(){
		String un=Excel.getCellValue(Xl_PATH, "validLoginLogout", 1, 0);
		String pw=Excel.getCellValue(Xl_PATH, "validLoginLogout", 1, 1);
		String hp=Excel.getCellValue(Xl_PATH, "validLoginLogout", 1, 2);
		String lp=Excel.getCellValue(Xl_PATH, "validLoginLogout", 1, 3);
		
		LoginPage l = new LoginPage(driver);
		//enter valid user name
		l.setUserName(un);
		
		//enter valid password
		l.setPassword(pw);
		
		//click login
		l.login();
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.verifyTitle(hp);
		e.clickLogoutLink();
		l.verifyTitle(lp);
		
		
	}

}
