package project;

public class AddressForm {
  private String address;
  private String city;
  private String state;
  private String country;
  private Integer zipCode;

  public AddressForm(String address, String city, String state, String country, Integer zipCode) {
    this.address = address;
    this.city = city;
    this.state = state;
    this.country = country;
    this.zipCode = zipCode;
  }


  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Integer getZipCode() {
    return this.zipCode;
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }
}
