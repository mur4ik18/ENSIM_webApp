package com.ccp.tp3.JObjects;

import java.util.List;

public record Meteo(
        City city,
        String update,
        List<Forecast> forecast
) {
    public record City(
            String insee,
            int cp,
            String name,
            double latitude,
            double longitude,
            int altitude
    ) {}

    public record Forecast(
            String insee,
            int cp,
            double latitude,
            double longitude,
            String datetime,
            int temp2m,
            int rh2m,
            int wind10m,
            int gust10m,
            int dirwind10m,
            int rr10,
            int rr1,
            int probarain,
            int weather,
            int probafrost,
            int probafog,
            int probawind70,
            int probawind100,
            int tsoil1,
            int tsoil2,
            int gustx,
            int iso0
    ) {}
}