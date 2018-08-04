package Loan;

import org.testng.annotations.Test;

public class EducationLoan {
	
	@Test(groups="regression")
	public void eduLoanInterest() {

		System.out.println("----------eduLoanInterest----");
		
	}
	
	@Test(groups="regression")
	public void eduLoanDocs() {
		
		System.out.println("----------eduLoanDocs----------");
	}
		
	
	@Test(groups="regression")
	public void eduLoanPrinciple() {

		System.out.println("---------eduLoanDuration---------");
		
	}
	@Test(groups="regression")
	public void eduLoanDuration() {

		System.out.println("---------eduLoanDuration---8 years--------");
		
	}
	
	@Test(groups="regression")
	public void eduLoanCompoundInterest() {

		System.out.println("----------eduLoanCompoundInterest----");
		
	}
	
	@Test(groups="smoke")
	public void eduLoanEmiNum() {
		

		System.out.println("----------eduLoanEmiNum----60------");
	}
		
	
	@Test(groups="smoke")
	public void eduLoanEmiAmount() {

		System.out.println("---------eduLoanEmiAmount--- 500000---------");
		
	}
	@Test(groups="smoke")
	public void eduLoanguaranter() {

		System.out.println("---------eduLoanEmiAmount---2 people--------");
		
	}
	

}
