package com.typicode.jsonplaceholder;

import static com.typicode.jsonplaceholder.Endpoints.ALBUMS;
import static com.typicode.jsonplaceholder.Endpoints.PHOTOS;
import static io.restassured.RestAssured.given;

public class Request {

    public Photo getPhoto(int id) {
        return given().
                when().
                log().all().
                get(PHOTOS + id).
                then().
                log().all().
                extract().
                response()
                .body().as(Photo.class);
    }

    public Album getAlbum(int id) {
        return given().
                when().
                log().all().
                get(ALBUMS + id).
                then().
                log().all().
                extract().
                response()
                .body().as(Album.class);
    }

}
