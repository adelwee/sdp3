public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        light.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.stopMovie();
        System.out.println("Leaving home mode activated");
    }

    public void arriveHome() {
        light.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        System.out.println("Arrive home mode activated");
    }

    public void nightMode() {
        light.turnOff();
        thermostat.setTemperature(16);
        System.out.println("Night mode activated");
    }

    public void movieMode() {
        light.turnOff();
        entertainmentSystem.playMovie();
        System.out.println("Movie mode activated");
    }
}
