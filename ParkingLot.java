
import java.util.ArrayList;
import java.util.*;

public class ParkingLot {

    public static void main(String[] args) {

        //singleton pattern
        ParkingSpot parkingspot = ParkingSpot.getInstance();

        ArrayList<ParkingTicket> assignedspotlist = new ArrayList<>();

        //Factory pattern
        Payment pay = paymentFactory.choosePayment(paymentFactory.cash);

        Clean cleanCar1 = new ScanTheCar();
        cleanCar1.cleans();
        //Decorator pattern
        Clean cleanCar = new CarCleanDecorator(new ScanTheCar());

        //Facade pattern
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

            int[] timee = {0, 0};
            float amount = 0;

            System.out.println("\t\t== Parking Ticket ==\n"
                    + "Car Number : " + numberplate + "    Car Color : " + carcolor + "    Car Type : " + cartype
                    + "\nParking Time : " + time + "    Date : " + date
                    + "\nSpot Number : " + spotnum
                    + "\nTotal Time : " + timee[0] + " Hour " + timee[1] + " Minute "
                    + "\nTotal Amount : " + amount + " rupees."
            );

            //Factory pattern                    
            pay.print();
            //Decorator pattern
            cleanCar.cleans();

        }
    }
}
