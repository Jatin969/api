package com.dogs.images.api.models;

import java.util.ArrayList;
import java.util.List;

public class MessageBody{
    private String message;
    private List<String> links;
   
    public MessageBody() {
        links = new ArrayList<>();
    }
    public MessageBody(String message, List<String> links) {
        this.message = message;
        this.links = links;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<String> getLinks() {
        return links;
    }
    public void setLinks(List<String> links) {
        this.links = links;
    }

    
}