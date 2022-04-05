public class Boar extends Pig{

    protected Boar(int age) {
        super(age);
        this.sex = 'm';
        this.name = "boar";
    }

    public void butch() {
        Main.logger.debug("produce pork and pigskin");
    }

    public void produce() {
        Main.logger.debug("got fatter");
    }

    public void play() {
        Main.logger.debug("Is playing with the other animals");
    }
}
