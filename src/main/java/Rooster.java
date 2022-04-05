public class Rooster extends Chicken{

    protected Rooster(int age) {
        super(age);
        this.sex = 'm';
        this.name = "rooster";
    }


    public void butch() {
        Main.logger.info("produces chicken meat");
    }

    public void produce() {

    }

    public void play() {
        Main.logger.info("Is playing with the other animals");
    }
}
