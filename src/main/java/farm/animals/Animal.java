package farm.animals;

import farm.IButcherable;
import farm.IPlayable;
import farm.IProduceable;
import farm.Main;

public abstract class Animal implements IButcherable, IProduceable, IPlayable {

    protected String typeOfMovement;
    protected String coat;
    protected String size;
    protected int age;
    protected char sex;
    protected boolean isAlive;

    protected Animal(int age) {
        this.age = age;
        this.isAlive = true;

    }
    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public abstract String getName();

    @Override
    public void play() {
        Main.logger.info("Is playing with the other animals");
    }
}
