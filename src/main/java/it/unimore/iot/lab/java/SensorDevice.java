package it.unimore.iot.lab.java;

public class SensorDevice extends Device{
    private float latitude;
    private float longitude;
    private double lastMeasurement;

    public SensorDevice(String id, String type, String manufacturer, String softwareVersion, float latitude, float longitude, double lastMeasurement) {
        super(id, type, manufacturer, softwareVersion);
        this.latitude = latitude;
        this.longitude = longitude;
        this.lastMeasurement = lastMeasurement;
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

    public double getLastMeasurement() {
        return lastMeasurement;
    }

    public void setLastMeasurement(double lastMeasurement) {
        this.lastMeasurement = lastMeasurement;
    }

    @Override
    public String toString() {
        return "SensorDevice{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", lastMeasurement=" + lastMeasurement +
                '}';
    }
}
