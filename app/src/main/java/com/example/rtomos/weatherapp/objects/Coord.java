package com.example.rtomos.weatherapp.objects;

import com.google.gson.annotations.Expose;

/**
 * Created by rtomos on 8/21/2015.
 */
public class Coord {
    @Expose
    private Double lon;
    @Expose
    private Double lat;

    /**
     * @return The lon
     */
    public Double getLon() {
        return lon;
    }

    /**
     * @param lon The lon
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * @return The lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * @param lat The lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

}