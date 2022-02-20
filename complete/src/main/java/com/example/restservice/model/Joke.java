package com.example.restservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Joke {

    @JsonProperty("icon_url")
    private String iconUrl;
    private String id;
    private String url;
    private String value;

}
