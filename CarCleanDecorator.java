
public class CarCleanDecorator extends CleanDecorator {

    public CarCleanDecorator(Clean decoratedClean) {
        super(decoratedClean);
    }

    @Override
    public void cleans() {
        decoratedClean.cleans();
        setCarCleanDecorator(decoratedClean);
    }

    private void setCarCleanDecorator(Clean decoratedClean) {
        System.out.println("The car has been cleaned");
    }
}