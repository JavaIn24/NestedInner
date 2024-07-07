package ClassWork;

import java.util.Scanner;

public class Human {
    String name;
    private int age;

    /**
     * Сначала создаем необходимы классы с необходимыми методами. Далее в главом классе создаем метод
     * в котором создаём объекты ранее созданных внутренних классов  и вызываем соответсвующие методы
     */
    public void toLive() {
        Head head = new Head();
        head.toThink();
        Hands hands = new Hands();
        hands.toWork();
        Legs legs = new Legs();
        legs.toWalk();
        System.out.println("Введите биологический возраст");
        Heart heart = new Heart(new Scanner(System.in).nextInt());/** В конструктор «Heart» вводим возраст
         * через объект класса «scanner». Он будет передавать данный параметр значению поля «age» класса «Human».*/
        System.out.println("Возраст человека соответсвует " + age);
    }

    private class Head {
        public void toThink() {
            System.out.println("Голова " + name + " может думать");

            /**
         * Локальные классы
         * бъявляются внутри других методов. Обладают всеми свойствами статического вложенного класса,
         * но создавать их экземпляры можно только в методе, причем метод не может быть статическим.
         * Для их создания нужен экземпляр внешнего класса.
         */
        class Brain {
            final int EFFICIENCY = 10;

            public void theBrainWorks() {
                System.out.println("Эффективность работы мозга оценивается на " + EFFICIENCY  + "%");
            }

        }
        Brain brain = new Brain();
        brain.theBrainWorks();
    }
}


    private class  Heart {
        Heart(int heartAge) {
             age = heartAge;
         }
    }


    private class Hands {
        public void toWork(){
            System.out.println("У человека есть руки и они работают");
        }
    }


      private class Legs {
        public void toWalk (){
            System.out.println("Ноги ходят");
        }
      }
      /**статический вложенный класс «Clothes
       *В случае создания статического класса связь между объектом вложенного и внешнего класса не очень нужна.
       *Чтобы вызвать этот метод, необходимо обратиться к классу «Human» и внутри к статическому классу «Clothes»*/
      public static class Clotnes{
        public void toPutOnClotnhes(){
            System.out.println("Человек носит одежду впринципе");
        }
      }
}
