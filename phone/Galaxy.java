public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Galaxy "+this.getVersion()+" says: "+this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking with iris scanner";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy "+this.getVersion()+" from "+this.getCarrier());    
    }
}