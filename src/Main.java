public class Main {

    public static void main(String[] args) {
        Cattle milka = new Cattle(3,'f');
        Cattle milko = new Cattle(1,'m');

        Farm farm = new Farm();
        Farm.Slaughterhouse slaughterhouse = farm.new Slaughterhouse();
        Farm.Shed shed = farm.new Shed();
        Farm.Hen hen = farm.new Hen();


        slaughterhouse.entersTheSlaughterHouse(milko);
        shed.entersTheShed(milko);

        Chicken pilcka = new Chicken(3,'f');
        Chicken pilcho = new Chicken(1,'m');

        shed.entersTheShed(pilcka);
        shed.entersTheShed(pilcho);
        hen.entersTheHen(pilcka);
        hen.entersTheHen(pilcho);
    }
}
