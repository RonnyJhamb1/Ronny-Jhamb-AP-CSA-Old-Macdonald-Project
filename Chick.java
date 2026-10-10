public class Chick implements Animal {





    private String type;

    private String sound;
    private String sound2;





    public Chick(String type, String sound) {
        this.type = type;
        this.sound = sound;
        this.sound2 = sound;


    }

   
    public Chick(String type, String sound, String sound2) {
        this.type = type;
        this.sound = sound;
        this.sound2 = sound2;
   
   
    }



    public String getSound() {
       
       
       
        if (Math.random() < 0.5) {
            return sound;
        }
        return sound2;
    }

    public String getType() {
        return type;
    }

}