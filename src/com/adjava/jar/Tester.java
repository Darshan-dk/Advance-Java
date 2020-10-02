package com.adjava.jar;

public class Tester {
	public static void main(String[] args) {
		Metro m = new Metro("Namma Metro", 6);
		System.out.println(m);
		m.transport();
	}

}
// steps to create jar file is
/*select Project-right click-Export-JAR file-browse-select location */
//steps to import jar file is
/*select Project-right click-Properties-Java Build Path-Add external Jar/add jar-select he file */

// NOTE-to perform this activity we need to delete the original class file.