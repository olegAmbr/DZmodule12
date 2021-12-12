public class Car extends Thread {
    String model, color;
    int kmPerDay, odometer = 0;

    public Car(String model, String color, int kmPerDay) {
        this.model = model;
        this.color = color;
        this.kmPerDay = kmPerDay;
    }

    @Override
    public void run() {
        for (odometer = 0; odometer <= 10000; odometer += kmPerDay) {
            System.out.println("Машина в эксплуатации, пробег - " + odometer);
            if (odometer >= 9500) {
                System.out.println("Пробег - " + odometer + " Пора пройти ТО по пробегу");
            }
        }
    }
}
