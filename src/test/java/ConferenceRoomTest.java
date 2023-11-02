import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    @Before
    public void beforeEach()   {
        conferenceRoom = new ConferenceRoom(40, "Java");
    }

    @Test
    public void conferenceRoomCanGetCapacity() {
        assertEquals(40, conferenceRoom.getCapacity());
    }

//    @Test
//    public void conferenceRoomCanGetGuests() {
//    }

    @Test
    public void conferenceRoomCanGetName() {
        assertEquals("Java", conferenceRoom.getName());
    }
}