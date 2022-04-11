package farm.animals;

import farm.Main;

public class Bull extends Cattle {

    public static final String NAME = "bull";

    public Bull(int age) {
        super(age);
        this.sex = 'm';
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void produce() {
        Main.logger.info("prepare for plow");
    }

    public void butch() {

    }
}