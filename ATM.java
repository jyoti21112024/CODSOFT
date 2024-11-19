import java.util.Scanner;
  class BankAccount
{
     double balance;
   BankAccount(double intialBalance)
    {
      balance=intialBalance;
    }
       double getBalance()
    {
        return balance;
    }
    
     void deposit(double amount)
    {
        balance +=amount;
        System.out.println("your deposited amount is: " + amount);
    }
   void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println("you have withdraw" + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
      }
    }

    
       class ATM{
        public static void main(String[]args)
        {
           
            BankAccount account=new BankAccount(3000);
            Scanner sc=new Scanner(System.in);
            while(true)
            {
            System.out.println("choose the option which you want to proceed");
            System.out.println("1.check your Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("your Balance is:$" + account.getBalance());
            }

            else if(choice==2)
            {
                System.out.println("Enter the amount you want to deposit:");
                double amount=sc.nextDouble();
                account.deposit(amount);
            }
            else if(choice==3)
            {
                System.out.println("Enter the amount you want to withdraw:");
                double amount=sc.nextDouble();
                account.withdraw(amount);
            }
            else if(choice==4)
           {
             System.out.println("Thank You,Exiting....");
             break;
           }
            else
            {
              System.out.println("Invalid choice.Try Again");
            }
        }
        sc.close();
    }
        }
    
    
    
    

        

        
    
    
            
                
        