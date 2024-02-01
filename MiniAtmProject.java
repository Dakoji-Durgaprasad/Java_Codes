import java.util.*;

public class MiniAtmProject {

	public static void main(String[] args) {
		
		int Balance = 2000;
		int Deposit = 0;
		int Withdraw = 0;
		int password=1234;
		int a=0;
		
		
		
		while(true) { 
		System.out.println("Welcome to ATM \n");
		System.out.println("Please choose an option: ");
		
		System.out.println("1.Check Balance ");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.EXIT \n");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your option :");
		
		int opt= sc.nextInt();
		
		switch(opt){
		case 1:
			if(pin(a)) {
			System.out.println(Balance);
			}else {
				System.out.println("Enter valid Pin!");
			}
			break;
		
		case 2:
			if(pin(a)) {
			System.out.println("Enter an amount to Deposit: ");
			Deposit = sc.nextInt();
			Balance = Deposit + Balance;
			System.out.println("Your current Balance is : "+Balance);
			}else {
				System.out.println("Enter valid Pin!");
			}
			break;
		
		case 3:
			if(pin(a)) {
			System.out.println("Enter an amount to Withdraw: ");
			Withdraw = sc.nextInt();
			if(Balance > Withdraw) {
				Balance = Balance - Withdraw;
				System.out.println("Your current Balance is : "+Balance);
			}
			else {
				System.out.println("Your current balance is Unable to Withdraw!");
			}
			}else {
				System.out.println("Enter valid Pin!");
			}
			break;
		case 4:
			System.out.println("Your last transactioin history : ");
			System.out.println("Last time added desposited : "+Deposit);
			System.out.println("Last time added withdrawal : "+Withdraw);
			System.out.println("Your current Balance is : "+Balance +"\n");
			break;
		case 5:
			System.out.println("Thanks for Visiting!! \n");
			break;
			
		default:
			System.out.println("Enter valid Option!!");
		}
		if(opt==5) {
			break;
		}
		}
		}
		public static boolean pin(int a) {
		
		int password = 1234;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your four digit pin: ");
		 a = sc.nextInt(); 
		
		 return(a==password);

		}
		
	}


