public class Mobile {
    public static void main(String[] args) {

        HomeWork16_Mobile Apple = new HomeWork16_Mobile("Apple 13 pro", "bionic 17", "", "80", "100");

        HomeWork16_Mobile Samsung = new HomeWork16_Mobile("Samsung S30", "Android 18", "", "80", "100");

        HomeWork16_Mobile Motorola = new HomeWork16_Mobile("Motorola Y15", "Android 15", "", "80", "100");

        System.out.println("\nпытаемся увеличить заряд батереи");
        Apple.chargeBattery(150);
        Apple.showInfo();


        System.out.println("\nпытаемся уменьшить заряд батереи");
        Apple.lowBattery(25);
        Samsung.lowBattery(10);
        Motorola.lowBattery(15);
        Apple.showInfo();
        Samsung.showInfo();
        Motorola.showInfo();

        System.out.println("\n Установили програмы");
        Apple.installed("Instagram," + " Googl"  + " ");
        Samsung.installed("Fb," + " ");
        Motorola.installed("Googl," + " Zoom");
        Apple.showInfo();
        Samsung.showInfo();
        Motorola.showInfo();


        System.out.println("\n Обновили версию ПО");
        Apple.version("bionic 18");
        Samsung.version("Android 19");
        Motorola.version("Android 19");
        Apple.showInfo();
        Samsung.showInfo();
        Motorola.showInfo();


    }
}
