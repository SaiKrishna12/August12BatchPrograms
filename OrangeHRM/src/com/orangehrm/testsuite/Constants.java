package com.orangehrm.testsuite;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehrm.utility.ExcelOperations;
import com.orangehrm.utility.Screenshots;

public class Constants {
	
	static RemoteWebDriver driver=null;
	ExcelOperations  eo=new ExcelOperations();
	String path1="E:\\August12Batch\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String path2="E:\\August12Batch\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
	Screenshots sc=new Screenshots();
}
