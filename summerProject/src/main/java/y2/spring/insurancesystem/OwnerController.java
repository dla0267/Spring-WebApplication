package y2.spring.insurancesystem;


import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;
import y2.spring.insurancesystem.models.Owner;
import y2.spring.insurancesystem.models.OwnerRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/owner") // specifies the base URL that the controller will be handling.
public class OwnerController {

  private OwnerRepository ownerRepository;

  public OwnerController(OwnerRepository ownerRepository) {
    this.ownerRepository = ownerRepository;
  }
  @GetMapping("/all")
  public List<Owner> getAllOwners() {
    return ownerRepository.findAll();
  }

  @GetMapping("/{id}")
  public Owner getOwnerById(@PathVariable("id") String id) {
    return this.ownerRepository.findById(id).get();

  }

  @RequestMapping(value = "/{id}", method =  RequestMethod.PUT)
  public void modifyOwnerById(@PathVariable("id") ObjectId id, @Valid @RequestBody Owner owner) {

    ownerRepository.save(owner);
  }

  @PutMapping
  public Owner createOwner(@Valid @RequestBody Owner owner) {
    ownerRepository.save(owner);
    return owner;
  }

  @DeleteMapping
  public void deleteOwner(@PathVariable String id) {
    ownerRepository.delete(ownerRepository.findById(id).get());
  }
}
