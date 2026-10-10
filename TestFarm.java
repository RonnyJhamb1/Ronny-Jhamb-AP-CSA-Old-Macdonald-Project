public class TestFarm {
    public static void main(String[] args) {

        NamedCow c = new NamedCow("cow", "moo", "Ronny");
        Chick ch = new Chick("chick", "cluck", "cheep");
        Pig p = new Pig("pig", "oink");

        System.out.println("The cow is known as " + c.getName());
        System.out.println(c.getType() + " goes " + c.getSound());
        System.out.println(ch.getType() + " goes " + ch.getSound());
        System.out.println(p.getType() + " goes " + p.getSound());
    }
}