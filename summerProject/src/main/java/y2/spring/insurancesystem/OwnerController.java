package y2.spring.insurancesystem;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import y2.spring.insurancesystem.models.Owner;
import y2.spring.insurancesystem.repositories.OwnerRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/owner") // specifies the base URL that the controller will be handling.
public class OwnerController {

  @Autowired
  private OwnerRepository ownerRepository;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public List<Owner> getAllOwners() {
    return ownerRepository.findAll();
  }

  @RequestMapping(value = "/{id}", method =  RequestMethod.GET)
  public Owner getOwnerById(@PathVariable("id") ObjectId id) {
    return ownerRepository.findBy_id(id);
  }

  @RequestMapping(value = "/{id}", method =  RequestMethod.PUT)
  public void modifyOwnerById(@PathVariable("id") ObjectId id, @Valid @RequestBody Owner owner) {
    owner.set_id(id);
    ownerRepository.save(owner);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.POST)
  public Owner createOwner(@Valid @RequestBody Owner owner) {
    owner.set_id((ObjectId.get()));
    ownerRepository.save(owner);
    return owner;
  }

  @RequestMapping(value = "/{id", method = RequestMethod.DELETE)
  public void deleteOwner(@PathVariable ObjectId id) {
    ownerRepository.delete(ownerRepository.findBy_id(id));
  }
}
