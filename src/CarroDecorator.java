public class CarroDecorator implements Carro {
    protected Carro car;

    public CarroDecorator (Carro c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

    @Override
    public void montar() {

    }

}
