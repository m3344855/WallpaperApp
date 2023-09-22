package com.example.wallpaperf.models;

import java.util.ArrayList;

public class SearchApiResponse {
    public int total_result;
    public int page;
    public int per_page;
    public ArrayList<Photo> photos;
    public String next_page;

    public int getPage() {
        return page;
    }

    public int getPer_page() {
        return per_page;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public String getNext_page() {
        return next_page;
    }

    public int getTotal_result() {
        return total_result;
    }
}
