package builderPatternSample;

public class CarApp {
    public static void main(String[] args){
        CarAssemble CarAssemble = new CarAssemble.CarBuilder()
                .brand("Honda")
                .engineType("Gasoline")
                .transmission("Automatic")
                .color("Red")
                .passengerCapacity("4")
                .build();


        System.out.println(CarAssemble.brand);
        System.out.println(CarAssemble.engineType);
        System.out.println(CarAssemble.transmission);
        System.out.println(CarAssemble.color);
        System.out.println(CarAssemble.passengerCapacity);
    }
}