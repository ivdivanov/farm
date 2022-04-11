package farm.facilities;

import farm.Main;
import farm.animals.Animal;

import java.util.HashSet;
import java.util.Set;

public abstract class Facility {
    protected Set<String> homeAnimals;

    public Facility() {
        homeAnimals = new HashSet<>();
    }

    public abstract String getName();

    public void enterFacility(Animal animal) {
        if (animal.isAlive()) {
            if (homeAnimals.contains(animal.getName())) {
                animal.produce();
            } else {
                animal.play();
            }
        }else {
            Main.logger.info("The animal is dead");
        }
    }
}