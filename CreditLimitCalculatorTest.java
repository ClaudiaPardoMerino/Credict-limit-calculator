//Exercise 4.18 4th week homework
// CreditLimitCalculatorTest.java
import java.util.Scanner;

public class CreditLimitCalculatorTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // create a Scanner to obtain input from the command window
        CreditLimitCalculator calculateCredit = new CreditLimitCalculator(0,0,0,0,0);

        int accountnumber, beginningbalance, itemscharge, creditsapply, creditlimit;
        char cont = 'y';
        String separator = "\n############################\n";

        while(cont != 'n'){
            System.out.println(separator);
            System.out.print("Enter customer account number: ");
            accountnumber = input.nextInt();
            
            // obtain user input
            System.out.printf("Enter beginning balance for account %d:", accountnumber);
            beginningbalance = input.nextInt();
            System.out.printf("Enter items charge for account %d:", accountnumber);
            itemscharge = input.nextInt();
            System.out.printf("Enter credits apply for account %d:", accountnumber);
            creditsapply = input.nextInt();
            System.out.printf("Enter credit limit for account %d:", accountnumber);
            creditlimit = input.nextInt();
            
            calculateCredit.setaccountnumber(accountnumber);
            calculateCredit.setbeginningbalance(beginningbalance);
            calculateCredit.setitemscharge(itemscharge);
            calculateCredit.setcreditsapply(creditsapply);
            calculateCredit.setcreditlimit(creditlimit);


            System.out.println(separator);
            System.out.printf("Credit Information For Account %d\n", accountnumber);

            System.out.printf("Beginning balance: %d\n", calculateCredit.getbeginningbalance());
            System.out.printf("Credit Limit: %d\n", calculateCredit.getcreditlimit());
            System.out.printf("Items Charge: %d\n", calculateCredit.getitemscharge());
            System.out.printf("Credits Apply: %d\n", calculateCredit.getcreditsapply());
            System.out.printf("New Balance: %d\n", calculateCredit.getNewBalance());

            if(calculateCredit.creditExceeded())
                System.out.println("Credit limit exceeded.");

            // continue
            System.out.print("Calculate credit for another account? (y/n): ");
            cont = input.next().charAt(0);
        }
    
    }
}// end class CreditLimitTest
