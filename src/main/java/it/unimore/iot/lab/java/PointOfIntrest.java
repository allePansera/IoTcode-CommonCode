package it.unimore.iot.lab.java;

import java.util.ArrayList;

public class PointOfIntrest {
    private String name;
    private float latitude;
    private float longitude;
    private ArrayList<Device> deviceList;

    public PointOfIntrest(String name, float latitude, float longitude, ArrayList<Device> deviceList) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.deviceList = deviceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(ArrayList<Device> deviceList) {
        this.deviceList = deviceList;
    }

    @Override
    public String toString() {
        return "PointOfIntrest{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", deviceList=" + deviceList +
                '}';
    }
}
