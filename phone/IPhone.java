public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "iPhone "+this.getVersion()+" says: "+this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking with iris scanner";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone "+this.getVersion()+" from "+this.getCarrier());    
    }
}