public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        // задание 2
        System.out.println("Задание 2");
        int childAge = 8;
        if (childAge >= 7) {
            System.out.println("Ребёнок ходит в школу.");
        }
        int teenAge = 19;
        if (teenAge >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        int adultAge = 24;
        if (adultAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
        // задание 3
        System.out.println("Задание 3");
        int oneCar = 102;
        int seat = 59;
        int stand = 40;
        if (seat < 60) {
            System.out.println("Сидячие места ещё есть.");
        }
        if (stand < 42) {
            System.out.println("Стоячие места ещё есть.");
        }
        if (oneCar >= 102) {
            System.out.println("В вагоне нет места.");
        }



    }
}