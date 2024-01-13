package builder;

public interface Builder {

    public Builder setCaseType(String caseType);

    public Builder setMotherboardType(String motherboardType);

    public Builder setPowerSupplyWatts(int powerSupplyWatts);

    public Builder setProcessorType(String processorType);

    public Builder setMemoryInGb(int memoryInGb);

    public Builder setGPUName(String GPUName);

    public Builder setSSDSizeInGb(int ssdSizeInGb);

    public Builder setNumberOfFans(int numberOfFans);

    public Builder setRGBLighting(boolean hasRGBLighting);

}
