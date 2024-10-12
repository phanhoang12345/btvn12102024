
package btvn;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class RoomManagement {
    private ArrayList<Room> roomList;

    public RoomManagement() {
        roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void removeRoom(String roomID) {
        roomList.removeIf(room -> room.getRoomID().equals(roomID));
    }

    public void updateRoom(String roomID, Room newRoom) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomID().equals(roomID)) {
                roomList.set(i, newRoom);
                break;
            }
        }
    }

    public void displayAllRooms() {
        for (Room room : roomList) {
            room.displayInfo();
        }
    }

    public double calculateTotalRent() {
        double totalRent = 0;
        for (Room room : roomList) {
            totalRent += room.calculateRent();
        }
        return totalRent;
    }
}

    
