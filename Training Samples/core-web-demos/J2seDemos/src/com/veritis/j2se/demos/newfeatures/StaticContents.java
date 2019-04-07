package com.veritis.j2se.demos.newfeatures;

public class StaticContents {
	public static final int MAX = 100;
	public static final int MIN = 1;
	public static final String str = "This string is constant we cant not change";

	public static void display() {
		System.out.println("minimun : " + MIN + "  maximum :" + MAX
				+ "  string :" + str);
	}
}
