public class Hen extends Chicken{

    protected Hen(int age) {
        super(age);
        this.sex = 'f';
        this.name = "hen";
    }


    public void butch() {
        Main.logger.info("produce chicken meat");
    }

    public void produce() {
        Main.logger.info("produce eggs");
    }

    public void play() {
        Main.logger.info("Is playing with the other animals");
    }
}
