package y2.spring.insurancesystem.models;

import java.util.List;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

  private VehicleRepository vehicleRepository;

  public VehicleController(VehicleRepository vehicleRepository) {
    this.vehicleRepository = vehicleRepository;
  }

  @GetMapping("/all")
  public List<Vehicle> getAllVehicles() {
    return vehicleRepository.findAll();
  }

  @GetMapping("/{id}")
  public Vehicle getOwnerById(@PathVariable("id") String id) {
    return vehicleRepository.findById(id).get();

  }

  @RequestMapping(value = "/{id}", method =  RequestMethod.PUT)
  public void modifyVehicleById(@PathVariable("id") ObjectId id, @Valid @RequestBody Vehicle vehicle) {

    vehicleRepository.save(vehicle);
  }

  @PutMapping
  public Vehicle createVehicle(@Valid @RequestBody Vehicle vehicle) {
    vehicleRepository.save(vehicle);
    return vehicle;
  }

  @DeleteMapping
  public void deleteVehicle(@PathVariable String id) {
    vehicleRepository.delete(vehicleRepository.findById(id).get());
  }

}
