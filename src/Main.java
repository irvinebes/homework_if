public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        // задание 2
        System.out.println("Задание 2");
        int manAge = 6;
        if (manAge >= 7) {
            System.out.println("Ходит в школу, либо уже окончил.");
        } else if (manAge < 7 ) {
            System.out.println("Ребёнок ещё не ходит в школу.");
        }
        if (manAge >= 18) {
            System.out.println("Человек может отправляться в университет.");
        } else if (manAge < 18 ) {
                System.out.println("Человеку ещё рано в университет.");
        }
        if (manAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать работу.");
        } else if (manAge < 24 ) {
                System.out.println("Человеку ещё рано искать работу.");
        }
        // задание 3
        System.out.println("Задание 3");
        int oneCar = 101;
        int seat = 59;
        int stand = 40;
        if (seat < 60) {
            System.out.println("Сидячие места ещё есть.");
        } else {
            System.out.println("Сидячих мест нет.");
        }
        if (stand < 42) {
            System.out.println("Стоячие места ещё есть.");
        } else {
            System.out.println("Стоячих мест нет.");
        }
        if (oneCar >= 102) {
            System.out.println("В вагоне нет места.");
        } else {
            System.out.println("В вагоне есть места.");
        }


    }
}