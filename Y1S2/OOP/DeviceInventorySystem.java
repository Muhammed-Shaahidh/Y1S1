/*
Track the number of devices registered in an inventory.

 (a) Create a class Device with attributes deviceId, deviceType.

 (b) Declare a static variable deviceCount.

 (c) Use a static block to initialize deviceCount to 100.

 (d) Each time a Device object is created, increment the counter.

 (e) Include a static method displayDeviceCount() to show the current count.
 
 (f) In the main method, create 3 devices and display their info and device count.
 */

package Q4;

class Device{
    public String deviceId;
    public String deviceType;

    public static int deviceCount;

    static{
        deviceCount=100;
        System.out.println("Static block. DeviceCount: "+deviceCount);
    }

    public Device(String deviceId,String deviceType){
        this.deviceId=deviceId;
        this.deviceType=deviceType;

        deviceCount++;
    }

    public void displayDeviceDetails(){
        System.out.println("\nDevice ID: "+deviceId);
        System.out.println("Device Type: "+deviceType);
    }

    public static void displayDeviceCount(){
        System.out.println("\nDevice Count: "+deviceCount);
    }
}

public class DeviceInventorySystem {
    public static void main(String[] args) {
        Device d1=new Device("D001","Smart Phone");
        d1.displayDeviceDetails();

        Device d2=new Device("D002","Television");
        d2.displayDeviceDetails();

        Device d3=new Device("D003","Keyboard");
        d3.displayDeviceDetails();

        Device.displayDeviceCount();
    }

}
