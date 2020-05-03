package co.cesarmeneses.dp.creationals;

import co.cesarmeneses.dp.creationals.factorymethod2.Computer;
import co.cesarmeneses.dp.creationals.factorymethod2.ComputerFactory;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMethod2 {

    @Test
    public void factoryMethodTest() {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        Assert.assertEquals(pc.toString(), "RAM=2 GB, HDD=500 GB, CPU=2.4 GHz");
    }
}
