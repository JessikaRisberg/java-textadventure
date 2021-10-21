public class Character {

    private String name;
    private String information;

    public Character(String inName, String inInformation) {
        name = inName;
        information = inInformation;
    }

    public String getName() { return name; }

    public String getInformation() { return information; }

    @Override
    public String toString(){
        String characterName = name;
        characterName = getName() + "\n";
        characterName = characterName + information + "\n";

        return characterName;
    }
}
