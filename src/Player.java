public class Player {

    public String name;


    public Player(String inName){
        name = inName;
    }

    public String getName(){ return name; }
    public void setName(String newName) { this.name = newName; }

    @Override
    public String toString(){
        String playerString = getName() + "\n";

        return playerString;
    }
}
