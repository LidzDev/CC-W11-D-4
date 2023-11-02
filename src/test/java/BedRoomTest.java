import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BedRoomTest {

    BedRoom bedRoom;
    Guest guest1;
    Guest guest2;
    @Before
    public void beforeEach(){
        guest1 = new Guest("Nugget");
        guest2 = new Guest("Donut");
        bedRoom = new BedRoom(RoomType.DOUBLE.getCapacity(), 104, RoomType.DOUBLE);
    }

    @Test
    public void bedRoomCanGetCapacity() {
        assertEquals(2, bedRoom.getCapacity() );
    }

    @Test
    public void bedRoomCanGetRoomNumber() {
        assertEquals(104, bedRoom.getRoomNumber());
    }

    @Test
    public void bedRoomCanGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedRoom.getRoomType());
    }
}