package com.typicode.jsonplaceholder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Photo {
    @JsonProperty("albumId")
    public int albumId;
    @JsonProperty("id")
    public int id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("url")
    public String url;
    @JsonProperty("thumbnailUrl")
    public String thumbnailUrl;
}
