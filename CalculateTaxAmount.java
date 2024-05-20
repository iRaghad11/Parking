package Parking;
public class CalculateTaxAmount implements CalcPayment {

    @Override
    public float ApplyPercentageIncrease(float currentAmount, int percentage) {

        return currentAmount + (currentAmount * (15.0f / 100.0f));

    }

}
