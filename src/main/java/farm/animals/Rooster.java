package farm.animals;

import farm.Main;

public class Rooster extends Chicken {

    public static final String NAME = "rooster";

    public Rooster(int age) {
        super(age);
        this.sex = 'm';
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void produce() {

    }
}