package farm.animals;

import farm.Main;

public class Hen extends Chicken{
    public static final String NAME = "hen";

    public Hen(int age) {
        super(age);
        this.sex = 'f';
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void produce() {
        Main.logger.info("produce eggs");
    }
}