package core;

public class Main {
    public static void main(String[] args) {
        Unit unOne = new Unit("red",1);
        Unit unTwo = new Unit("blue",2,200,15,0);
        Mage mgOne = new Mage("blue",1);
        Mage mgTwo = new Mage("red",2,125,40,150);


        for (int i = 0; i < 10; i++) {
            unOne.kickUnit(mgOne);
            mgOne.kickUnit(unOne);
            unTwo.kickUnit(mgTwo);
            mgTwo.kickUnit(unTwo);
        }
    }
}
