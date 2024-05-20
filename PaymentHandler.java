package Parking;
public class PaymentHandler {
    private CalcPayment calcPayment;

    public PaymentHandler(CalcPayment calcPayment) {
        this.calcPayment = calcPayment;

    }

    public float executeCalculation(float currentAmount, int percentage) {
        return calcPayment.ApplyPercentageIncrease(currentAmount, percentage);

    }

}
