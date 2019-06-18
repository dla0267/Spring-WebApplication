package y2.spring.insurancesystem.models;


import java.util.HashSet;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Set;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Owners")
public class Owner extends Person {


    @Id
    public String id;

    private DriverLicense license;
    private String phoneNumber;
    private Set<Vehicle> vehicles;


    public Owner(String firstName,
                 String lastName, LocalDate dateOfBrith,
                 DriverLicense license, String phoneNumber, HashSet<Vehicle> vehicles) {
        super(firstName, lastName, dateOfBrith);

        this.license = license;
        this.phoneNumber = phoneNumber;
        this.vehicles = vehicles;
    }

    public Owner(String firstName,
        String lastName, LocalDate dateOfBrith,
        DriverLicense license, String phoneNumber) {
        super(firstName, lastName, dateOfBrith);

        this.license = license;
        this.phoneNumber = phoneNumber;
        this.vehicles = new HashSet<>();
    }

    public String getId() {
        return this.id;
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


