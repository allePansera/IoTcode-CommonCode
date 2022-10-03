package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import it.unimore.iot.lab.java.Device;

public class Main {
    public static void main(String[] args) {
        //GSON INSTANCE
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        //DE-SERIALIZZAZIONE
        Device devSer = new Device("sensor_1","actuator","IBM", "1.0");
        String devDeser = gson.toJson(devSer);
        System.out.println(devDeser);
        //SERIALIZZAZIONE
        String ser = "{\"id\":\"sensor_1\",\"type\":\"actuator\",\"manufacturer\":\"IBM\",\"softwareVersion\":\"1.0\"}";
        JsonObject object = (JsonObject) parser.parse(ser);
        devSer = gson.fromJson(ser,Device.class);
        System.out.println(devSer);
    }
}