package project;

import java.time.LocalDate;

public class LicenseCard {

  private String licenseNumber;
  private String firstName;
  private String lastName;
  private String sex;
  private LocalDate dateOfBirth;
  private AddressForm address;
  private Double height;
  private LocalDate issueDate;
  private LocalDate expDate;

  public LicenseCard(String licenseNumber, String firstName, String lastName, String sex,
      LocalDate dateOfBirth, AddressForm address, Double height,
      LocalDate issueDate, LocalDate expDate) {
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

  public String getLicenseNumber() {
    return this.licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSex() {
    return this.sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public AddressForm getAddress() {
    return this.address;
  }

  public void setAddress(AddressForm address) {
    this.address = address;
  }

  public Double getHeight() {
    return this.height;
  }

  public void setHeight(Double height) {
    this.height = height;
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
}
