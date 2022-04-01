public abstract class Animal {

    protected String typeOfMovement;
    protected String coat;
    protected String size;
    protected int age;
    protected char sex;
    protected String name;

    protected Animal(int age,char sex) {
        this.age = age;
        this.sex = sex;

    }
    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

}
