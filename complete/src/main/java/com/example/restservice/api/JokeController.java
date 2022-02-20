package com.example.restservice.api;

import com.example.restservice.model.Joke;
import com.example.restservice.service.JokeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    @GetMapping("/joke")
    public ResponseEntity<Joke> getRandomJoke(){
        JokeService jokeService = new JokeService();
        return new ResponseEntity<>(jokeService.getJoke(), HttpStatus.OK);
    }

    //CatAdapter
    //CatService
    //CatController
    //Cat
//    https://cat-fact.herokuapp.com/facts/1
}
