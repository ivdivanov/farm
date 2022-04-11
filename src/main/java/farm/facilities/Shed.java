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