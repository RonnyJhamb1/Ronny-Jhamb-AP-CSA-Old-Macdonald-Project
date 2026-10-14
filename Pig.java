//Pig class that extends to animal

public class Pig implements Animal {


//Attributes of pig
    private String type;
    private String sound;

//Constructor for sound of pig
    public Pig(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }
//Overrided methods from animal interface that return the sound of the pig
//and type of the pig
    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

}