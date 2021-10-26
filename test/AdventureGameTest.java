import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdventureGameTest {


    @Test
    void save() {

    }

    @Test
    void load() {
    }

    @Test
    void initialization() {
        Room pinkRoom = new Room("bedroom", "a small bedroom for you");
        assertEquals(pinkRoom, pinkRoom.getDescription());

    }

    @Test
    void gameLoop() {
    }

    @Test
    void quit() {
    }
}