public class Chicken extends Animal{

    protected Chicken(int age, char sex) {
        super(age, sex);
        if (sex =='m') {
            this.name = "rooster";
        }else {
            this.name = "hen";
        }
        this.coat = "feathers";
        this.size = "small";
        this.typeOfMovement = "bipedal";

        System.out.println("A new " + this.name + " is born!");
    }
}
