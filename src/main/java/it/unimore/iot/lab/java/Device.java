package it.unimore.iot.lab.java;

public class Device {
    private Geolocation geo;
    private String id;
    private String type;
    private String manufacturer;
    private String softwareVersion;

    public Device(String id, String type, String manufacturer, String softwareVersion, Geolocation geo) {
        this.id = id;
        this.type = type;
        this.manufacturer = manufacturer;
        this.softwareVersion = softwareVersion;
        this.geo = geo;
    }

    public Device(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Geolocation getGeo() {
        return geo;
    }

    public void setGeo(Geolocation geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", softwareVersion='" + softwareVersion + '\'' +
                '}';
    }
}
