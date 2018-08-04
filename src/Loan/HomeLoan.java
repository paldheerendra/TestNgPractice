package Loan;

import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test(priority=0)
	public void homeLoanInterest() {

		System.out.println("----------homeLoanInterest----");
		
	}
	
	@Test(priority=0)
	public void homeLoanDocs() {
		
		try {
		
			int i=5/0;

		System.out.println("----------homeLoanDocs----------");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
		
	
	@Test(priority=0)
	public void homeLoanPrinciple() {

		System.out.println("---------homeLoanPrinciple---------");
		
	}
	@Test(dependsOnMethods="homeLoanDocs" , priority=1)
	public void homeLoanDuration() {

		System.out.println("---------homeLoanDuration---5 years--------");
		
	}
	

}
