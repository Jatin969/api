package com.dogs.images.api.service.interfaces;

public interface DogsService {
    public String getAllBreeds();
    public String getImagesWithCount(String count);
    public String getImagesWithBreedAndCount(String breed,  String count);
    public String getImagesWithBreedAndSubBreedAndCount(String breed, String subBreed,  String count);
}
