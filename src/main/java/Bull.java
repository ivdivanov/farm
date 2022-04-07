public class Bull extends Cattle{

    protected Bull(int age) {
        super(age);
        this.sex = 'm';
        this.name = "bull";
    }

    public void butch() {
        if (this.age < 1) {
            Main.logger.trace("produce veal");
        }else {
            Main.logger.trace("produce beef");
        }
        Main.logger.trace("produce cowhide");
    }

    public void produce() {
        Main.logger.trace("prepare for plow");
    }

    public void play() {
        Main.logger.trace("Is playing with the other animals");
    }

    public void identifyProducing(Class farmBuilding) {
        if (isAlive()) {
            if (farmBuilding == Farm.Shed.class) {
                this.produce();
            }else {
                this.play();
            }
        }else {
            Main.logger.error(this.getName() + " is dead");
        }

    }
}
