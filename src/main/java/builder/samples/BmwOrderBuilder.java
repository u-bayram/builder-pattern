package builder.samples;

/**
 * @author umut.bayram
 */
public class BmwOrderBuilder extends OrderBuilder {
    public void setModel(Model model) {
        getCar().setModel(model);
    }

    public void setCompany(Company company) {
        getCar().setCompany(company);
    }
}
