
public class PaymentAcc {
    private Payment creditCard; 
 private Payment cash; 


 public PaymentAcc() { 
  creditCard = new creditCard(); 
  cash = new Cash(); 
 } 

 public void PaycreditCard(){ 
  creditCard.Pay(); } 

 public void PayCash(){ 
  cash.Pay(); } 
}
