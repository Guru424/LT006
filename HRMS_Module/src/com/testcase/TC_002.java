package com.testcase;

import com.genlib.General;

public class TC_002 {
public static void main(String[] args) {
	
	General g=new General();
	g.openBrowser();
	g.openApplication();
	g.login();
	g.addEmployee();
	g.closeBrowser();
}
}
