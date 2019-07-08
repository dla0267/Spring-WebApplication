package y2.spring.insurancesystem.models;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;


@Component
public class OwnerDBSeeder implements CommandLineRunner{

  private OwnerRepository ownerRepository;

  public OwnerDBSeeder(OwnerRepository ownerRepository) {
    this.ownerRepository = ownerRepository;
  }

  @Override
  public void run(String... strings) throws Exception {


    Owner jenny = new Owner(
        "Jenny",
        "Lee",
        LocalDate.of(1994, 9, 26),
        new DriverLicense("YJ123", "Jenny", "Lee",
            "female", LocalDate.of(1994, 9, 26),
            new AddressForm("4115 Roosevelt Way NE", "Seattle", "WA",
                "USA", 98105),
            168.0,
            LocalDate.of(2015, 10, 11),
            LocalDate.of(2020, 10, 15)),
        "4258290509", new HashSet<>());

    Owner eddy = new Owner(
        "Eddy",
        "Chung",
        LocalDate.of(1995, 6, 26),
        new DriverLicense("DH123", "Eddy", "Chung",
            "male", LocalDate.of(1995, 6, 26),
            new AddressForm("4115 Roosevelt Way NE", "Seattle", "WA",
                "USA", 98105),
            180.0,
            LocalDate.of(2015, 10, 11),
            LocalDate.of(2020, 10, 15)),
        "4258290509", new HashSet<>());

    this.ownerRepository.deleteAll();

    this.ownerRepository.save(jenny);
    this.ownerRepository.save(eddy);
  }
}
