package co.cesarmeneses.examples.designpatterns.abstractfactory;

public class EnginolaToolkit extends AbstractFactory {

    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
}
