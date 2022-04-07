public class Cow extends Cattle implements IButcherable {

    protected Cow(int age) {
        super(age);
        this.sex = 'f';
        this.name = "cow";
    }


    public void butch() {
        if (this.age < 1) {
            Main.logger.info("produce veal");
        }else {
            Main.logger.info("produce beef");
        }
        Main.logger.info("produce cowhide");
    }

    public void produce() {
        Main.logger.info("produce milk");
    }

    public void play() {
        Main.logger.info("Is playing with the other animals");
    }

    public void identifyProducing(Class farmBuilding) {
        if (isAlive()) {
            if (farmBuilding == Farm.Shed.class) {
                this.produce();
            } else {
                this.play();
            }
        } else {
            Main.logger.error(this.getName() + " is dead");
        }
    }
}
