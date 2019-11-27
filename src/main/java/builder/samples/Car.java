package builder.samples;

/**
 * @author umut.bayram
 */
public class Car {
    private Company company;
    private Model model;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company=" + company.getName() +
                ", model=" + model.getName() +
                '}';
    }
}
