import java.text.MessageFormat;
import java.util.stream.Stream;

public class HomeWork16_Mobile {
    /**
     * Задание 1: Мобильное Устройство
     * Объект Реализации: Смартфон
     * Поля:
     * модель: Модель устройства.
     * операционнаяСистема: Операционная система устройства.
     * зарядБатареи: Процент заряда батареи.
     * списокПриложений: Установленные приложения.
     * Методы:
     * установитьПриложение(приложение): Добавляет приложение в список установленных.
     * удалитьПриложение(приложение): Удаляет приложение из списка.
     * показатьЗарядБатареи(): Отображает текущий заряд батареи.
     * обновитьОС(версия): Обновляет операционную систему до указанной версии.
     */
    private String deviceModel;
    private String operatingSystemOfTheDevice;
    public int batteryCharge;
    public int maxCharge;
    private String installedApplications;

    public HomeWork16_Mobile(String deviceModel, String operatingSystemOfTheDevice, String installedApplications, String batteryCharge, String maxCharge) {
        this.deviceModel = deviceModel;
        this.operatingSystemOfTheDevice = operatingSystemOfTheDevice;
        this.installedApplications = "";
        this.batteryCharge = 50;
        this.maxCharge = 100;
    }

    // Метод  заряда батареи
    public void chargeBattery(int charge) {
        batteryCharge += charge;
            if (batteryCharge > maxCharge) {
                batteryCharge = maxCharge;
            }

    }

    public void lowBattery(int charge) {
            batteryCharge -= charge;
            if (batteryCharge < 0) {
                batteryCharge = 0;
            }
    }

    public void installed(String program) {
        for (int i = 0; i < program.length(); i++) {
            installedApplications = program;
       }
    }


    public void version(String ver) {
        operatingSystemOfTheDevice = ver;

    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public int getMaxCharge() {
        return maxCharge;
    }

    public void setMaxCharge(int maxCharge) {
        this.maxCharge = maxCharge;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getOperatingSystemOfTheDevice() {
        return operatingSystemOfTheDevice;
    }

    public void setOperatingSystemOfTheDevice(String operatingSystemOfTheDevice) {
        this.operatingSystemOfTheDevice = operatingSystemOfTheDevice;
    }

    public String getInstalledApplications() {
        return installedApplications;
    }

    public void setInstalledApplications(String installedApplications) {
        this.installedApplications = installedApplications;
    }

    public void showInfo() {
        System.out.println("Марка телефона " + deviceModel + ", операционная система: " + operatingSystemOfTheDevice + ", текущий заряд батереи: " + batteryCharge +
                " установленные приложения: " + installedApplications);
    }
}
