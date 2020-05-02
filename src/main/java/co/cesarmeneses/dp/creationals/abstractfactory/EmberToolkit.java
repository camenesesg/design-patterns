package co.cesarmeneses.dp.creationals.abstractfactory;

public class EmberToolkit extends AbstractFactory {

    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
