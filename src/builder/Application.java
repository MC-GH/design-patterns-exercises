package builder;

public class Application {

    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();

        Computer computer = builder.setCaseType("GlassCase")
                .setMotherboardType("ATX")
                .setPowerSupplyWatts(650)
                .setProcessorType("Intel core i9")
                .setMemoryInGb(32)
                .setGPUName("Nvidia RTX 4090")
                .setSSDSizeInGb(2)
                .setNumberOfFans(3)
                .setRGBLighting(false)
                .build();

        System.out.println(computer.toString());

    }

}
