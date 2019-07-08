package y2.spring.insurancesystem.models;

import java.util.Collection;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Vehicles")
public class Vehicle {

  @Id
  private String id;
  private String plateNumber;
  private String vin;
  private VehicleType type;
  private String make;
  private String model;
  private String modelYear;


  public Vehicle() {

  }
  public Vehicle(String plateNumber, String vin, VehicleType type, String make,
      String model, String modelYear) {
    this.plateNumber = plateNumber;
    this.vin = vin;
    this.type = type;
    this.make = make;
    this.model = model;
    this.modelYear = modelYear;
  }

  public String getId() {
    return this.id;
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

  public VehicleType getType() {
    return type;
  }

  public void setType(VehicleType type) {
    this.type = type;
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
