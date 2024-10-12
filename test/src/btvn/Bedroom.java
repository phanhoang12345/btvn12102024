
package btvn;

import java.util.Date;

public abstract class Bedroom extends Room {
    private int numBeds;

    public Bedroom(String roomID, String roomType, Date rentalDate, Date returnDate, double price, int numBeds) {
        super(roomID, roomType, rentalDate, returnDate, price);
        this.numBeds = numBeds;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Beds: " + numBeds);
    }
}