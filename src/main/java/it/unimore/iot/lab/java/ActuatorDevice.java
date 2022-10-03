package it.unimore.iot.lab.java;

public class ActuatorDevice extends Device{
    private float latitude;
    private float longitude;
    private double operatingValue;

    public ActuatorDevice(String id, String type, String manufacturer, String softwareVersion, double latitude, double longitude, double operatingValue) {
        super(id, type, manufacturer, softwareVersion, new Geolocation(longitude,latitude));
        this.operatingValue = operatingValue;
    }

    @Override
    public String toString() {
        return "ActuatorDevice{" +
                "operatingValue=" + operatingValue +
                '}';
    }
}
