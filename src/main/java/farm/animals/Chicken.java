package farm.animals;

import farm.Main;

public abstract class Chicken extends Animal {

    protected Chicken(int age) {
        super(age);
        this.coat = "feathers";
        this.size = "small";
        this.typeOfMovement = "bipedal";
    }

    @Override
    public void butch() {
        Main.logger.info("produces chicken meat");
    }
}
