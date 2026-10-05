public class Farm {
    private Animal [] a = new Animal [3];
 Farm () {
 a [0] = new Cow () ;
 a [1] = new Chick () ;
 a [2] = new Pig () ;
 }
 public void animalSounds () {
 for (int i = 0; i < a . length ; i ++) {
 System . out . println ( a [ i ]. getType () + " goes " + a [ i ]. getSound () ) ;
 }
 }
}





