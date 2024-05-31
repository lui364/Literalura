package com.example.LiterAlura.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consumirApi {
    private static final String API_URL = "https://gutendex.com/books";

    public String buscarLibrosPorTitulo(String titulo) throws IOException, InterruptedException {
        String url = API_URL + "?search=" + titulo;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
