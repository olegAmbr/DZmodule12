public class DaysToServise extends Thread {
    int dts;

    public DaysToServise() {
        this.dts = dts;
    }

    @Override
    public void run() {
        for (dts = 0; dts <= 365; dts++) {
            System.out.println("Машина в эксплуатации " + dts + " дней.");
            if (dts >= 350) {
                System.out.println("До ТО - " + (365 - dts) + " дней.");
            }
            if (dts == 365) {
                System.out.println("Необходимо пройти ТО(1 год)");
            }
        }
    }

}
