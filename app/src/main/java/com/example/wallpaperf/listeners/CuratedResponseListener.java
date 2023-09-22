package com.example.wallpaperf.listeners;

import com.example.wallpaperf.models.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
