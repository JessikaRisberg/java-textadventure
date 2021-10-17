public class Character {

    private String name;
    private String information;

    public Character(String inName, String inInformation) {
        name = inName;
        information = inInformation;
    }

    public String getName() { return name; }
    public void setName(String newName) { this.name = newName; }

    public String getInformation() { return information; }
    public void setInformation(String newInformation) { this.information = newInformation; }

    public String toString(){
        String characterName = getName() + "\n";
        characterName = characterName + getInformation() + "\n";

        return characterName;
    }
}
