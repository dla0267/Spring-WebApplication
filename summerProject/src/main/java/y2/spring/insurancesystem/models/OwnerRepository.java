package y2.spring.insurancesystem.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends MongoRepository<Owner, String> {

  Owner findByPhoneNumber(String phoneNumber);

}
