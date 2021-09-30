
//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
import java.text.NumberFormat;
public class Account
{
  private double balance;
  private String name;
  private long acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }


  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
 public String toString()
  {
  // NumberFormat fmt = NumberFormat.getCurrencyInstance();
   return "zs:" +acctNum + "\t" + name + "\t" + "$"+ balance;
 
  }

  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee()
  {
    if (balance >= 10)
       balance -= 10;
    else
       System.out.println("Insufficient funds");


  }

  //----------------------------------------------
  // Changes the name on the account 
  //----------------------------------------------
  public void changeName(String newName)
                          
  {
    this.name = newName;
  }

}