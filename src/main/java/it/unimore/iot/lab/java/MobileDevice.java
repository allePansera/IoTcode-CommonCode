package it.unimore.iot.lab.java;

public class MobileDevice extends Device{

    private String engineType;
    private float pollutionEmission;

    public MobileDevice(String id, String type, String manufacturer, String softwareVersion, double latitude, double longitude, String engineType, float pollutionEmission) {
        super(id, type, manufacturer, softwareVersion,new Geolocation(longitude,latitude));

        this.engineType = engineType;
        this.pollutionEmission = pollutionEmission;
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
                "engineType='" + engineType + '\'' +
                ", pollutionEmission=" + pollutionEmission +
                '}';
    }
}
