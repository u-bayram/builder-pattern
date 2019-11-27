package builder;

import builder.samples.*;

/**
 * @author umut.bayram
 */
public class Builder {

    public static void main(String args[]) {

        OrderManager orderManager = new OrderManager();
        orderManager.createOrder("Wolswagen", "Polo");
        orderManager.printOrder();

        orderManager = new OrderManager();
        orderManager.createOrder("Bmw", "116d");
        orderManager.printOrder();

        Car car = OrderFluentBuilder.startBuild().withCompany(new Company("Bmw")).withModel(new Model("116d")).build();
        System.out.println(car.toString());

        car = OrderFluentBuilder.startBuild().withCompany(new Company("Wolswagen")).withModel(new Model("Polo")).build();
        System.out.println(car.toString());
    }

}
