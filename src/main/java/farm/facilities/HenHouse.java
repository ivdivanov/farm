package farm.facilities;

import farm.animals.Hen;

public class HenHouse extends Facility {
    private static final String NAME = "Hen House";

    public HenHouse() {
        super();
        homeAnimals.add(Hen.NAME);
    }

    @Override
    public String getName() {
        return NAME;
    }
}