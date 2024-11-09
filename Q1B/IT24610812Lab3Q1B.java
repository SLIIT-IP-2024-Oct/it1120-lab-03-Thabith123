import java.util.Scanner;

public class IT24610812Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        double totalAmount = quantity * pricePerKg;

        double discountAmount = totalAmount * 0.1;

        double payableTotalAmount = totalAmount - discountAmount;

        System.out.println("Pay total amount: " + payableTotalAmount);

        scanner.close();
    }
}
