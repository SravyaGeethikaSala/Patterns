package regrex;

import java.util.Scanner;
import java.util.*;
import java.util.regex.Pattern;

public class MobileNumber {
	public static void main (String[]args) {
	Scanner sc =new Scanner(System.in); 
	System.out.println("Enter our input to check");
	String phonenumber=sc.nextLine();
	
	String phRegex="\\d{10}$"; 
	String phRegex2="^[(]\\d{3}[)][-]\\d{3}[-]\\d{4}$"; 
	String phRegex3="^[A-Z][A-Za-z0-9]{7,}$";
	String phRegex4="^[A-Za-z][0-9A-Za-z_]{5}$"; 
	if(Pattern.matches(phRegex4, phonenumber)) {
		System.out.println("Matches with the expression");
	}
	else {
		System.out.println("Doesnot match with the expression");
	} 
	}
}