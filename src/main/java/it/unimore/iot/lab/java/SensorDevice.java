package it.unimore.iot.lab.java;

public class SensorDevice extends Device{
    private float latitude;
    private float longitude;
    private double lastMeasurement;

    public SensorDevice(String id, String type, String manufacturer, String softwareVersion, double latitude, double longitude, double lastMeasurement) {
        super(id, type, manufacturer, softwareVersion, new Geolocation(longitude, latitude));

        this.lastMeasurement = lastMeasurement;
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
                "lastMeasurement=" + lastMeasurement +
                '}';
    }
}
