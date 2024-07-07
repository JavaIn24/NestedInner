package HomeWOrk;

public class Car {
    String carBrand;
    int speed;
    int weight;
    int cost;

    public Car(String carBrand, int cost, int speed, int weight) {
        this.carBrand = carBrand;
        this.cost = cost;
        this.speed = speed;
        this.weight = weight;
    }

    public void toWorkCar(){
        Engine engine = new Engine();
        engine.isRanning();
        Interior interior = new Interior();
        interior.matherialSaloon();
    }
    private class Engine{
        public void isRanning(){
            if (weight <= 2000){
                System.out.println("Двигатель может развивать максимальную скорость равную " + speed + "км/ч");
            }else {
                System.out.println("Двигатель может развивать максимальную скорость равную " + speed + "км/ч");
            }
            class Piston{
                public void workPiston (){
                    System.out.println("Поршень преобразует энергию взрыва воздушнотопливной смеси в механическую силу" +
                            "при помощи которой он совершает полезную работу" +
                            "по вращению коленчатого вала автомобиля");
                }
            }
            Piston piston = new Piston();
            piston.workPiston();
        }
    }
    private class Interior{
        public void matherialSaloon () {
            if (cost >= 3800000) {
                System.out.println("Салон этого автомобиля обшит кожей");
            }else {
                System.out.println("Салон этого автомобиля  также обшит кожей, но кожей убитого дермантина");
            }
            class Roof{
                public void presenceRoof(){
                    if ((cost >= 3800000)) {
                        System.out.println("Крыша этого автомобиля потрясает воображение");
                    }else {
                        System.out.println("Крыша этого автомобиля выглядит не очень!");
                    }
                }
            }
            Roof roof = new Roof();
            roof.presenceRoof();
        }

    }
}




