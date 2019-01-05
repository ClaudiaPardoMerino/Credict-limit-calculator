//Exercise 4.18 4th week homework
// CreditLimitCalculator.java
// CreditLimitCalculator class with 5 integer variables 

public class CreditLimitCalculator
{   
   int accountnumber; // instance variable 
   int beginningbalance; // instance variable 
   int itemscharge; // instance variable 
   int creditsapply; // instance variable 
   int creditlimit; // instance variable 
      

   // Account constructor that receives five parameters  
   public CreditLimitCalculator(int accountnumber,int beginningbalance,int itemscharge,int creditsapply, int creditlimit) 
   {
      this.accountnumber = accountnumber; 
      this.beginningbalance = beginningbalance;
      this.itemscharge = itemscharge;
      this.creditsapply = creditsapply;
      this.creditlimit = creditlimit;      
    
   }
   
   	//Set methods
   public void setaccountnumber(int accountnumber){
       this.accountnumber= accountnumber;
       }
   public void setbeginningbalance(int beginningbalance){
       this.beginningbalance= beginningbalance;
       }
   public void setitemscharge(int itemscharge){
	   this.itemscharge = itemscharge;
       }
   public void setcreditsapply(int creditsapply){
	   this.creditsapply = creditsapply;
       }
   public void setcreditlimit(int creditlimit){
	   this.creditlimit = creditlimit;  
       }
   
 //Get methods
   public int getaccountnumber(){
       return accountnumber;
   }
   public int getbeginningbalance(){
       return beginningbalance;
   }
   public int getitemscharge(){
       return itemscharge;
   }
   public int getcreditsapply(){
       return creditsapply;
   }
   public int getcreditlimit(){
       return creditlimit;
   }
   public int getNewBalance(){
       return getbeginningbalance() + getitemscharge() - getcreditsapply();
   }
   public boolean creditExceeded(){
       return (getNewBalance() > getcreditlimit()) ? true : false;
   }
}// end class Credit Limit Calculator
     
   
      
    

   