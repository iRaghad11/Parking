public class CalculateTipAmount implements CalcPayment {

    @Override
    public float ApplyPercentageIncrease(float currentAmount, int percentage) {

        float percentageFloat = percentage / 100.0f;
        float tipIncrease = (currentAmount * percentageFloat);
        float taxIncrease = (currentAmount * (15.0f / 100.0f));

        return currentAmount + tipIncrease + taxIncrease;

    }

}
