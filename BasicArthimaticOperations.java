package com.pac.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicArthimaticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to Basic Programs");
			System.out.println("1.Calucator");
			System.out.println("2.Tables");
			System.out.println("3.Factorial");
			System.out.println("4.Reverse Number");
			System.out.println("0.Exit");
			String opt = sc.next();
			if(opt.equalsIgnoreCase("0")) {
				break;
			}else if(opt.equalsIgnoreCase("1")) {
				BasicArthimaticOperations.calucator();
			}else if(opt.equalsIgnoreCase("2")) {
				BasicArthimaticOperations.tables();
			}else if(opt.equalsIgnoreCase("3")) {
				BasicArthimaticOperations.factorial();
			}else if(opt.equalsIgnoreCase("4")) {
				BasicArthimaticOperations.reverse();
			}else {
				System.out.println("Enter a valid Option.\n");
			}
		}
		
	}
	
	public static void calucator() {
		
		while(true) {
			try {
			System.out.println("Please enter your first number : ");
			Scanner sc = new Scanner(System.in);
			BigDecimal fn = sc.nextBigDecimal();
		
			System.out.println("Please enter your second number : ");
			BigDecimal sn = sc.nextBigDecimal();
			
			System.out.println("Please enter Operator like (+,-,*,%,/) : ");
			String oper;
			oper = sc.next();
			
			switch(oper) {
				case "+" :
					System.out.println(fn.add(sn));
					break;
				case "-" :
					System.out.println(fn.subtract(sn));
					break;
				case "*" :
					System.out.println(fn.multiply(sn));
					break;
				case "%" :
					System.out.println(fn.remainder(sn));
					break;
				case "/" :
					System.out.println(fn.divide(sn, 10, RoundingMode.HALF_UP));
					break;
				default:
					System.out.println(" Please enter valid Option\n");
			
			}
			System.out.println("Type exit to exit or press any key and enter");
			String ex = sc.next();
			
			if(ex.equalsIgnoreCase("exit")) {
				break;
			}
			}catch (InputMismatchException e) {
				System.out.println("Enter a valid input");
			}
		}		
	}
	
	public static void tables() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Are you want to print single table(yes/no)? (OR) You want to exit type(exit)." );
			String choice = sc.next();
			if(choice.equalsIgnoreCase("yes")) {
				System.out.println("Enter a number which table you want : ");
				int num = sc.nextInt();
				
				for(int i = 1; i <= 10; i++ ) {
					System.out.println(num + " * " + i + " = " + num*i);			
				}
			}else if(choice.equalsIgnoreCase("no")){
				System.out.println("Please enter a number of starting table : ");
				int start = sc.nextInt();
				System.out.println("Please enter a number of ending table : ");
				int end = sc.nextInt();
				
				for(int i = start; i <= end; i++ ) {
					
					for(int j = 1; j <= 10 ; j++  ) {
						System.out.println( i + " * " + j + " = " + i*j);	
					}
					System.out.println("\n");
				}
			}else if(choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("Please enter a valid choice.\n");
			}
			
		}
	}
	
	public static void factorial() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Are you want to print single number(yes/no) (OR) You want to exit type(exit).");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("yes")) {
				System.out.println("Please enter a number: ");
				int num = sc.nextInt();
				if(num==0) {
					System.out.println(num +"! = 1");
				}
				int t = 1;
				while(num!=0) {
					t = t * num;
					if(num==1) {
						System.out.print(num+" = ");
					}else {
						System.out.print(num+" * ");		
					}
					num--;
				}
				System.out.println(t);
				/*
				 * Another way
				 * int temp = 1; for(int i = num; i >= 1; i--) { temp = temp * i ; }
				 * System.out.println("Using for loop : " +temp);
				 */
			}else if(choice.equalsIgnoreCase("no")) {
				System.out.println("Please enter a number of starting factorial : ");
				int start = sc.nextInt();
				System.out.println("Please enter a number of ending factorial : ");
				int end = sc.nextInt();
				
				for(int i = start; i <= end; i++ ) {
					long temp = 1;
					for(int j = i; j >= 1 ; j-- ) {
						temp = temp * j ;
						if(j==0 || j==1) {
							System.out.print(j+" = ");
						}else {
							System.out.print(j+" * ");		
						}
					}
					System.out.println(temp);
				}
			}else if(choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("Please enter a valid choice.\n");
			}
		}
	}
	
	public static void reverse() {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("Are you want to reverse a number or a String(for number type 'Num' and 'String' for String) [Or] Type exit to exit.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("num")) {
				
				System.out.println("Enter a number  to reverse : ");
				
				try {
					long num = sc.nextLong();
					sc.nextLine(); // Consume leftover newline character
					long temp = num ;
					long rev = 0 , temp2 = 0;
					
					while(num!=0) {
						temp2 = num % 10;
						rev = rev * 10 + temp2;
						num = num / 10;
					}
					
					if(temp!=rev) {
						System.out.println("Reverse number of "+temp+" is : "+rev+"\n");
					}else {
						System.out.println("Value is zero.\n");
					}
					
				}catch(InputMismatchException in) {
					System.out.println("Please enter a valid input. \n");
				}
				
			}else if(choice.equalsIgnoreCase("string")) {
				String reversedText = "";
				System.out.println("Please enter the text which you want to see in reverse order : ");
				String text = sc.nextLine();
				  
				if(!text.isEmpty()) {					
					for(int i=text.length()-1; i>=0; i--) {
						reversedText+= text.charAt(i);
					}
					System.out.println("Reverse text of "+text+" is : "+reversedText +" \n");
				    
					/*
					 * long start = System.nanoTime(); String revText =
					 * reverseUsingStringBuilder(text); long end = System.nanoTime();
					 * System.out.println("revers  : "+ revText);
					 * System.out.println("Time taken using loop: " + (end - start) + " ns");
					 */
				}else {
					System.out.println("text is empty");
				}
			}else if(choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("Enter a valid choice.\n");
			}	
			
		}
	}
	/*
	 * public static String reverseUsingStringBuilder(String text) { return new
	 * StringBuilder(text).reverse().toString(); }
	 */
	
}
