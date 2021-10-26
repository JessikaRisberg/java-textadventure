import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void getName() {
        Room bedroom = new Room("bedroom", "a small bedroom for you");

        assertEquals(bedroom.getName(), bedroom.getDescription());
    }

    @Test
    void getDescription() {
    }
}