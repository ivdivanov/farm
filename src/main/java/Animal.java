public abstract class Animal implements IButcherable, IProduceable, IPlayable{

    protected String typeOfMovement;
    protected String coat;
    protected String size;
    protected int age;
    protected char sex;
    protected String name;
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

    public String getName() {
        return name;
    }
}
