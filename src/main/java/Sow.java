import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sow extends Pig{

    protected Sow(int age) {
        super(age);
        this.sex = 'f';
        this.name = "sow";
    }

    public void butch() {
        Main.logger.warn("produce pork and pigskin");
    }

    public void produce() {
        Main.logger.warn("got fatter");
    }

    public void play() {
        Main.logger.warn("Is playing with the other animals");
    }

    public void identifyProducing(Class farmBuilding) {
        if (isAlive()) {
            if (farmBuilding == Farm.Pigsty.class) {
                this.produce();
            }else {
                this.play();
            }
        }else {
            Main.logger.error(this.getName() + " is dead");
        }
    }
}
