package farm.facilities;

import farm.animals.Animal;
import farm.animals.Boar;
import farm.animals.Hen;
import farm.animals.Sow;

import java.util.HashSet;
import java.util.Set;

public class Pigsty extends Facility {

    private static final String NAME = "Pigsty";

    public Pigsty() {
        super();
        homeAnimals.add(Boar.NAME);
        homeAnimals.add(Sow.NAME);
    }

    @Override
    public String getName() {
        return NAME;
    }

//    public void entersThePigsty(Animal animal) {
//        if (animal.isAlive() == false) {
//            Main.logger.error("the animal is dead and can't perform actions");
//        } else {
//            if (animal.getClass() == Sow.class || animal.getClass() == Boar.class) {
//                animal.produce();
//            } else {
//                animal.play();
//            }
//        }
//    }
}
