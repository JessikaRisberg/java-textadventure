import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void getName() {
        Room bedroom = new Room("pinkroom", "a small bedroom for you");

        assertEquals(bedroom, bedroom);
    }

    @Test
    void getDescription() {
        Room pinkroom = new Room("pinkroom", "a super pinkroom with a fluffy rug");

        assertEquals(pinkroom, pinkroom);
    }
}