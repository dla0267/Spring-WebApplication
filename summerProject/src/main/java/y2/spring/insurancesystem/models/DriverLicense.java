package y2.spring.insurancesystem.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class DriverLicense {

  @Id
  private ObjectId _id;

  private String licenseNumber;
  private String firstName;
  private String lastName;
  private String sex;
  private LocalDate dateOfBirth;
  private AddressForm address;
  private Double height;
  private LocalDate issueDate;
  private LocalDate expDate;

  public DriverLicense(ObjectId _id, String licenseNumber, String firstName,
                       String lastName, String sex, LocalDate dateOfBirth,
                       AddressForm address, Double height, LocalDate issueDate, LocalDate expDate) {
    this._id = _id;
    this.licenseNumber = licenseNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.sex = sex;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.height = height;
    this.issueDate = issueDate;
    this.expDate = expDate;
  }

  public String get_id() {
    return _id.toHexString();
  }

  public void set_id(ObjectId _id) {
    this._id = _id;
  }

  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public AddressForm getAddress() {
    return address;
  }

  public void setAddress(AddressForm address) {
    this.address = address;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
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
}
