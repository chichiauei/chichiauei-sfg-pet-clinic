package guru.springframework.sfgpetclinic.Services;


import guru.springframework.sfgpetclinic.Model.Pet;
import java.util.Set;

public interface PetService {

  Pet findById(Long id);
  Pet save(Pet pet);
  Set<Pet> findAll();

}
