public class Main {

    public static void main(String[] args) {
        System.out.println("Exersice 1");
        int year = 2004;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.println("_________________________");

        System.out.println("Exersice2");
        int clientOS = 1;
        short clientDeviceYear = 2013;
        determineAppVersion(clientOS, clientDeviceYear);
        System.out.println("_________________________");

        System.out.println("Exersice3");
        short deliveryDistance = 100;
        byte days = daysDelivery(deliveryDistance);
        if(days > 0){
          System.out.printf("Потребуется дней: %s день доставки%n", days);
        }else{
          System.out.println("Доставка не осуществляется");
        }
        System.out.println("_________________________");
    }

    static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    static void determineAppVersion(int clientOS, short clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Не правильно выбрана платформа или год выпуска телефона");
        }
    }

    static byte daysDelivery(short deliveryDistance) {
        byte days = 1;
        if (deliveryDistance < 20) {
            return days;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days += 1;
            return days;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days += 2;
            return days;
        } else {
            return 0;
        }
    }

}
