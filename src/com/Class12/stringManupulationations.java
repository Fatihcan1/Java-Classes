package com.Class12;

import java.util.Scanner;

public class stringManupulationations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		String userName, password, confirmedPassword, message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scan.nextLine();
		
		System.out.println("Please enter password");
		password=scan.nextLine();
		
		System.out.println("Please confirm password");
		confirmedPassword=scan.nextLine();
		
		if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
			if(password.length()>8) {//2 checkpoint
				if (!password.contains(userName)) {//3 checkpoint
					if (password.equals(confirmedPassword)) {//4 checkpoint
						message="Your username and password has been created";
					}else {
						message="Passwords do not match";
					}
				}else {
					message="Password cannot contain username";
				}
			}else {
				message="Password is too short";
			}
		}else {
			message="Username and Password cannot be empty";
		}
		System.out.println(message);
		
		
		
		
		
		
		
		
	}

}
