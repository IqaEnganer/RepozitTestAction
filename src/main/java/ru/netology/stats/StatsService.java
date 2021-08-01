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
        long sum = 0;
        long average;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        average = sum / sales.length;
        return average;

    }

    public long aboveAverageSale(long[] sales) { // Месяцы с продажами выше среднего
        long sum = 0;
        long average;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        average = sum / sales.length;


        return average;


    }
}
