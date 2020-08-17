package com.typicode.jsonplaceholder;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyOwnApiTest extends BaseApiTest {

    private Request request = new Request();

    @Feature("Photos")
    @Test
    public void verifyPhoto() {
        Photo photo = request.getPhoto(10);
        Assert.assertEquals(photo.thumbnailUrl, "https://via.placeholder.com/150/810b14");
    }

    @Feature("Albums")
    @Test
    public void verifyAlbum() {
        Album album = request.getAlbum(12);
        Assert.assertEquals(album.title, "consequatur autem doloribus natus consectetur");
    }
}
