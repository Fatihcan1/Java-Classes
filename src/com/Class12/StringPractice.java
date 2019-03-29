package com.Class12;

public class StringPractice {

	public static void main(String[] args) {
		String str="Syntax";
		
		int lengthOfString=str.length();
		
		System.out.println(lengthOfString);
		
		
		String str1="Syntax Technologies";
		
		int lengthOf2String=str1.length();
		System.out.println(lengthOf2String);
		
		String str2="Welcome, students!";
		System.out.println(str2.length());
		
		String str3="Hello";
		String newString=str3.toUpperCase();
		System.out.println(newString);
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
          
		String str4="Hello";
		String str5="hello";
		
		boolean equality=str4.equals(str5);
		System.out.println(equality);
		
		
		// equalsIgnoreCase()---- compares 2 string but ignore case
		String expectedBrowser="Chrome";
		String actualBrowser="chrome";
		
		boolean equal=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equal);
		
		
	}

}
