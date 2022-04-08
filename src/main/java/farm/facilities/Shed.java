package farm.facilities;

import farm.animals.Animal;
import farm.animals.Boar;
import farm.animals.Bull;
import farm.animals.Cow;

public class Shed extends Facility {
    private static final String NAME = "Shed";

    public Shed() {
        super();
        homeAnimals.add(Cow.NAME);
        homeAnimals.add(Bull.NAME);
    }

    @Override
    public String getName() {
        return NAME;
    }
}

//    public void entersTheShed(Animal animal) {
//        if (animal.isAlive() == false) {
//            Main.logger.error("the animal is dead and can't perform actions");
//        } else {
//            if (animal.getClass() == Cow.class || animal.getClass() == Bull.class) {
//                animal.produce();
//            } else {
//                animal.play();
//            }
//        }
//    }
