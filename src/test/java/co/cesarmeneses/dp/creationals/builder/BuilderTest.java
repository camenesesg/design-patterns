package co.cesarmeneses.dp.creationals.builder;

import org.junit.Test;

public class BuilderTest {

    @Test
    public void pizzaTest() {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        // PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzabuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

    }
}
