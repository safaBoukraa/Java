class Device {
    int battery;

    public Device(int battery) {
        this.battery = battery;
    }

    public void status() {
        System.out.println("Battery level: " + battery + "%");
    }
}

class Phone extends Device {
    public Phone(int battery) {
        super(battery);
    }

    public void makeCall() {
        if (battery < 10) {
            System.out.println("Battery critical! Cannot make call.");
        } else {
            System.out.println("Making call...");
            battery -= 5;
        }
    }

    public void playGame() {
        if (battery < 25) {
            System.out.println("Battery level too low to play game.");
        } else {
            System.out.println("Playing game...");
            battery -= 10;
        }
    }

    public void charge() {
        System.out.println("Charging...");
        battery = 100;
    }
}

class DeviceTest {
    public static void main(String[] args) {
        Phone phone = new Phone(100);
        phone.makeCall();
        phone.makeCall();
        phone.makeCall();
        phone.playGame();
        phone.playGame();
        phone.charge();
    }
}