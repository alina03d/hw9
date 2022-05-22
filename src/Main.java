import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2000;
        printLeapYear(year);

        int clientOS = 0;
        int clientDeviceYear = 2016;
        suggestVersion(clientOS, clientDeviceYear);

        int  deliveryDistance = 95;
        int countDeliveryDays = countDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + countDeliveryDays);
    }

    private static int countDeliveryDays(int deliveryDistance){
        int  deliveryDays = 4;
        if (deliveryDistance<=20){
            deliveryDays = 1;
        }
        if(deliveryDistance > 20 && deliveryDistance<= 60){
            deliveryDays = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance<=100){
            deliveryDays = 3;
        }
        return deliveryDays;
    }
    private static void suggestVersion(int clientOS, int clientDeviceYear){

        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear>currentYear){
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if(clientOS == 1) {
            System.out.print("Android");
        } else {
            System.out.println("IOS");
        }
    }


    private static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printLeapYear(int year){
        boolean isLeapYear = isLeapYear(year);
        if(isLeapYear){
            System.out.println("Год " + year + " - високосный");
        }else {
            System.out.println("Год " + year + " - не високосный");
        }
    }



}