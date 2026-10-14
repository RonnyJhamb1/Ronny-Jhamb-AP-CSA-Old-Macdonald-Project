//Chick class that extends to animal

public class Chick implements Animal {




//creates atributes 
    private String type;

    private String sound;
    private String sound2;




//Constructor for first sound Cluck
    public Chick(String type, String sound) {
        this.type = type;
        this.sound = sound;
        this.sound2 = sound;


    }

   //Construcotr for second sound cheep 
    public Chick(String type, String sound, String sound2) {
        this.type = type;
        this.sound = sound;
        this.sound2 = sound2;
   
   
    }


//Overrided method from animal interface to return either cheep or cluck
    public String getSound() {
       
       
       
        if (Math.random() < 0.5) {
            return sound;
        }
        return sound2;
    }
//method from animal interface to return type
    public String getType() {
        return type;
    }

}