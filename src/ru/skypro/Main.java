package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        int i = 1;
        String a = "";
        while ( i <= 10){
            a += i + " ";
            i++;
        }
        String c = "";
        for (int h = 10; h >= 1; h --){
            c += h + " ";
        }
        System.out.println(a + "\n" + c);

        //Задание 2
        int firstFriday = 5;
        for (;firstFriday <= 31; firstFriday +=7){
            System.out.println("Сегодня пятница - " + firstFriday + "-е число. Необходимо подготовить отчет");
        }

        //Задание 3
        int currentYear = 2022;
        int lastYear = currentYear - 200;
        int futureYear = currentYear + 100;
        for (;lastYear <= futureYear; lastYear++){
            if (lastYear % 79 == 0) {
                System.out.println(lastYear);
            }
        }



    }
}
