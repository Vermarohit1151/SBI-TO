import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.Period;
//import java.time.temporal.*;


public class Banktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Acc1 = new BankAccount();
		BankAccount Acc2 = new BankAccount();
		BankAccount Acc3 = new BankAccount();
		
		Acc1.setBankAccount(101,"Rohit Verma",40000.0,2022,5,15,1998,11,04);
		Acc2.setBankAccount(102,"Rahul Singh",40000.60,2015,7,16,1995,11,21);
		Acc3.setBankAccount(103,"Ajay Rana",25641.25,2017,8,25,1997,5,15);
		
		//Acc1.print();
		//System.out.println();
		//Acc3.print();
		//System.out.println();
		//Acc1.print();
		//System.out.println();
		//Acc1.deposit(2500);
		//System.out.println();
		Acc1.withdraw(150000);
		
		BankAccount.balanceTransfer(Acc1,Acc2,2300);
		
	}
	
	

}

class BankAccount
{
	private int accountNumber ;
	private String accountName ; 
	private double accountBalance ;
	private LocalDate accountOpeningDate;
	private LocalDate birthDate;
	
	public void setBankAccount(int x,String y,double z,int year, int month, int day, int Byear, int Bmonth, int Bday) {
		this.accountNumber = x;
		this.accountName = y;
		this.accountBalance = z;
		accountOpeningDate = LocalDate.of(year, month, day);
		birthDate = LocalDate.of(Byear, Bmonth, Bday);
		//Period period ;
	}
	
	 void withdraw(double amtToWithdraw) {
		 if(amtToWithdraw > accountBalance) {
			 throw new RuntimeException("Not enough Balance available");
		 }
		System.out.println(""+accountName+" is Withdrawing "+amtToWithdraw);
		accountBalance -= amtToWithdraw;
		System.out.println("Current Balance : "+accountBalance);
	}
	 void deposit(double amtToDeposit) {
		 if(amtToDeposit > 100000) {
			 throw new RuntimeException("Please provide PAN/income proof");
		 }
		System.out.println(""+accountName+" is Depositing "+amtToDeposit);
		accountBalance += amtToDeposit;
		System.out.println("Current Balance : "+accountBalance);
	 }
	
	 public static void balanceTransfer(BankAccount one, BankAccount two, double amount) {
		 one.accountBalance -= amount;
		 two.accountBalance += amount;
		 System.out.println("After Txn :\n----------------------------------");
		 System.out.println("Balance of "+ one.accountName+ "= "+one.accountBalance);
		 System.out.println("Balance of "+ two.accountName+ "= "+two.accountBalance);
	 }
	 
	 void print() {
		
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder : "+accountName);
		System.out.println("Account Balance : "+accountBalance );
		System.out.println("Account Opening Date : "+accountOpeningDate);
		System.out.println("BirthDate : "+birthDate);
		//Period.between(birthDate,accountOpeningDate);
		
	}
	
	
}