package com.example.client;

import com.example.dto.UserDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class RestClient {

    String BASE_URL = "http://localhost:8080";
    public static HttpClient client = HttpClient.newBuilder().build();
    ObjectMapper mapper = new ObjectMapper();

    public void init(UserDto userDto) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(BASE_URL + "/init"))
                .headers("Accept", "application/json", "Content-type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(userDto)))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(200, response.statusCode());
    }
}
