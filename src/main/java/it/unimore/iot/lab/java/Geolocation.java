package it.unimore.iot.lab.java;

public class Geolocation {
    private double longitude;
    private double latitude;

    public Geolocation(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Geolocation(){}

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
