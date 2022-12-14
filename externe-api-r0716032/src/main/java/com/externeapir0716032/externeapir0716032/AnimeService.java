package com.externeapir0716032.externeapir0716032;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class AnimeService {

    @GetMapping("/")
    public String animeWelkom() {
        return "Welcome," + "\n" +
                "Dit is de externe webAPI van Tim Van der Perre." + "\n" + "\n"
                + "hoe te gebruiken: " + "\n"
                + "/anime/{anime naam naar keuze}\n" ;
    }

    @GetMapping("/error")
    public String error() {
        return "De naam dat je hebt ingevuld vond niets terug. Het kan helpen om " +  "\"" + "%20" + "\"" + " te gebruiken in plaats van spaties!" ;
    }

    @GetMapping("/anime/{animeName}")
    public String add(@PathVariable String animeName) throws IOException, InterruptedException, JSONException {
        //RestTemplate restTemplate = new RestTemplate();
        //AnimeRequest animeRequest = restTemplate.getForObject("https://anime-db.p.rapidapi.com/anime?page=1&size=1&search=attack%20on%20titan&sortBy=title&sortOrder=desc", AnimeRequest.class);
        System.out.println(animeName);
        String teGebruikenAnimeNaam = animeName.replace(" ","%20");

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://anime-db.p.rapidapi.com/anime?page=1&size=1&search=" + teGebruikenAnimeNaam + "&sortBy=ranking&sortOrder=asc"))
                    .header("X-RapidAPI-Key", "074801c3b4mshb464687a0b0b935p156bc3jsn52f06faef2d5")
                    .header("X-RapidAPI-Host", "anime-db.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject Jsonresponse = new JSONObject(response.body());

            JSONArray responseData = (JSONArray) Jsonresponse.get("data");
            JSONObject responseAnime = responseData.getJSONObject(0);

            String title = responseAnime.getString("title");
            String description = responseAnime.getString("synopsis");
            float price = 5;
            String type = responseAnime.getString("type");
            String picture_url = responseAnime.getString("image");

            AnimeResponse animeResponse = new AnimeResponse(title, description,price,type,picture_url);


            System.out.println(animeResponse.toString());

            return animeResponse.toString();

        }catch(JSONException j){
                return error();
        }
    }
}
