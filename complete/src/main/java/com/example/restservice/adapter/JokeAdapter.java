package com.example.restservice.adapter;

import com.example.restservice.model.Joke;
import org.springframework.web.client.RestTemplate;

public class JokeAdapter {
    //I will add mehtod(s) for comminucating to/from outside/anther service

    public Joke callJokeApi(){
        String url = "https://api.chucknorris.io/jokes/random";
        RestTemplate restTemplate = new RestTemplate();
        Joke joke = restTemplate.getForObject(url, Joke.class);
        System.out.println(joke);
        return joke;
    }
}
