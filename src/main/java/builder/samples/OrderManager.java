package builder.samples;

/**
 * @author umut.bayram
 */
public class OrderManager {
    private OrderBuilder orderBuilder;

    public Car createOrder(String company, String model) {
        if (company.equals("Bmw")) {
            orderBuilder = new BmwOrderBuilder();
        } else if (company.equals("Wolswagen")) {
            orderBuilder = new WolswagenOrderBuilder();
        } else {
            throw new RuntimeException("Car company is not found");
        }
        orderBuilder.setCompany(new Company(company));
        orderBuilder.setModel(new Model(model));
        return orderBuilder.getCar();
    }

    public void printOrder() {
        System.out.println(orderBuilder.getCar().toString());
    }
}
