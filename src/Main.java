import java.sql.SQLOutput;
import java.time.LocalDate;

 class Scratch {
     public static void main(String[] args) {
         int year = 2020;
         printInfoAboutYear(year);
         printInfoAboutVersion(0, 2022);
         int deliveryDistance = 76;
         int days = calculateDeliveryDays(deliveryDistance);
         if (days == -1) {
             System.out.println("Доставка невозможна на расстояние  " + deliveryDistance);
         } else {
             System.out.println("Время доставки  " + days + " дн.");
         }
     }
     private static int calculateDeliveryDays(int deliveryDistance) {
         if (deliveryDistance >= 0 && deliveryDistance <= 20) {
             return 1;
         } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
             return 2;
         } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
             return 3;
         } else {
             return -1;
         }
     }

     private static String getInfoAboutVersion ( int os,
            int productionYear) {

         int currentYear = LocalDate.now().getYear();
         StringBuilder result = new StringBuilder("Установите  ");
         if (productionYear < currentYear) {
             result.append("облегчённую версию для  ");
         } else {
             result.append("версию для  ");
         }
         if (os == 0) {
             result.append("ios.");
         } else {
             result.append("Android.");
         }
         return result.toString();
     }

     private static void printInfoAboutVersion( int os,
         int productionYear) {
         System.out.println (getInfoAboutVersion (os, productionYear));
     }

     private static void printInfoAboutYear(int year) {
         boolean leapYear = isLeapYear(year);
         if (leapYear) {
             printInfoAboutYear(year + " год является високосным.");
         } else {
             printInfoAboutYear(year + " год НЕ является високосным.");
         }
     }
     private static void printInfoAboutYear(String info){
         System.out.println(info);
     }

     private static boolean isLeapYear(int year) {
         return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
     }
 }




