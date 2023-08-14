package com.xworkz.company.boot;

import com.xworkz.company.Company;
import com.xworkz.company.MncCompany;

public class CompanyMaker {

	public static void main(String[] args) {

		Company company = new MncCompany();

		company.hireEmployee();
		company.developProduct();
		company.organizeTraining();
		company.approveLeave();
		company.reviewPerformance();
		company.fireEmployee();
		company.conductMeeting();
		company.submitReport();
		company.processPayroll();
		company.promoteEmployee();
	}

}
