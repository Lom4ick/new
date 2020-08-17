package com.typicode.jsonplaceholder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Album {
    @JsonProperty("userId")
    public int userId;
    @JsonProperty("id")
    public int id;
    @JsonProperty("title")
    public String title;
}


