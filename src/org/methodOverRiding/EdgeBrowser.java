package org.methodOverRiding;

public class EdgeBrowser extends WebDriver{

	public void maximize() {
		System.out.println("This Method is used to Maximize the EdgeBrowser");
	}
	public static void main(String[] args) {
		WebDriver chrome = new ChromeBrowser();
		WebDriver firefox = new FireFoxBrowser();
		WebDriver edge = new EdgeBrowser();
		
		chrome.maximize();
		firefox.maximize();
		edge.maximize();
		System.out.println("We create the Object for Child class"
									 + "But reference of parent and executed by Child Class.");
	}
}
