import geometry.rectangle;

public class a2_prob78 {//BankAccount class
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    a2_prob78(String accountNumber,String accountHolderName){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid Deposit");

        }
        else{
        balance += amount;
        System.out.println("Rs."+amount+" is deposit in your account. Your current balance is: "+balance);
        }
    }

    public void withdraw(double amount){
        if(amount<=balance){
        balance-=amount;
        System.out.println("Balance amount is "+balance+" after "+amount+" withdraw");
    }

        else{
            System.out.println("Invalid withdraw");
        }
        
        
    }
    public static void main(String[] args) {
        a2_prob78 account=new a2_prob78("001", "Sachin");
        account.deposit(100);
        account.withdraw(10);
        account.deposit(40);
        account.withdraw(500);
    }
}
