public class CarroSport extends CarroDecorator {
    public CarroSport (Carro c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adicionando recursos do carro esportivo.");
    }
}
