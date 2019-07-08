package y2.spring.insurancesystem.models;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class VehicleDBSeeder implements CommandLineRunner {

  private VehicleRepository vehicleRepository;

  public VehicleDBSeeder(VehicleRepository vehicleRepository) {
    this.vehicleRepository = vehicleRepository;
  }

  @Override
  public void run(String... strings) throws Exception {

    Vehicle car1 = new Vehicle(
        "AXX6041", "abcdefg", VehicleType.CAR,
        "Nissan", "Altima", "2015"
    );

    Vehicle car2 = new Vehicle(
        "ABC402", "hijkelmnop", VehicleType.BUS,
        "busMade", "bigBus", "2015");

    this.vehicleRepository.deleteAll();
    this.vehicleRepository.save(car1);
    this.vehicleRepository.save(car2);
  }


}
