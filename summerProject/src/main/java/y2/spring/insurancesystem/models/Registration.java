package y2.spring.insurancesystem.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Registration {

  @Id
  private ObjectId _id;

  private Owner owner;
  private String plateNumber;
  private String vin;
  private LocalDate issueDate;
  private LocalDate expDate;
  private String make;
  private String model;
  private String modelYear;

  public Registration(ObjectId _id, Owner owner, String plateNumber,
                      String vin, LocalDate issueDate, LocalDate expDate,
                      String make, String model, String modelYear) {
    this._id = _id;
    this.owner = owner;
    this.plateNumber = plateNumber;
    this.vin = vin;
    this.issueDate = issueDate;
    this.expDate = expDate;
    this.make = make;
    this.model = model;
    this.modelYear = modelYear;
  }

  public String get_id() {
    return _id.toHexString();
  }

  public void set_id(ObjectId _id) {
    this._id = _id;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public LocalDate getExpDate() {
    return expDate;
  }

  public void setExpDate(LocalDate expDate) {
    this.expDate = expDate;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModelYear() {
    return modelYear;
  }

  public void setModelYear(String modelYear) {
    this.modelYear = modelYear;
  }
}
