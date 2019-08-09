package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyProductVersion extends BaseTest {

	@Test
	public void testVerifyProductVersion(){
		String sheet="verifyProductVersion";
		String un=Excel.getCellValue(Xl_PATH, sheet, 1, 0);
		String pw=Excel.getCellValue(Xl_PATH, sheet, 1, 1);
		String version=Excel.getCellValue(Xl_PATH, sheet, 1, 2);
		
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.login();
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.clickHelp();
		e.clickAboutActitime();
		e.verifyProductVersion(version);
		e.clickcloseButton();
		e.clickLogoutLink();
		
	}
}
