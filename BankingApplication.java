import java.util.*;
import java.io.*;
public class BankingApplication{
   public static void main(String[] args) {
		int amount=20000;
		final String Accno= "12ae7b";
                final String password= "Hemasri@11";
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Account number:");
                String AcNo=sc.next();
                System.out.println("Enter your password:");
                String pwd=sc.next();
		if(Accno.equals(AcNo)&&password.equals(pwd))
		{		
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				while (true) 
				{
					System.out.println("1. Check Balance");
					System.out.println("2. Deposit");
					System.out.println("3. Withdraw");
					System.out.println("4. Exit");
					System.out.print("Enter your choice:");
					String num=br.readLine();
					switch (num) {
					case "1":
						amount= checkBalance(amount);
						break;
					case "2":
						amount= deposit(amount);
						break;
					case "3":
						amount= withdraw(amount);
						break;
					case "4":
						System.out.println("Thank you");
						System.exit(0);
						break;
					
					default:
						System.out.println("Invalid number");
						break;
                                                                                }
				}
                                                      }
			catch(Exception e){
				e.printStackTrace();
			}
		}
                                      else {
			System.out.println("Invalid login credentials");
                                                     System.exit(0);
	}
              }

		private static int withdraw(int amount) {
		
		System.out.println("Enter the Amount you want to withdraw:");
		Scanner sc= new Scanner(System.in);
		int withdraw =sc.nextInt();
		if(withdraw<amount)
		{
			amount=amount-withdraw;
			System.out.println(" "+ withdraw+" is withdrawn from your Account");
			System.out.println("Current Available Balance is Rs."+ amount);
			return amount;
		}
		else
		{
			System.out.println("Low Balance");
			System.out.println("Current Available Balance is Rs."+ amount);
			return amount;
		}
	}
	
	private static int deposit(int amount) {
		
		System.out.println("Enter the Amount you want to deposit:");
		Scanner sc= new Scanner(System.in);
		int deposit =sc.nextInt();
		amount=amount+deposit;
		System.out.println(" "+ deposit+" is deposited into your Account");
		System.out.println("Current Available Balance is Rs."+ amount);
		return amount;
		
	}

	private static int checkBalance(int amount) {
		
		System.out.println("Available Balance is Rs."+ amount);
		return amount;
	}

}