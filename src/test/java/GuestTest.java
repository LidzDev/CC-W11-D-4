import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuestTest {

    Guest guest;
    @Before
    public void BeforeEach(){
        guest = new Guest("Nugget");
    }

    @Test
    public void guestCanGetName() {
        assertEquals("Nugget", guest.getName());
    }
}