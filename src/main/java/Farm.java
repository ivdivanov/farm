import java.util.ArrayList;

public class Farm {

    public class Slaughterhouse {

        public void entersTheSlaughterHouse(Animal animal) {
            if (animal.isAlive()) {
                animal.butch();
                animal.setAlive(false);
            }else {
                Main.logger.error("The animal was butchered once already");
            }
        }
    }

    public class Fields {

        public void entersTheFields(Animal animal) {
            Main.logger.warn("The animal is enjoying life!");
        }

    }

    public class HenHouse {

        public void entersTheHen(Animal animal) {
            if (animal.getClass() == Hen.class) {
                animal.produce();
            } else {
                animal.play();
            }

        }

    }

    public class Pigsty {
        public void entersThePigsty(Animal animal) {
            if (animal.isAlive() == false) {
                Main.logger.error("the animal is dead and can't perform actions");
            } else {
                if (animal.getClass() == Sow.class || animal.getClass() == Boar.class) {
                    animal.produce();
                } else {
                    animal.play();
                }
            }
        }
    }

    public class Shed {
        public void entersTheShed(Animal animal) {
            if (animal.isAlive() == false) {
                Main.logger.error("the animal is dead and can't perform actions");
            } else {
                if (animal.getClass() == Cow.class || animal.getClass() == Bull.class) {
                    animal.produce();
                } else {
                    animal.play();
                }
            }
        }
    }

}
