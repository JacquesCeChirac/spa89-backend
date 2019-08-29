package com.nicolascherridi.spa89backend.repository;

import com.nicolascherridi.spa89backend.jpa.Animal;
import org.hibernate.annotations.Where;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnimalRepository extends CrudRepository <Animal, Long>{
    List<Animal> findBySpecies(@Param("species") String species);
    Animal findById(@Param("id") short id);
    Animal findByName(@Param("name") String name);
    void delete(Animal animal);
}
