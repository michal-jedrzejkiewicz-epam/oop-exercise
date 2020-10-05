package engine;

public class Audi {
    private String model;
    private int yearOfManufacture;
    public String countryOfOrigin = "Germany";
    public boolean shouldChangeOil;
    public boolean shouldChangeBreakPads;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
