import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    BedRoom room1;
    BedRoom room2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void beforeEach()   {
        hotel = new Hotel();
        room1 = new BedRoom(1, 104, RoomType.SINGLE);
        room2 = new BedRoom(2, 106, RoomType.DOUBLE);
        conferenceRoom1 = new ConferenceRoom(40, "Java");
        conferenceRoom2 = new ConferenceRoom(80, "Lijah");
        guest1 = new Guest("Nugget");
        guest2 = new Guest("Donut");
    }

    @Test
    public void hotelCanGetBedRooms() {
    }
    @Test
    public void hotelCanAddBedRooms() {
        hotel.addBedRoom(room2);
        assertEquals(1, hotel.getBedRooms().size());
    }
    @Test
    public void hotelCanGetConferenceRooms() {
    }

    @Test
    public void hotelCanAddConferenceRooms() {
    }
}