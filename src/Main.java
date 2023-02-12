public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        int temperatureDayOne = 12;
        int temperatureDayTwo = 2;
        if (temperatureDayOne >= 5) {
            System.out.println("На улице " + temperatureDayOne + " градусов, можно идти без шапки.");
        }
        if (temperatureDayTwo >= 5) {
        } else {
            System.out.println("На улице " + temperatureDayTwo + " градуса, нужно надеть шапуку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
    }
}