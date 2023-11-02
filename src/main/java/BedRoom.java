import java.util.ArrayList;

public class BedRoom extends Room{
    private int roomNumber;
    private RoomType roomType;

    public BedRoom(int capacity,  int roomNumber, RoomType roomType) {
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

}
