package ru.netology.stats;
public class StatsService {
    public int minSales(long[] sales) {  //Месяц с минимальными продажами
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) { // Месяц с максимальными продажами
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public long sumAllSales(long[] sales) { // Общая сумма продаж
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }
     public long averageSales(long[] sales) { // Средние продажи за 12 месяцев
             long averageSales = sumAllSales(sales) /sales.length;
             return averageSales;
        }

    public long aboveAverageSale(long[] sales) { // Кол-во Месяцев с продажами выше среднего
       long aboveAverage = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }
    public  long belowAverageSale(long[]sales){ // Кол-во месяцев с продажами ниже среднего
        long belowAverage = 0;
        for (long sale : sales ) {
           if ( sale > averageSales(sales)){
            belowAverage += 1;
            }
        }
        return belowAverage ;
    }
}
