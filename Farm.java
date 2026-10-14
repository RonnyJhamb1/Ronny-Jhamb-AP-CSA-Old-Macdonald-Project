//Array given by Mrs Ramsey-Rudledge 


public class Farm {
    private Animal [] a = new Animal [3];
    Farm () {
        a [0] = new NamedCow ("cow","moo","Ronny") ;
        a [1] = new Chick ("chick","cheep","cluck") ;
        a [2] = new Pig ("pig","oink") ;
        System . out . println ("The cow is known as " +(( NamedCow ) a [0]) . getName () ) ;
    }
    public void animalSounds () {
        for (int i = 0; i < a . length ; i ++) {
            System . out . println ( a [ i ]. getType () + " goes " + a [ i ]. getSound () ) ;
        }
    }
}