package farm.animals;

import farm.Coat;
import farm.Size;

public abstract class Pig extends Animal {

    protected Pig(int age) {
        super(age);
        this.Coat = farm.Coat.NO_COAT;
        this.Size = farm.Size.MEDIUM;
        this.TypeOfMovement = farm.TypeOfMovement.QUADRUPEDAL;
    }
}