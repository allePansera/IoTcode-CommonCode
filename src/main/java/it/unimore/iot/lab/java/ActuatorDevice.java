package it.unimore.iot.lab.java;

public class ActuatorDevice extends Device{
    private float latitude;
    private float longitude;
    private double operatingValue;

    public ActuatorDevice(String id, String type, String manufacturer, String softwareVersion, float latitude, float longitude, double operatingValue) {
        super(id, type, manufacturer, softwareVersion);
        this.latitude = latitude;
        this.longitude = longitude;
        this.operatingValue = operatingValue;
    }

    @Override
    public String toString() {
        return "ActuatorDevice{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", operatingValue=" + operatingValue +
                '}';
    }
}
