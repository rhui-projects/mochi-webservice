package com.example.restservice.api;

import com.example.restservice.exception.PetExistException;
import com.example.restservice.exception.PetNotFoundException;
import com.example.restservice.model.Pet;
import com.example.restservice.service.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    PetService petService = new PetService();
    //GET
    @GetMapping("/pet")
    public List<Pet> getAllPets(){
        return petService.getAllPets();
    }

    //I want to use the same route => (/pet) but I want to send an id to filter the data
    //PathVariable
    @GetMapping("/pet/{id}")
    public ResponseEntity<Pet> getPetById(@PathVariable int id) {
        try{
            return new ResponseEntity<>(petService.getById(id), HttpStatus.OK);
        }
        catch(PetNotFoundException petNotFoundException ){
            return new ResponseEntity(petNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    //ResponseEntity => to send the result/exception Messasge with httpStatus

    //Method, Constructor, Generic ->

    @GetMapping("/pet/ownername/{name}")
    public ResponseEntity<Pet> getPetByOwnerName(@PathVariable String name){
        try{
            return new ResponseEntity<>(petService.getByOwnerName(name), HttpStatus.OK);
        }
        catch (PetNotFoundException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

    //POST
    @PostMapping("/pet")
    public ResponseEntity<Pet> savePet(@RequestBody Pet pet){
        try{
            petService.addPet(pet);
            return new ResponseEntity<>(pet, HttpStatus.CREATED);
        }
        catch (PetExistException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.CONFLICT);
        }

    }

    //swagger

    //PUT
    @PutMapping("/pet/{id}")
    public ResponseEntity<Pet> modifyPet(@PathVariable int id, @RequestBody Pet pet){

        try{
            petService.updatePet(id, pet);
            return new ResponseEntity<>(pet, HttpStatus.NO_CONTENT);
        }
        catch (PetNotFoundException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //DELETE
    @DeleteMapping("/pet/{id}")
    public ResponseEntity deletePet(@PathVariable int id){
        try{
            petService.deletePet(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch (PetNotFoundException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


    //CRUD operation => Create, READ, Update and delete

}

