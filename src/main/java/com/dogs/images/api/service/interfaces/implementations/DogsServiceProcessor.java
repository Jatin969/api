package com.dogs.images.api.service.interfaces.implementations;

import com.dogs.images.api.config.endpoints.ApplicationPropertiesConstants;
import com.dogs.images.api.service.interfaces.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Qualifier("dogsServiceProcessor")
public class DogsServiceProcessor implements DogsService {
    private final ApplicationPropertiesConstants applicationPropertiesConstants;

    @Autowired
    public DogsServiceProcessor(ApplicationPropertiesConstants applicationPropertiesConstants){
        this.applicationPropertiesConstants = applicationPropertiesConstants;
    }

    @Override
    public String getAllBreeds(){
        String url = applicationPropertiesConstants.getBreedList();
        return processGetRequest(url);
    }
    @Override
    public String getImagesWithCount(String count){
        String url = String.format(applicationPropertiesConstants.getImagesRandomWithCount(),count);
        return processGetRequest(url);
    }
    @Override
    public String getImagesWithBreedAndCount(String breed,  String count){
        String url = String.format(applicationPropertiesConstants.getImagesRandomWithBreedCount(),breed,count);
        return processGetRequest(url);
    }
    @Override
    public String getImagesWithBreedAndSubBreedAndCount(String breed, String subBreed,  String count){
        String url = String.format(applicationPropertiesConstants.getImagesRandomWithBreedSubbreedCount(),breed,subBreed,count);
        return processGetRequest(url);
    }
    
    private String processGetRequest(String url) {
        RestTemplate rest = new RestTemplate();
        return rest.getForObject(url, String.class);
    }
}
