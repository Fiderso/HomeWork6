public class Main {

    public static void main(String[] args) {

        byte clientOs = 0; // Задача 1
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println();

        var clientDeviceYear = 2015; // Задача 2
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println();

        var year = 1904;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584.");
        }  else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0)) {
            System.out.println("Год является высокосным, ваш год: " + year);
        } else {
            System.out.println("Год не является высокосным, ваш год: " + year);
        }

        System.out.println();

        var deliveryDisatnce = 95; // Задача 4
        if (deliveryDisatnce > 100) {
            System.out.println("Потребуется дней: " + "один день.");
        } else if (deliveryDisatnce > 60 && deliveryDisatnce < 100) {
            System.out.println("Потребуется дней: " + "два дня.");
        } else if (deliveryDisatnce > 20 && deliveryDisatnce < 60) {
            System.out.println("Потребуется дней: " + "три дня.");
        } else if (deliveryDisatnce > 20) {
            System.out.println("Доставки нет.");
        }

        System.out.println();

        byte monthNumber = 12; // Задача 5
        switch (monthNumber) {
            case 1:
                System.out.println("Данный месяц январь, он пренадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("Данный месяц февраль, он пренадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("Данный месяц март, он пренадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("Данный месяц апрель, он пренадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("Данный месяц май, он пренадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("Данный месяц июнь, он пренадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("Данный месяц июль, он пренадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("Данный месяц август, он пренадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("Данный месяц сентябрь, он пренадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("Данный месяц октябрь, он пренадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("Данный месяц ноябрь, он пренадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("Данный месяц декабрь, он пренадлежит к сезону зима.");
                break;
            default:
                System.out.println("Ошибка, попробуйте заново!");
        }
    }
}