public class Main {
    public static void main(String[] args) {

        System.out.println("Mission 1");
        //С помощью условного оператора напишите программу, которая выводит в консоль:
        //поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
        //информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        //Критерии оценки:
        //Переменные инициализированы
        //Имя переменных отражает данные, которые она содержит
        //Параметры условного оператора решают задание
        //Решение задачи выводится в консоль
        int ageHuman = 15;
        if (ageHuman >=18)
        {
            System.out.println("В данном подразделении совершеннолетний пользователь!");
        }
        if (ageHuman<=18)
        {
            System.out.println("В данном подразделении пользователь не достиг совершеннолетия!");
        }

        int ageHuman2 = 19;
        if (ageHuman2 >=18)
        {
            System.out.println("В данном подразделении совершеннолетний пользователь!");
        }
        if (ageHuman2<=18)
        {
            System.out.println("В данном подразделении пользователь не достиг совершеннолетия!");
        }


        System.out.println(" ");
        System.out.println("Mission 2");
        //Напишите программу, которая выводит в консоль сообщение о том, что:
        //ребенок ходит в школу, если его возраст равен или больше 7 годам
        //человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        //человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        //Критерии оценки:
        //Переменные инициализированы
        //Имя переменных отражает данные, которые она содержит
        //Параметры условного оператора решают задание
        //Решение задачи выводится в консоль
        int ageHarry = 7;
        System.out.println("Ребенку " + ageHarry +  " лет");
        if (ageHarry >=7)
        {
            System.out.println("Ребенок ходит в шкоу");
        }
        int ageBob = 21;
        System.out.println("Человеку " +ageBob+ " лет");
        if (ageBob >=18)
        {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        int ageJack = 30;
        System.out.println("Человеку " +ageJack+ " лет");
        if (ageJack >=24)
        {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }


        System.out.println(" ");
        System.out.println("Mission 3");
        // Вместимость одного вагона поезда составляет 102 человека.
        // Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        // Напишите программу, которая выводит в консоль сообщение о том,
        // есть ли место в вагоне: сидячее или стоячее или вагон уже полностью забит.
        //Критерии оценки:
        //Переменные инициализированы
        //Имя переменных отражает данные, которые она содержит
        //Параметры условного оператора решают задание
        //Решение задачи выводится в консоль
        int wagonPlace = 102;
        int sitPlace = 60;
        int passengerOne = 14;
        int passengerToo = 82;
        int passengerThree =110;
        if (passengerOne<sitPlace)
        {   System.out.println("В вагоне всего 102 места из них 60 сидячих, в вагон зашли " + passengerOne + " человек ");
            System.out.println("В вагоне еще осталось - "+(sitPlace-passengerOne)+" свободных сидячих мест ");}
        if (passengerToo>=sitPlace)
        {   System.out.println("В вагоне всего 102 места из них 60 сидячих, в вагон зашли " + passengerToo + " человек ");
            System.out.println("В вагоне не осталось свободных сидячих мест!");
            System.out.println((passengerToo - sitPlace)+" человека поедет стоя");}
        if (passengerThree==wagonPlace)
        {System.out.println("В вагоне не осталось свободных мест!");}
        if (passengerThree>=wagonPlace)
        {System.out.println("В вагоне всего 102 места из них 60 сидячих, в вагон зашли " + passengerThree + " человек ");
            System.out.println("Вагон полностью забит и " + (passengerThree - wagonPlace) + " человек останется ждать следующего поезда");}


    }


}



//// ПРОВЕРЬТЕ МОИ ДЗ!!!