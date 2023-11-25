package com.example.DMS.repository;
/*
 * @ Aparna Marepally
 */
import java.util.List;

/*
 * @ Aparna Marepally
 */
import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	List<Dog> findByName(String name);

}
