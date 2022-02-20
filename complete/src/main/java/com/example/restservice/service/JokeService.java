package com.example.restservice.service;

import com.example.restservice.adapter.JokeAdapter;
import com.example.restservice.model.Joke;

public class JokeService {

    public Joke getJoke(){
        JokeAdapter adapter = new JokeAdapter();
        Joke joke = adapter.callJokeApi();
        return joke;
    }
}
