package src;

public class Main {
    public static void main(String[] args) {

        SalesManager prices = new SalesManager(new int[]{30, 5, 2, 14, 8});




        System.out.println("Hello GITHUB\nСамая жирная продажа - " + prices.max());
        System.out.println("Обрезанное среднее количество продаж - " + prices.croppedMiddl() + "\nМинимальная продажа - " + prices.min());

    }
}