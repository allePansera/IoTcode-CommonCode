package it.unimore.iot.lab.java;

public class MobileDevice extends Device{
    private float latitude;
    private float longitude;
    private String engineType;
    private float pollutionEmission;

    public MobileDevice(String id, String type, String manufacturer, String softwareVersion, float latitude, float longitude, String engineType, float pollutionEmission) {
        super(id, type, manufacturer, softwareVersion);
        this.latitude = latitude;
        this.longitude = longitude;
        this.engineType = engineType;
        this.pollutionEmission = pollutionEmission;
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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public float getPollutionEmission() {
        return pollutionEmission;
    }

    public void setPollutionEmission(float pollutionEmission) {
        this.pollutionEmission = pollutionEmission;
    }

    @Override
    public String toString() {
        return "MobileDevice{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", engineType='" + engineType + '\'' +
                ", pollutionEmission=" + pollutionEmission +
                '}';
    }
}
