package project;

import java.time.LocalDate;

public class Registration {
  private Owner owner;
  private String plateNumber;
  private String vin;
  private LocalDate issueDate;
  private LocalDate expDate;
  private String make;
  private String model;
  private String modelYear;

  public Registration(Owner owner, String plateNumber, String vin, LocalDate issueDate,
      LocalDate expDate, String make, String model, String modelYear) {
    this.owner = owner;
    this.plateNumber = plateNumber;
    this.vin = vin;
    this.issueDate = issueDate;
    this.expDate = expDate;
    this.make = make;
    this.model = model;
    this.modelYear = modelYear;
  }


  public Owner getOwner() {
    return this.owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
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

  public LocalDate getIssueDate() {
    return this.issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public LocalDate getExpDate() {
    return this.expDate;
  }

  public void setExpDate(LocalDate expDate) {
    this.expDate = expDate;
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
