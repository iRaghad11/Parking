package Parking;
public class creditCard extends Payment {

    public creditCard() {
        setpaymentType("Credit card");
    }

    @Override
    public void Pay() {
        System.out.println("Payment by CreditCard");
    }
}
