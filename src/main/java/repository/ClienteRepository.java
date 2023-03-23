package repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Id>{

	Optional<Cliente> findById(Long id);

	public void deleteById(Long id);

}
