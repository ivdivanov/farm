package farm.animals;

import farm.IButcherable;
import farm.Main;

public class Cow extends Cattle implements IButcherable {

    public static final String NAME = "cow";

    public Cow(int age) {
        super(age);
        this.sex = 'f';
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void produce() {
        Main.logger.info("produce milk");
    }
}