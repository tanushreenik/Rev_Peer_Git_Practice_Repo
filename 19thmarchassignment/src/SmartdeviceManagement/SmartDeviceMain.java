package SmartdeviceManagement;

public class SmartDeviceMain {
    public static void main(String[] args) {

        SmartProjector p = new SmartProjector(1, "Epson");

        p.displayDeviceInfo();
        p.connectToWifi();
        p.turnOn();
        p.turnOff();
    }
}