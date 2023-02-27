package com.dogs.api.controllers;

import com.dogs.api.service.interfaces.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dogs-api")
public class DogsApi {

    private final DogsService dogsServiceProcessor;

    @Autowired
    public DogsApi(@Qualifier(value = "dogsServiceProcessor") DogsService dogsServiceProcessor){
        this.dogsServiceProcessor = dogsServiceProcessor;
    }

    @GetMapping("/all-breeds")
    public ResponseEntity<String> breeds(){
        String message = dogsServiceProcessor.getAllBreeds();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/random-images/{count}")
    public ResponseEntity<String> getImagesWithCount(@PathVariable String count){
        String message = dogsServiceProcessor.getImagesWithCount(count);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/random-images/{breed}/{count}")
    public ResponseEntity<String> getImagesWithBreedAndCount(@PathVariable String breed, @PathVariable String count){
        String message = dogsServiceProcessor.getImagesWithBreedAndCount(breed,count);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/random-images/{breed}/{subBreed}/{count}")
    public ResponseEntity<String> getImagesWithBreedAndSubBreedAndCount(@PathVariable String breed,@PathVariable String subBreed, @PathVariable String count){
        String message = dogsServiceProcessor.getImagesWithBreedAndSubBreedAndCount(breed,subBreed,count);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
