import java.util.Scanner;

public class IT24104159Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	
	

	
 
	System.out.print("Enter the price of 1kg of rice: ");
        double priceOf1kg = scanner.nextInt();

	System.out.print("Enter the number of kilograms you want to buy: ");
	double quantity = scanner.nextDouble();
	
	double totalcost = priceOf1kg * quantity;
 
	System.out.println("The total amount is: " + totalcost);

	}

}