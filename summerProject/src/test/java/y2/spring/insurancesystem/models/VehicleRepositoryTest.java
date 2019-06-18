package y2.spring.insurancesystem.models;

import static org.junit.Assert.*;

import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataMongoTest
public class VehicleRepositoryTest {

  @Autowired
  VehicleRepository vehicleRepository;

  @Test
  public void findByPlate() {
    Vehicle test = new Vehicle();
    test.setPlateNumber("axx6041");
    test.setType(VehicleType.CAR);

    vehicleRepository.save(test);
    Optional<Vehicle> byId = vehicleRepository.findById(test.getId());
    Assert.assertNotEquals(null, byId);
    Vehicle byPlateNumber = vehicleRepository.findByPlateNumber(test.getPlateNumber());
    Assert.assertEquals("axx6041", byPlateNumber.getPlateNumber());
  }

}