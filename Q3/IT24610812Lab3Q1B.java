import java.util.Scanner;

public class IT24610812Lab3Q1B{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter the perice 1kg of rice: ");
    double priceperkg = scanner.nextDouble();

    System.out.print("enter the quantity: ");
    int quantity= scanner.nextInt();

    double totalAmount= quantity* priceperkg;
    double discountAmount = totalAmount*0.1;

    double paytotalAmount = totalAmount-discountAmount;
    System.out.print("pay total Amount: " + paytotalAmount );

    scanner.close();

    }
}