public class Main {
    public static void printDistance( int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет"); //Слишком просто, возможно не верное поняла условие задачи
        }
    }
    public static void main(String[] args) {
        printDistance(15);
    }
}