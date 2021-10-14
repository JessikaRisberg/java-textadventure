import java.util.Scanner;

public class AdventureGame {

    int row;
    int col;

    Room[][] map;
    Scanner input;

    public void initalization() {
        // input from player
        input = new Scanner(System.in);

        // Creating room
        Room entrance = new Room("The entrance", "A open room with a large door behind you");
        Room aroom = new Room("A dark room", "A dark room with only light from a lightbulb in the sealing");
        Room closet = new Room("A closet", "A small closet with a pile of clothes and a drawer");
        Room bedroom = new Room("A bedroom", "a bedroom with a large old bed");


        // the map
        map = new Room[][]{
                {entrance, aroom},
                {bedroom, closet}
        };

        // start position
        row = 0;
        col = 1;
    }

    private String[] playerInput() {
        // reading input from player
        System.out.println("> ");
        String command = input.nextLine();

        String[] commandparts = command.split(" ");
        return commandparts;
    }

    private void updatePlayerPosition(String direction) {
        // check direction according to player input
        if (direction.equalsIgnoreCase("north")) {
            row--;
            if (row < 0) {
                row = 0;
            }
        } else if (direction.equalsIgnoreCase("south")) {
            row++;

        } else if (direction.equalsIgnoreCase("east")) {
            col++;
            if (col >= map[row].length) {
                col--;
            }
        } else if (direction.equalsIgnoreCase("West")) {
            col--;
            if (col < 0) {
                col = 0;
            }
        }
    }

    public void gameLoop() {
        System.out.println("Welcome to The Escape");
        System.out.println("This is an text adventure game");

        boolean running = true;

        while (running) {
            System.out.println(map[row][col].toString());

            // reading input from player from playerInput()
            String[] commandParts = playerInput();
            String command = commandParts[0];

            if (command.equalsIgnoreCase("go")) {
                updatePlayerPosition(commandParts[1]);

                if (commandParts.length >= 2) {
                    System.out.println("Going " + commandParts[1]);
                } else {
                    System.out.println("Direction is missing");
                }
            }
            // tolka kommando
            else if (command.equalsIgnoreCase("quit")) {
                running = false;
            }
        }
    }
}
