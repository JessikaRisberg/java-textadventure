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
        // set up
        Room pinkRoom = new Room("Pink room", "This is a room with pink walls filled with pink furniture");

        // Check result
        assertSame(pinkRoom, pinkRoom);
    }

    @Test
    void runningGameLoop() {
        boolean isRunnig = true;
        //Check running gameloop
        assertTrue(isRunnig);
    }

    @Test
    void notRunningGameLoop() {
        boolean isRunning = false;

        assertFalse(isRunning);
    }

    @Test
    void quit() {



    }
}