import java.util.Locale;
import java.util.Scanner;
import util.Bill;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        double feeding = bill.feeding(); 
        double ticket = bill.ticket();
        double total = bill.total();

        System.out.println();

        System.out.println("RELATÓRIO: ");
        System.out.printf("Consumo = R$ %.2f%n", feeding);
        System.out.println(bill);
        System.out.printf("Ingresso = R$ %.2f%n", ticket);

        System.out.println();

        System.out.printf("Total = R$ %.2f%n", total);

        sc.close();
    }
}
