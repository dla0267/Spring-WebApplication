package y2.spring.insurancesystem.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {

  Vehicle findByPlateNumber(String plateNumber);

}
