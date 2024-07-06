import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){ // Здравствуйте, 'Sensei' я поставил номер возле каждой задании
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int num = scanner.nextInt();
        System.out.println("Введите температуру:");
        int num1 = scanner.nextInt();
        String canIGoOut = permission(num, num1);
        System.out.println(canIGoOut);

        System.out.println(permission(generateRandomAge(),30));// Задание 5 & 3
        System.out.println(permission(34,23));
        System.out.println(permission(74,45));
        System.out.println(permission(9,-16));
        System.out.println(permission(45,0));

        generateRandomAge();// Задание 4 - последнее в консоле

    }

    public static int generateRandomAge() {
        Random rn = new Random();
        int randomNum = rn.nextInt(100 - 1 + 1) + 1;
        System.out.println("Рандомное число: " + randomNum);
        return randomNum;


    }

    public static String permission(int ageOfHuman, float temperature) { // Задание 1
        System.out.println("Возраст: " + ageOfHuman + " Температура: " + temperature);
        if (ageOfHuman >= 20 && ageOfHuman <= 45 && temperature >= -20 && temperature <= 30)// Задание 2
            return "Результат: Можно идти гулять";
        else if (ageOfHuman < 20 && temperature >= 0 && temperature <= 28)
            return "Результат: Можно идти гулять";
        else if (ageOfHuman > 45 && temperature >= -10 && temperature <= 25)
            return "Результат: Можно идти гулять";
        else
            return "Результат: Оставайтесь дома";




    }
}