
package btvn;

import java.util.Date;

public class MeetingRoom extends Room {
    private int numChairs;

    public MeetingRoom(String roomID, String roomType, Date rentalDate, Date returnDate, double price, int numChairs) {
        super(roomID, roomType, rentalDate, returnDate, price);
        this.numChairs = numChairs;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Chairs: " + numChairs);
    }
}
