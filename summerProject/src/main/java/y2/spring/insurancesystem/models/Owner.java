package y2.spring.insurancesystem.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Set;

public class Owner extends Person {


    @Id
    public ObjectId _id;

    private DriverLicense license;
    private String phoneNumber;
    private Set<Vehicle> vehicles;


    public Owner(ObjectId _id, String firstName,
                 String lastName, LocalDate dateOfBrith,
                 DriverLicense license, String phoneNumber, Set<Vehicle> vehicles) {
        super(firstName, lastName, dateOfBrith);

        this._id = _id;
        this.license = license;
        this.phoneNumber = phoneNumber;
        this.vehicles = vehicles;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public DriverLicense getLicense() {
        return license;
    }

    public void setLicense(DriverLicense license) {
        this.license = license;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}


