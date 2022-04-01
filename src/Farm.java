public class Farm {

    public class Slaughterhouse {

        public Animal entersTheSlaughterHouse(Animal animal) {
            if (animal.getClass() == Chicken.class) {
                System.out.println("chicken meat is produced");
            } else if (animal.getClass() == Pig.class) {
                System.out.println("pork meat is produced as well as some pigskin");
            } else {
                if (animal.getAge() < 1) {
                    System.out.println("veal meat is produced");
                } else {
                    System.out.println("beef and cowhide is produced");
                }
            }
            return animal = null;
        }
    }

    public class Fields {

        public void entersTheFields(Animal animal) {
            System.out.println("The animal is enjoying life!");
        }

    }

    public class Hen {

        public void entersTheHen(Animal animal) {
            if (animal.getClass() == Chicken.class && animal.getSex() == 'f') {
                System.out.println("eggs are produced");
            } else {
                System.out.println("playing with the other animals");
            }
        }

    }

    public class Pigsty {
        public void entersThePigsty(Animal animal) {
            if (animal.getClass() == Pig.class) {
                System.out.println("the animal got a bit fatter");
            } else {
                System.out.println("playing with the other animals");
            }
        }
    }

    public class Shed {
        public void entersTheShed(Animal animal) {
            if (animal.getClass() == Cattle.class) {
                if (animal.getSex() == 'f') {
                    System.out.println("milk was produced");
                } else {
                    System.out.println("preparing for plow");
                }
            } else {
                System.out.println("playing with the other animals");
            }
        }
    }

}
