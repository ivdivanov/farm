public class Pig extends Animal {

    protected Pig(int age, char sex) {
        super(age, sex);
        if (sex =='m') {
            this.name = "boar";
        }else {
            this.name = "sow";
        }
        this.coat = "no coat";
        this.size = "medium";
        this.typeOfMovement = "quadrupedal";

        System.out.println("A new " + this.name + " is born!");
    }

}
