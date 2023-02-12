public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
            System.out.println("На улице " + temperatureDayTwo + " градуса, нужно надеть шапку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speedLess = 30;
        int speedMore = 110;
        if (speedMore > 60) {
            System.out.println("Если скорость " + speedMore + ", то придется заплатить штраф.");
        }
        if (speedLess > 60) {
        } else {
            System.out.println("Если скорость " + speedLess + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int kindergartenAge = 4;
        int schoolAge = 13;
        int universityAge = 22;
        int workAge = 28;
        if (kindergartenAge > 2 && kindergartenAge < 6) {
            System.out.println("Если возраст человека равен " + kindergartenAge + ", то ему нужно ходить в детский сад.");
        }
        boolean canGoToSchool = schoolAge > 7 && schoolAge < 18;
        if (canGoToSchool) {
            System.out.println("Если возраст человека равен " + schoolAge + ", то ему нужно ходить в школу");
        }
        if (universityAge > 18 && universityAge < 24) {
            System.out.println("Если возраст человека равен " + universityAge + ", то ему нужно ходить в университет");
        }
        if (workAge < 24 ) {
        } else {
            System.out.println("Если возраст человека равен " + workAge + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageUnderFive = 3;
        int ageMoreFiveButUnderFourteen = 9;
        int ageMoreFourteen = 17;
        if (ageUnderFive < 5) {
            System.out.println("Если возраст ребенка равен " + ageUnderFive + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageMoreFiveButUnderFourteen < 14) {
            System.out.println("Если возраст ребенка равен " + ageMoreFiveButUnderFourteen + ", то ему можно кататься в сопровождении взрослого.");
        }
        if (ageMoreFourteen < 14) {
        } else {
            System.out.println("Если возраст ребенка равен " + ageMoreFourteen + ", то ему можно кататься без сопровождения взрослого");
        }
    }
}