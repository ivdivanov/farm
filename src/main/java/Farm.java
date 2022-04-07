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

        public void entersTheHenHouse(Animal animal) {
            animal.identifyProducing(this.getClass());
        }

    }

    public class Pigsty {

        public void entersThePigsty(Animal animal) {
            animal.identifyProducing(this.getClass());
        }

    }

    public class Shed {
        public void entersTheShed(Animal animal) {
            animal.identifyProducing(this.getClass());
        }
    }




}
