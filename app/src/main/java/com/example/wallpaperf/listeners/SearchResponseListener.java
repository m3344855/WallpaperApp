package com.example.wallpaperf.listeners;

import com.example.wallpaperf.models.SearchApiResponse;

public interface SearchResponseListener {
    void onFetch(SearchApiResponse response, String message);
    void onError(String message);
}
