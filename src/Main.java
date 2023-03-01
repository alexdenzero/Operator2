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
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Чтото пошло нетак");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2022;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Чтото пошло не так");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 4;
        if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
        System.out.println(year + " год не является високостным");
    }
}


    public static void task4 () {
        System.out.println("Задача 4");
    int deliveryDistance = 95;
    int a = 1;
    int b = 2;
    int c = 3;
    if (deliveryDistance <= 20) {
        System.out.println("Потребуется дней: " + a);
    } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Потребуется дней: " + b);
    } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("Потребуется дней: " + c);
    } else {
        System.out.println("Свыше 100 км доставки нет.");
    }
}

     public static void task5 () {
        System.out.println("Задача 5");
     int monthNumber = 12;
     switch (monthNumber) {
     case 1:
     System.out.println("Январь");
     break;
     case 2:
     System.out.println("Февраль");
     break;
     case 3:
     System.out.println("Март");
     break;
     case 4:
     System.out.println("Апрель");
     break;
     case 5:
     System.out.println("май");
     break;
     case 6:
     System.out.println("Июнь");
     break;
     case 7:
     System.out.println("Июль");
     break;
     case 8:
     System.out.println("Август");
     break;
     case 9:
     System.out.println("Воскресенье");
     break;
     case 10:
     System.out.println("Октябрь");
     break;
     case 11:
     System.out.println("Ноябрь");
     break;
     case 12:
     System.out.println("Декабрь");
     break;
     default:
     System.out.println("Такого месяца не существует");
     }
     }
}

