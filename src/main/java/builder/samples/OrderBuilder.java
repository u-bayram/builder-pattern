package builder.samples;

/**
 * @author umut.bayram
 */
public abstract class OrderBuilder {

    private Car car;

    public OrderBuilder() {
    }

    public Car getCar() {
        if (this.car == null)
            this.car = new Car();
        return this.car;
    }

    public abstract void setModel(Model model);

    public abstract void setCompany(Company company);
}
