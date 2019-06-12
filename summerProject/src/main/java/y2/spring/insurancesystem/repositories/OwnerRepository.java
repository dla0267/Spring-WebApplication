package y2.spring.insurancesystem.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import y2.spring.insurancesystem.models.Owner;


public interface OwnerRepository extends MongoRepository<Owner, String> {
  Owner findBy_id(ObjectId _id);
}
