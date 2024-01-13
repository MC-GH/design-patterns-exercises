package builder;

public class ComputerBuilder implements Builder{
    private String caseType;
    private String motherboardType;
    private int powerSupplyWatts;
    private int memoryInGb;
    private String processorType;
    private String GPUName;
    private int SSDSizeInGb;
    private int numberOfFans;
    private boolean RGBLighting;

    @Override
    public ComputerBuilder setCaseType(String caseType) {
        this.caseType = caseType;
        return this;
    }

    @Override
    public ComputerBuilder setMotherboardType(String motherboardType) {
        this.motherboardType = motherboardType;
        return this;
    }

    @Override
    public ComputerBuilder setPowerSupplyWatts(int powerSupplyWatts) {
        this.powerSupplyWatts = powerSupplyWatts;
        return this;
    }

    @Override
    public ComputerBuilder setProcessorType(String processorType) {
        this.processorType = processorType;
        return this;
    }

    @Override
    public ComputerBuilder setMemoryInGb(int memoryInGb) {
        this.memoryInGb = memoryInGb;
        return this;
    }

    @Override
    public ComputerBuilder setGPUName(String GPUName) {
        this.GPUName = GPUName;
        return this;
    }

    @Override
    public ComputerBuilder setSSDSizeInGb(int ssdSizeInGb) {
        this.SSDSizeInGb = ssdSizeInGb;
        return this;
    }

    @Override
    public ComputerBuilder setNumberOfFans(int numberOfFans) {
        this.numberOfFans = numberOfFans;
        return this;
    }

    @Override
    public ComputerBuilder setRGBLighting(boolean hasRGBLighting) {
        this.RGBLighting = hasRGBLighting;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }

    public String getCaseType() {
        return caseType;
    }

    public String getMotherboardType() {
        return motherboardType;
    }

    public int getPowerSupplyWatts() {
        return powerSupplyWatts;
    }

    public int getMemoryInGb() {
        return memoryInGb;
    }

    public String getProcessorType() {
        return processorType;
    }

    public String getGPUName() {
        return GPUName;
    }

    public int getSSDSizeInGb() {
        return SSDSizeInGb;
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public boolean getRGBLighting() {
        return RGBLighting;
    }
}
