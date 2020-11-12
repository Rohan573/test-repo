package com_hackethon_utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

public class ExtentReportManager {
	public static ExtentReports report;
	
public static ExtentReports getReportInstance(){
		
		if(report == null){
			String reportName = DateUtils.getTimeStamp() + ".html";
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "//test-output//"+  reportName);
			report =  new ExtentReports();
			report.attachReporter(htmlReporter);
			
			report.setSystemInfo("OS", "Windows 10");
			report.setSystemInfo("Environment", "UAT");
			report.setSystemInfo("Team Name", "Brute-Force");
			report.setSystemInfo("Browser Tested", "Chrome,Opera,Firefox");
			
			htmlReporter.config().setDocumentTitle("UAT UI Automation Results");
			htmlReporter.config().setReportName("All Headlines UI Test Report");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
		}
		
		return report;
	}

}
