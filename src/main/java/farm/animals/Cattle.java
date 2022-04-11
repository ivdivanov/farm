package farm.animals;

import farm.Coat;
import farm.Main;
import farm.Size;

public abstract class Cattle extends Animal {
    protected Cattle(int age) {
        super(age);
        this.Coat = farm.Coat.HAIR;
        this.Size = farm.Size.LARGE;
        this.TypeOfMovement = farm.TypeOfMovement.QUADRUPEDAL;
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