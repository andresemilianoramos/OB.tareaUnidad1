import java.sql.SQLOutput;

public class MainSmartDevices {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice("rojo","apple", "macOS",2012,"macBook Pro","portatil");
        SmartDevice smartDevice1 = new SmartPhone("aluminio");
        SmartDevice smartDevice2 = new SmartWatch("cuero");

        smartDevice1.color= "green";
        smartDevice2.sistemaOperativo="IOS";

        System.out.println(smartDevice);
        System.out.println(smartDevice1);
        System.out.println(smartDevice2);
        System.out.println("\nFin");
    }

}
