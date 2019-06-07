package project;

public class Vehicle {

  // can't decide if i should include registration here or not.
  //private Registration registration;
  private String plateNumber;
  private String vin;
  private VehicleType type;
  private String make;
  private String model;
  private String modelYear;

  public Vehicle(String plateNumber, String vin, VehicleType type,
      String make, String model, String modelYear) {
    this.plateNumber = plateNumber;
    this.vin = vin;
    this.type = type;
    this.make = make;
    this.model = model;
    this.modelYear = modelYear;
  }

  public String getPlateNumber() {
    return this.plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public String getVin() {
    return this.vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public VehicleType getType() {
    return this.type;
  }

  public void setType(VehicleType type) {
    this.type = type;
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModelYear() {
    return this.modelYear;
  }

  public void setModelYear(String modelYear) {
    this.modelYear = modelYear;
  }
}
