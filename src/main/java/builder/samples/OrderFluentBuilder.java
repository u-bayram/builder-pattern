package builder.samples;

/**
 * @author umut.bayram
 */
public class OrderFluentBuilder {
    private Company company;
    private Model model;

    private OrderFluentBuilder() {

    }

    public static OrderFluentBuilder startBuild() {
        return new OrderFluentBuilder();
    }

    public OrderFluentBuilder withCompany(Company company) {
        this.company = company;
        return this;
    }

    public OrderFluentBuilder withModel(Model model) {
        this.model = model;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setCompany(this.company);
        car.setModel(this.model);
        return car;
    }


}
