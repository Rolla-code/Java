package com.example.dogrestapi.service;

import com.example.dogrestapi.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveAllDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
