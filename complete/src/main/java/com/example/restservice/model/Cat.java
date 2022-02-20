package com.example.restservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    @JsonProperty("user")
    private String userName;
    private String text;
}
