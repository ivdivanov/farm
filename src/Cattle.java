public class Cattle extends Animal {

    protected Cattle(int age, char sex) {
        super(age, sex);
        if (sex =='m') {
            this.name = "bull";
        }else {
            this.name = "cow";
        }
        this.coat = "hair";
        this.size = "large";
        this.typeOfMovement = "quadrupedal";

        System.out.println("A new " + this.name + " is born!");
    }
}
