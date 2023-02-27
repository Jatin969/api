package com.dogs.images.api.config.endpoints;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="dogs-api.url")
@Configuration
public class ApplicationPropertiesConstants {
    private String breedList;
    private String imagesRandomWithCount;
    private String imagesRandomWithBreedCount;
    private String imagesRandomWithBreedSubbreedCount;

    public String getBreedList() {
        return breedList;
    }

    public void setBreedList(String breedList) {
        this.breedList = breedList;
    }

    public String getImagesRandomWithCount() {
        return imagesRandomWithCount;
    }

    public void setImagesRandomWithCount(String imagesRandomWithCount) {
        this.imagesRandomWithCount = imagesRandomWithCount;
    }

    public String getImagesRandomWithBreedCount() {
        return imagesRandomWithBreedCount;
    }

    public void setImagesRandomWithBreedCount(String imagesRandomWithBreedCount) {
        this.imagesRandomWithBreedCount = imagesRandomWithBreedCount;
    }

    public String getImagesRandomWithBreedSubbreedCount() {
        return imagesRandomWithBreedSubbreedCount;
    }

    public void setImagesRandomWithBreedSubbreedCount(String imagesRandomWithBreedSubbreedCount) {
        this.imagesRandomWithBreedSubbreedCount = imagesRandomWithBreedSubbreedCount;
    }
}
