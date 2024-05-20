package Parking;
import java.util.*;

public class ParkingLot {

    public static void main(String[] args) {
        
        System.out.println("----------------------------");
        
        // State pattern
        Client context = new Client();

        CloseGate stopState = new CloseGate();
        stopState.doAction(context);
        System.out.println(context.getgateState().toString());

        // singleton pattern
        ParkingSpot parkingspot = ParkingSpot.getInstance();

        ArrayList<ParkingTicket> assignedspotlist = new ArrayList<>();

        // Factory pattern
        Payment pay = paymentFactory.choosePayment(paymentFactory.cash);

        Clean cleanCar1 = new innerClean();
        cleanCar1.cleans();
        // Decorator pattern
        Clean cleanCar = new DeepCleaningDecorator(new innerClean());

        // Facade pattern
        PaymentAcc Payby = new PaymentAcc();
        Payby.PayCash();

        RandomInfo randominfo = new RandomInfo();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the code: ");
        String userinput = scan.nextLine();
        int size = userinput.length();

        ParkingTicket parkingticket = new ParkingTicket();
        Car car = new Car();

        String carcolor = randominfo.CarColor();
        String numberplate = randominfo.Numberplate();
        String cartype = randominfo.CarType();
        parkingticket.setAssignedCar(car);
        parkingticket.getAssignedCar().setNumberPlate(numberplate);
        parkingticket.getAssignedCar().setCarColor(carcolor);
        parkingticket.getAssignedCar().setCarType(cartype);

        int spotnum = parkingspot.SpotNum();
        if (spotnum != 0 && size == 5) {
            parkingticket.setSpotNumber(spotnum);

            String cardtype = randominfo.CardType();
            String time = randominfo.Time();
            String date = randominfo.Date();
            long cardnumber = randominfo.CardNumber();

            parkingticket.setCardType(cardtype);
            parkingticket.setTime(time);
            parkingticket.setDate(date);
            parkingticket.setCardNumber(cardnumber);

            Payment paymentAmount = new Payment();

            int[] timee = { 4, 30 };
            float baseAmount = paymentAmount.TotalAmount(timee[0], timee[1]);

            // Strategy pattern
            PaymentHandler paymentHandler_Tip = new PaymentHandler(new CalculateTipAmount());
            PaymentHandler paymentHandler_Tax = new PaymentHandler(new CalculateTaxAmount());

            float totalAmount = baseAmount;

            while (true) {

                System.out.print("Do you want to add a tip? y/n. ");
                String tipInput = scan.nextLine();

                if (tipInput.toLowerCase().equals("y")) {

                    System.out.print("Input your tip percentage 0-100. ");
                    String tipPercentageInput = scan.nextLine();

                    float tippedAmount = paymentHandler_Tip.executeCalculation(baseAmount,
                            Integer.parseInt(tipPercentageInput));

                    totalAmount = tippedAmount;
                    

                    break;
                } else if (tipInput.toLowerCase().equals("n")) {
                    float taxedAmount = paymentHandler_Tax.executeCalculation(baseAmount,
                            15);
                    totalAmount = taxedAmount;
                    System.out.print(taxedAmount);

                    break;

                } else {
                    continue;
                }
            }

            System.out.println("\n\t\t== Parking Ticket ==\n"
                    + "Car Number : " + numberplate + "    Car Color : " + carcolor + "    Car Type : " + cartype
                    + "\nParking Time : " + time + "    Date : " + date
                    + "\nSpot Number : " + spotnum
                    + "\nTotal Time : " + timee[0] + " Hour " + timee[1] + " Minute "
                    + "\nTotal Amount : " + totalAmount + " riyal.");

            // Factory pattern
            pay.print();
            // Decorator pattern
            cleanCar.cleans();
            
            System.out.print("\n");
            
            // State pattern
            OpenGate startState = new OpenGate();
            startState.doAction(context);
            System.out.println(context.getgateState().toString());

        }
    }
}
