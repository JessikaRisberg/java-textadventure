public class Room {

    private String name;
    private String description;

    public Room(String inName, String inDescription){
        name = inName;
        description = inDescription;
    }

    // Getter and setter for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Getter and setter for description

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString(){
        String room =  getName() + "\n";
        room = room + getDescription() + "\n";
        return room;
    }
}
