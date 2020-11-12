package com_hackethon_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com_hackethon_base.BaseUI;

public class HealthInsuranceTest extends BaseUI {

	@Test()
	public void testThree() {
		logger = report.createTest("Health Insurance");
		invokeproperties();
		invokeBrowser("firefox");
		waitLoad(3);
		openURL("websiteURL");
		waitLoad(1);
		//Go to the health insurance menu 
		howerMouse("health_Insurance_xpath");
		waitLoad(3);
		//select all the submenu
		SelectSubMenuFromMainMenu("myElements_xpath");
		quitBrowser();
	}

	@AfterTest
	public void endReport() {
		report.flush();
	}

}
