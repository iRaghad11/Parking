package Parking;

public class Cash extends Payment {

    public Cash() {
        setpaymentType("Cash");
    }

    @Override
    public void Pay() {
        System.out.println("Payment by cash");
    }
}

