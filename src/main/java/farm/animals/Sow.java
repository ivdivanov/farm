package farm.animals;

import farm.Main;

public class Sow extends Pig{

    public static final String NAME = "sow";

    public Sow(int age) {
        super(age);
        this.sex = 'f';
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void butch() {
        Main.logger.warn("produce pork and pigskin");
    }

    public void produce() {
        Main.logger.warn("got fatter");
    }
}