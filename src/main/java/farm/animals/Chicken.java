package farm.animals;

import farm.Coat;
import farm.Main;
import farm.Size;

public abstract class Chicken extends Animal {

    protected Chicken(int age) {
        super(age);
        this.Coat = farm.Coat.FEATHERS;
        this.Size = farm.Size.SMALL;
        this.TypeOfMovement = farm.TypeOfMovement.BIPEDAL;
    }

    @Override
    public void butch() {
        Main.logger.info("produces chicken meat");
    }
}