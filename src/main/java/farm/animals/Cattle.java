package farm.animals;

import farm.Main;

public abstract class Cattle extends Animal {
    protected Cattle(int age) {
        super(age);
        this.coat = "hair";
        this.size = "large";
        this.typeOfMovement = "quadrupedal";
    }

    @Override
    public void butch() {
        if (this.age < 1) {
            Main.logger.info("produce veal");
        }else {
            Main.logger.info("produce beef");
        }
        Main.logger.info("produce cowhide");
    }
}
