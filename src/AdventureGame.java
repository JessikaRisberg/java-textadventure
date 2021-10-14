public class AdventureGame {

    int row;
    int col;

    Room[][] map;

    public void initalization() {
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

}
