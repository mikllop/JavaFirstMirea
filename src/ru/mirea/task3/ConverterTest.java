package ru.mirea.task3;

public class ConverterTest {
    public static void main(String[] args) {
        Converter con = new Converter(1000);
        System.out.println(con.getCurrencyUSD());
        System.out.println(con.getCurrencyEUR());
    }
}
