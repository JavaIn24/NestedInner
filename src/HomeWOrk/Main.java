package HomeWOrk;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi R8", 4000000, 210 , 1725);
        Car car1= new Car("ЗИЛ", 2000000,110,16000);
        car.toWorkCar();
        System.out.println("-------------------------------------------");
        car1.toWorkCar();
    }
}
