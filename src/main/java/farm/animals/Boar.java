package farm.animals;

import farm.Main;

public class Boar extends Pig {

    public static final String NAME = "boar";

    public Boar(int age) {
        super(age);
        this.sex = 'm';
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void butch() {
        Main.logger.debug("produce pork and pigskin");
    }

    public void produce() {
        Main.logger.debug("got fatter");
    }
}
