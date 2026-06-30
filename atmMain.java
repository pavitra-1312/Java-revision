import java.util.*;

public class atmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter password:- ");
        int pwd = sc.nextInt();
        double Balance = 14000.58;
        int original_pwd = 1234;
        if(pwd == original_pwd){
          System.out.println("Welcome\n1. Check Balance\n2. Withdraw Money\n3. Deposit Money\n4. Exit");
          int option = 0;
          while(true){
              System.out.println("Enter your choice (1/2/3/4):");
              option = sc.nextInt();
              if(option == 1){
                  System.out.println(Balance);
              } else if(option == 2){
                  System.out.println("Enter Withdraw Amount");
                  int Withdraw_amt = sc.nextInt();
                  if(Withdraw_amt > Balance){
                      System.out.println("Insufficient Balance");
                  } else if(Withdraw_amt % 100 != 0){
                      System.out.println("Enter valid Amount");
                  } else{
                      Balance -= Withdraw_amt;
                      System.out.println("Withdraw Successful");
                  }
              } else if(option == 3){
                  System.out.println("Enter Deposit Amount");
                  int dep_amt = sc.nextInt();
                  if(dep_amt % 100 == 0){
                      Balance += dep_amt;
                  } else {
                      System.out.println("Enter valid Amount");
                  }
              } else if(option == 4){
                  System.out.println("Thank you");
                  break;
              } else {
                  System.out.println("Invalid Option...");
              }
          }
        } 
        else{
            System.out.println("Invalid password");
        }
    }
}