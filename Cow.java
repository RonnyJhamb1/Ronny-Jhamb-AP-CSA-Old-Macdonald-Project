//Cow class that extends to animal


public class Cow implements Animal {


//Attributes of cow
    private String type;
    private String sound;
//Constructor for sound of cow
    public Cow(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }
//Overrided methods from animal interface that return the sound of the cow
//and type of the cow
    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

}