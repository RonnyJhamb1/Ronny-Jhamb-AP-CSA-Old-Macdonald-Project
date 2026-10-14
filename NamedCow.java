//Named cow class that gives a name to the cow




public class NamedCow extends Cow {




 private String name;




//Constructor that uses parameters to get the cows type sound and name

public NamedCow(String type, String sound, String name) {
        super(type, sound);
        this.name = name;
    }





    //Method that returns the cows name and called in farm class
public String getName() {
        return name;
    }
}