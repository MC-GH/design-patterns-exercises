package builder;

public class Computer {
    private String caseType;
    private String motherboardType;
    private int powerSupplyWatts;
    private int memoryInGb;
    private String processorType;
    private String GPUName;
    private int SSDSizeInGb;
    private int numberOfFans;
    private boolean RGBLighting;

    public Computer(ComputerBuilder builder) {
        this.caseType = builder.getCaseType();
        this.motherboardType = builder.getMotherboardType();
        this.powerSupplyWatts = builder.getPowerSupplyWatts();
        this.memoryInGb = builder.getMemoryInGb();
        this.processorType = builder.getProcessorType();
        this.GPUName = builder.getGPUName();
        this.SSDSizeInGb = builder.getSSDSizeInGb();
        this.numberOfFans = builder.getNumberOfFans();
        this.RGBLighting = builder.getRGBLighting();
    }

    @Override
    public String toString() {
        return String.format("""
                        Specs:\s
                         Case: %s\s
                         Motherboard type: %s\s
                         PowerSupply watts: %d\s
                         Memory in GB: %d\s
                         Processor type: %s\s
                         GPU Name: %s\s
                         SSD Size in GB: %d\s
                         Number of fans: %d\s
                         RGB Lighting: %s"""
                ,caseType, motherboardType,powerSupplyWatts,
                memoryInGb,processorType,GPUName,
                SSDSizeInGb,numberOfFans,RGBLighting);
    }
}
