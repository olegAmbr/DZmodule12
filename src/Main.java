public class Main {
    public static void main(String[] args) {
        Car car = new Car("vesta", "blue", 300);
        //car.sell();
        car.start();
        new DaysToServise().start();
    }
}
