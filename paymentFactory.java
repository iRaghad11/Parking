public class paymentFactory {
    
    public static final int cash=1;
    public static final int creditCard=2;
    
    public static Payment choosePayment (int ticketID) {
    
        switch (ticketID) {
            case cash:
                return new Cash();
            case creditCard:
                return new creditCard();
            default:
                return null;
        }
    }
    
}
