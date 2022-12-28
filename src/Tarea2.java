import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el precio del prodcuto: ");

        double precioInicial = scanner.nextDouble();
        double IVA = 1.21;


        double precioConIVA = precioInicial * IVA;

        System.out.println("el precio con IVA es: "+ precioConIVA +" -€");
    }
}
