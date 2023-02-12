public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int ageFirstPerson = 19;
        int ageSecondPerson = 13;
        if (ageFirstPerson >= 18) {
            System.out.println("Если возраст человека равен "  + ageFirstPerson + ", то он совершеннолетний");
        }
        if (ageSecondPerson >= 18) {
        } else {
            System.out.println("Если возраст человека равен " + ageSecondPerson + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
    }
}