package ru.netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void salesMinimumMonth() { //Месяц с минимальными продажами
        assertEquals(9,service.minSales(arr));
    }
    @Test
    public void salesMaximumMonth(){ // Месяц с максимальными продажами
        int actual = service.maxSales(arr);
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void averageSales (){ // Средние продажи за 12 месяцев
       long actual = service.averageSales(arr);
       long expected = 15;
       assertEquals(expected , actual);
   }
    @Test
    public void sumAllSales(){ // Общая сумма продаж
        long actual = service.sumAllSales(arr);
        long expected = 180;
        assertEquals(expected, actual);
    }
    @Test
    public void aboveAverageSale(){
        long actual = service.aboveAverageSale(arr);
        long expected = 5;
        assertEquals(expected , actual);
    }
    @Test
    public void belowAverageSale(){
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.belowAverageSale(arr);
        long expected = 5;
        assertEquals(expected , actual);
    }
}

