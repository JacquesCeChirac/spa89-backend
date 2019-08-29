package com.nicolascherridi.spa89backend.controller;

import com.nicolascherridi.spa89backend.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.nicolascherridi.spa89backend.jpa.Animal;

import java.io.IOException;
import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @RequestMapping(path = "/animal", method = RequestMethod.GET)
    public @ResponseBody
    List<Animal> findAnimals() throws IOException {
        List<Animal> animals = animalRepository.findBySpecies("chat");
        return animals;
    }

    @RequestMapping(path = "/animal/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Animal findAnimalById(@PathVariable("id") short id) throws IOException {
        return animalRepository.findById(id);
    }

    @RequestMapping(path = "/species/{species}", method = RequestMethod.GET)
    public @ResponseBody
    List<Animal> findAnimalBySpecies(@PathVariable("species") String species) throws IOException {
        return animalRepository.findBySpecies(species);
    }

    @RequestMapping(path = "/animal/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    String deleteAnimal(@PathVariable("id") short id) throws IOException {
        Animal animal = animalRepository.findById(id);
        animalRepository.delete(animal);
        return "Animal supprimé";
    }

    @RequestMapping(path = "/animal/{name}", method = RequestMethod.GET)
    public @ResponseBody
    Animal findAnimalByName(@PathVariable("name") String name) throws IOException {
        return animalRepository.findByName(name);
    }

}
