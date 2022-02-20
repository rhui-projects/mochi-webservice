package com.example.restservice.adapter;

import com.example.restservice.model.Cat;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class CatAdapter {
    //I will add mehtod(s) for communicating to/from outside/another service

    public List<Cat> callCatApi(){
        String url = "https://cat-fact.herokuapp.com/facts";
        RestTemplate restTemplate = new RestTemplate();
        List<Cat> cats = restTemplate.getForObject(url, List.class);
        return cats;
    }
}
