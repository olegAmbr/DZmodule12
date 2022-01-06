public class Main {
    public static void main(String[] args) {
        Car car = new Car("vesta", "blue", 300);
        Car car1 = new Car("granta", "white", 250);
        car.start();
        car1.start();
        new DaysToServise().start();
    }
}
