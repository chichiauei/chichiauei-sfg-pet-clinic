package guru.springframework.sfgpetclinic.Services;


import guru.springframework.sfgpetclinic.Model.Vet;
import java.util.Set;

public interface VetService {

  Vet findById(Long id);
  Vet save(Vet vet);
  Set<Vet> findAll();

}
