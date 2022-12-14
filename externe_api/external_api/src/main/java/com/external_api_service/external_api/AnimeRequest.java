package com.external_api_service.external_api;

import java.util.List;

public class AnimeRequest {
    int id;
    String title;
    List<String> alternativeTitles;
    int Ranking;
    List<String> genres;
    int episodes;
    boolean hasEpisode;
    boolean hasRanking;
    String image;
    String link;
    String status;
    String synopsis;
    String thumb;
    String type;

    public AnimeRequest(int id, String title, List<String> alternativeTitles, int ranking, List<String> genres, int episodes, boolean hasEpisode, boolean hasRanking, String image, String link, String status, String synopsis, String thumb, String type) {
        this.id = id;
        this.title = title;
        this.alternativeTitles = alternativeTitles;
        Ranking = ranking;
        this.genres = genres;
        this.episodes = episodes;
        this.hasEpisode = hasEpisode;
        this.hasRanking = hasRanking;
        this.image = image;
        this.link = link;
        this.status = status;
        this.synopsis = synopsis;
        this.thumb = thumb;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAlternativeTitles() {
        return alternativeTitles;
    }

    public void setAlternativeTitles(List<String> alternativeTitles) {
        this.alternativeTitles = alternativeTitles;
    }

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int ranking) {
        Ranking = ranking;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public boolean isHasEpisode() {
        return hasEpisode;
    }

    public void setHasEpisode(boolean hasEpisode) {
        this.hasEpisode = hasEpisode;
    }

    public boolean isHasRanking() {
        return hasRanking;
    }

    public void setHasRanking(boolean hasRanking) {
        this.hasRanking = hasRanking;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
