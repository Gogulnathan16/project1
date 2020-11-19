package org.second_package;

import org.screen.Artel;

public class SecondPackage {
	
	
	public void test1() {
		System.out.println("test1");
		
		
		
		
	}
	public void test2() {
		System.out.println("test2");
		
	}
	public static void main(String[] args) {
		SecondPackage tet = new SecondPackage();
		
		tet.test1();
		tet.test2();
		
		Artel a = new Artel();
		a.aircel();
		a.vodafone();
	}

}
