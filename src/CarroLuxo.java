public class CarroLuxo extends CarroDecorator {
    public CarroLuxo (Carro c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adicionando recursos do carro de Luxo.");
    }
}
