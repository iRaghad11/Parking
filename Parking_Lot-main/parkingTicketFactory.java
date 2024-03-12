/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raghad
 */
public class parkingTicketFactory {
    
    public static final int VIP=1;
    public static final int Normal=2;
    
    public static ParkingTicket chooseTicket (int ticketID) {
    
        switch (ticketID) {
            case VIP:
                return new VIP();
            case Normal:
                return new normalTicket();
            default:
                return null;
        }
    }
    
    
    
}
