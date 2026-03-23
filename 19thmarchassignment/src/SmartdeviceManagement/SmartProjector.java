package SmartdeviceManagement;

class SmartProjector implements Connectable, Controllable {

    int deviceId;
    String brand;

    SmartProjector(int deviceId, String brand) {
        this.deviceId = deviceId;
        this.brand = brand;
    }

    public void connectToWifi() {
        System.out.println("Connected to WiFi");
    }

    public void turnOn() {
        System.out.println("Device ON");
    }

    public void turnOff() {
        System.out.println("Device OFF");
    }

    void displayDeviceInfo() {
        System.out.println(deviceId + " " + brand);
    }
}