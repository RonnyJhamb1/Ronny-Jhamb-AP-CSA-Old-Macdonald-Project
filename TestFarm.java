//Class that tests the farm after all classes are created


public class TestFarm {
    public static void main(String[] args) {
//Assigns objects with arguemnts 
        NamedCow c = new NamedCow("cow", "moo", "Ronny");
        Chick ch = new Chick("chick", "cluck", "cheep");
        Pig p = new Pig("pig", "oink");
//Calls each animals objects and prints the result
        System.out.println("The cow is known as " + c.getName());
        System.out.println(c.getType() + " goes " + c.getSound());
        System.out.println(ch.getType() + " goes " + ch.getSound());
        System.out.println(p.getType() + " goes " + p.getSound());
    }
}