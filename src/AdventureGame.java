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
        row = 1;
        col = 1;
    }

    private String[] playerInput() {
        // reading input from player
        System.out.println("> ");
        String command = input.nextLine();

        String[] commandparts = command.split(" ");
        return commandparts;
    }

}
