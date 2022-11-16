public class Main {

        public static void main(String[] args) {
            Carro sportsCar = new CarroSport(new CarroBasico());
            sportsCar.assemble();
            System.out.println("\n*****");

            Carro sportsLuxuryCar = new CarroSport (new CarroLuxo(new CarroBasico()));
            sportsLuxuryCar.assemble();
        }

    }