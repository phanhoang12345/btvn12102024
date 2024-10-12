
package btvn;

import java.util.Date;

public abstract class Room implements IRoom {
    protected String roomID;
    protected String roomType;
    protected Date rentalDate;
    protected Date returnDate;
    protected double price;

    public Room(String roomID, String roomType, Date rentalDate, Date returnDate, double price) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.price = price;
    }

    @Override
    public double calculateRent() {
        long difference = returnDate.getTime() - rentalDate.getTime();
        long days = (difference / (1000 * 60 * 60 * 24)) + 1; // Tính số ngày thuê
        return days * price;
    }

    public String getRoomID() {
        return roomID;
    }

    public void displayInfo() {
        System.out.println("Room ID: " + roomID + ", Room Type: " + roomType + ", Price: " + price);
    }
}
