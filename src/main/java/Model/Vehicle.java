package Model;

public class Vehicle {
    private String vehicleID;
    private String brand;
    private String model;
    private int year;
    private double rentalPrice;

    // Constructor calling setters for validation
    public Vehicle(String vehicleID, String brand, String model, int year, double rentalPrice) {
        setVehicleID(vehicleID);
        setBrand(brand);
        setModel(model);
        setYear(year);
        setRentalPrice(rentalPrice);
    }

    // Getter and Setter for vehicleID
    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        if (vehicleID == null || vehicleID.trim().isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be empty.");
        }
        this.vehicleID = vehicleID;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        this.brand = brand;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty.");
        }
        this.model = model;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year < 1886 || year > currentYear) { // 1886 is considered the birth year of cars
            throw new IllegalArgumentException("Year must be between 1886 and " + currentYear);
        }
        this.year = year;
    }

    // Getter and Setter for rentalPrice
    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        if (rentalPrice < 0) {
            throw new IllegalArgumentException("Rental price cannot be negative.");
        }
        this.rentalPrice = rentalPrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID='" + vehicleID + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", rentalPrice=" + rentalPrice +
                '}';
    }
}
