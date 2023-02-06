import src.SalesManager;

public class Main {
    public static void main(String[] args) {
        int[] sales = new int[10];
        for (int i = 0; i < 10; i++) {
            sales[i] = getRandom();
            System.out.printf("Всего продаж в день № %s: " + sales[i] + "\n", i + 1);
        }
        SalesManager salesMan = new SalesManager(sales);
        System.out.println("Максимальное количество продаж в день: " + salesMan.max());
        System.out.println("Минимальное количество продаж в день: " + salesMan.min());
        System.out.println("Среднее обрезанное: " + salesMan.average());
    }

    public static int getRandom() {
        return (int) (Math.random() * 10 + 1);
    }
}
