public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    "то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temp = 12;
        if (temp >= 5) {
            System.out.println("На улице " + temp +
                    " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp +
                    " градусов, yужно надеть шапку");
        }
        System.out.println("Задача 3");
        int speed = 69;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed +
                    " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed +
                    " можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int agePeople = 21;
        if (agePeople > 2 && agePeople < 6) {
            System.out.println("Если возраст человека равен " + agePeople +
                    " то ему нужно ходить в детский сад.");
        } else if (agePeople > 7 && agePeople < 17){
            System.out.println("Если возраст человека равен " + agePeople +
                    " то ему нужно ходить в школу.");
        } else if (agePeople >= 18 && agePeople <= 24){
            System.out.println("Если возраст человека равен " + agePeople +
                    " то ему нужно ходить в университет.");
        } else if (agePeople > 24){
            System.out.println("Если возраст человека равен " + agePeople +
                    " то ему нужно ходить на работу.");
        }
        System.out.println("Задача 5");
        int ageChild = 16;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    " то ему нельзя кататься на аттракционе.");
        } else if (ageChild > 5 && ageChild < 14){
            System.out.println("Если возраст человека равен " + ageChild +
                    " то ему можно кататься на аттракционе в сопровождении.");
        } else if (ageChild > 14){
            System.out.println("Если возраст человека равен " + ageChild +
                    " то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("Задача 6");
        int countPeople = 63;
        if (countPeople <= 60) {
            System.out.println("В вагоне еще есть сидячие места, т.к. " +
                    "количество людей: " + countPeople);
        } else if (countPeople > 60 && countPeople <= 102) {
            System.out.println("В вагоне еще есть стоячие места, т.к. " +
                    "количество людей: " + countPeople);
        } else if (countPeople > 102) {
            System.out.println("В вагоне уже нет мест, т.к. " +
                    "количество людей: " + countPeople);
        } else {
            System.out.println("Что-то пошло не так, проверьте введенное число, countPeople = " +
                    countPeople);
        }

        System.out.println("Задача 7 ");
        int one = 4;
        int two = 44;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Первое число самое большое и оно равно = " + one);
        } else if (two > one && two > three){
            System.out.println("Второе число самое большое и оно равно = " + two);
        } else {
            System.out.println("Третье число самое большое и оно равно = " + three);
        }
    }
}