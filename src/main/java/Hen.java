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

    public void identifyProducing(Class farmBuilding) {
        if (isAlive()) {
            if (farmBuilding == Farm.HenHouse.class) {
                this.produce();
            }else {
                this.play();
            }
        }else {
            Main.logger.error(this.getName() + " is dead");
        }
    }
}
