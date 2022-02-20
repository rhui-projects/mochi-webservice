package com.example.restservice.service;

import com.example.restservice.adapter.CatAdapter;
import com.example.restservice.adapter.JokeAdapter;
import com.example.restservice.model.Cat;
import com.example.restservice.model.Joke;
import org.apache.coyote.Adapter;

import java.util.List;

public class CatService {

    public List<Cat> getCats(){
        CatAdapter adapter = new CatAdapter();
        List<Cat> cats = adapter.callCatApi();
        return cats;
    }
}
