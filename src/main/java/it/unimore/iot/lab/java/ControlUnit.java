package it.unimore.iot.lab.java;

import java.util.ArrayList;

public class ControlUnit {
    private ArrayList<PointOfIntrest> pointOfIntrestList;

    public ControlUnit(ArrayList<PointOfIntrest> pointOfIntrestList) {
        this.pointOfIntrestList = pointOfIntrestList;
    }

    public ArrayList<PointOfIntrest> getPointOfIntrestList() {
        return pointOfIntrestList;
    }

    public void setPointOfIntrestList(ArrayList<PointOfIntrest> pointOfIntrestList) {
        this.pointOfIntrestList = pointOfIntrestList;
    }

    public ArrayList<Device> getDeviceFromPointOfIntrest(Device d){
        /**
         * From a given device fetch all the devices inside each PoI in pointOfIntrestList with d.type
         * @author: Alessandro Pansera
         * **/
        ArrayList<Device> listOfDevice = new ArrayList<>();
        //iterate thourgh all the PoI
        for(int i = 0; i < this.pointOfIntrestList.size(); i++){
            //iterate thourgh all the devices inside current PoI
            for(int k = 0; k < this.pointOfIntrestList.get(i).getDeviceList().size(); k++){
                String currentDeviceType = this.pointOfIntrestList.get(i).getDeviceList().get(k).getType();
                Device currentDevice = this.pointOfIntrestList.get(i).getDeviceList().get(k);
                if(d.getType().compareTo(currentDeviceType)==0){
                    listOfDevice.add(currentDevice);
                }
            }
        }
        return listOfDevice;
    }
    public ArrayList<? extends Device> getDeviceFromPointOfIntrest(String type){
        /**
         * From a given device fetch all the devices inside each PoI in pointOfIntrestList with type
         * @author: Alessandro Pansera
         * **/
        ArrayList<Device> listOfDevice = new ArrayList<>();
        //iterate thourgh all the PoI
        for(int i = 0; i < this.pointOfIntrestList.size(); i++){
            //iterate thourgh all the devices inside current PoI
            for(int k = 0; k < this.pointOfIntrestList.get(i).getDeviceList().size(); k++){
                String currentDeviceType = this.pointOfIntrestList.get(i).getDeviceList().get(k).getType();
                Device currentDevice = this.pointOfIntrestList.get(i).getDeviceList().get(k);
                if(type.compareTo(currentDeviceType)==0){
                    listOfDevice.add(currentDevice);
                }
            }
        }
        return listOfDevice;
    }

    public ArrayList<? extends Device> getDeviceFromPointOfIntrest(PointOfIntrest PoI, Device d){
        /**
         * From a given device fetch all the devices inside specified PoI with d.type
         * @author: Alessandro Pansera
         * **/
        ArrayList<Device> listOfDevice = new ArrayList<>();
        //iterate thourgh all the devices inside current PoI
        for(int k = 0; k < PoI.getDeviceList().size(); k++){
            String currentDeviceType = PoI.getDeviceList().get(k).getType();
            Device currentDevice = PoI.getDeviceList().get(k);
            if(d.getType().compareTo(currentDeviceType)==0){
                listOfDevice.add(currentDevice);
            }
        }

        return listOfDevice;
    }

    public ArrayList<? extends Device> getDeviceFromPointOfIntrest(PointOfIntrest PoI, String type){
        /**
         * From a given device fetch all the devices inside specified PoI with type attribute matching paramater
         * @author: Alessandro Pansera
         * **/
        ArrayList<Device> listOfDevice = new ArrayList<>();
        //iterate thourgh all the devices inside current PoI
        for(int k = 0; k < PoI.getDeviceList().size(); k++){
            String currentDeviceType = PoI.getDeviceList().get(k).getType();
            Device currentDevice = PoI.getDeviceList().get(k);
            if(type.compareTo(currentDeviceType)==0){
                listOfDevice.add(currentDevice);
            }
        }

        return listOfDevice;
    }
    @Override
    public String toString() {
        return "ControlUnit{" +
                "pointOfIntrestList=" + pointOfIntrestList +
                '}';
    }
}
