package engine;

public class Renault {
    private String model;
    private String countryOfOrigin = "France";
    public int yearOfManufacture;
    public boolean shouldChangeOil;
    public boolean shouldChangeBreakPads;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

}
