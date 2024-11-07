import java.util.Scanner;

public class IT24610812Lab3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble(); // e.g., 100
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble(); // e.g., 4

        double totalAmount = pricePerKg * quantity;
        
        // Output total amount
        System.out.println("The total amount to pay is: " + totalAmount);
        
        // Close the scanner
        scanner.close();
    }
}

  
