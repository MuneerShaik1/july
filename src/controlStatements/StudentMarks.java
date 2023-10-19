package controlStatements;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter student marks:");
		int num=scan.nextInt();
		
		if(num>=100)
		{
			System.out.println("A+");
		}
		else if(num<100 && num>=85)
		{
			System.out.println("A");
		}
		else if(num<75 && num>=60)
		{
			System.out.println("B");
		}
		else if(num<60 && num>=40)
		{
			System.out.println("C");
		}
		else if(num>=35)
		{
			System.out.println("Pass");
		}
		else {
	    System.out.println("Fail");

	}
		}

}
