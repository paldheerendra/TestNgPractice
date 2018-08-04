package Loan;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderAnnotationCheck {
	
	@DataProvider
	public Object getData() {
		
		Object data[][]=new Object[3][2];
		
		data[0][0]="admin";
		data[0][1]="admin123";
		
		data[1][0]="username";
		data[1][1]="password123";
		

		data[2][0]="dheerep";
		data[2][1]="Selenium123";
		
		return data;
		
	}
	
	@Test(dataProvider="getData")
	public void loginApp(String username, String password) {
		
		System.out.println(username + "   And   " + password);
		
		
	}

}
