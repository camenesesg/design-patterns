package co.cesarmeneses.dp.creationals.abstractfactory;

import org.junit.Test;

import static co.cesarmeneses.dp.creationals.abstractfactory.Architecture.EMBER;
import static co.cesarmeneses.dp.creationals.abstractfactory.Architecture.ENGINOLA;
import static org.junit.Assert.assertEquals;

public class AbstracFactoryTest {

    @Test
    public void abstracFactoryTestEmberCPU() {
        AbstractFactory factory = AbstractFactory.getFactory(EMBER);
        CPU cpu = factory.createCPU();
        assertEquals(cpu.device(), "EmberCPU");
    }

    @Test
    public void abstracFactoryTestEnginolaCPU() {
        AbstractFactory factory = AbstractFactory.getFactory(ENGINOLA);
        CPU cpu = factory.createCPU();
        assertEquals(cpu.device(), "EnginolaCPU");
    }

    @Test
    public void abstracFactoryTestEmberMMU() {
        AbstractFactory factory = AbstractFactory.getFactory(EMBER);
        MMU mmu = factory.createMMU();
        assertEquals(mmu.device(), "EmberMMU");
    }

    @Test
    public void abstracFactoryTestEnginolaMMU() {
        AbstractFactory factory = AbstractFactory.getFactory(ENGINOLA);
        MMU mmu = factory.createMMU();
        assertEquals(mmu.device(), "EnginolaMMU");
    }
}
