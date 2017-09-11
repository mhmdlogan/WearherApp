package com.weatherapp.mhmdlogan.weatherapp.Model;

/**
 * Created by MhmdLoGaN on 10/09/2017.
 */

public class Coord {
    private double lat;
    private double lon;


    public Coord(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
