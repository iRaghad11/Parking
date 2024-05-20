package Parking;
public class DeepCleaningDecorator extends CleanDecorator {

    public DeepCleaningDecorator(Clean decoratedClean) {
        super(decoratedClean);
    }

    @Override
    public void cleans() {
        decoratedClean.cleans();
        setDeepCleaningDecorator(decoratedClean);
    }

    private void setDeepCleaningDecorator(Clean decoratedClean) {
        System.out.println("Deep cleaning service");
    }
}