
package btvn;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RoomManagement roomManagement = new RoomManagement();
        
        // Thêm một số phòng mẫu
        roomManagement.addRoom(new Bedroom("R001", "A", new Date(), new Date(), 1200000, 2) {});
        roomManagement.addRoom(new MeetingRoom("R002", "B", new Date(), new Date(), 1000000, 50));

        // Hiển thị danh sách phòng
        System.out.println("Room List:");
        roomManagement.displayAllRooms();

        // Tính tổng tiền thuê
        System.out.println("Total Rent: " + roomManagement.calculateTotalRent());
    }
}

