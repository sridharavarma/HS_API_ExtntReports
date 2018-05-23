package com.testersconnect.extreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class TestSuiteExtentReports extends TestCaseBase1{


		@Test (priority=1)
		public void verifyCreateContact() {
			System.out.println("===========================");
			System.out.println("Started VerifyCreateContact");
			 logger = extent.createTest("VerifyCreateContact");
			 logger.log(Status.PASS, "VerifyCreateContact Test is Passed");
			 logger.log(Status.PASS, MarkupHelper.createLabel("VerifyCreateContact Test is Passed", ExtentColor.GREEN));
		}
			
		@Test (priority=2)
		public void verifyDeleteContact() {
			System.out.println("===========================");
			System.out.println("Started verifyDeleteContact");
			 logger = extent.createTest("verifyDeleteContact");
			 logger.log(Status.FAIL, "VerifyDeleteContact Test is Failed");
			 logger.log(Status.FAIL, MarkupHelper.createLabel("VerifyDeleteContact Test is Failed", ExtentColor.RED));
			
		}
		
		@Test (priority=3)
		public void verifyCreateCompany() {
			System.out.println("===========================");
			System.out.println("Started verifyCreateCompany");
		}
}
