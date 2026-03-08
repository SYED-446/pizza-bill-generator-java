import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter Customer Name: ");
            String name = sc.nextLine();

            int orderId = new Random().nextInt(1000);

            Order order = new Order(orderId, name);

            while (true) {

                System.out.println("\n------ PIZZA MENU ------");
                System.out.println("1. Margherita - ₹200");
                System.out.println("2. Farmhouse - ₹250");
                System.out.println("3. Veg Extravaganza - ₹300");
                System.out.println("4. Generate Bill");
                System.out.println("5. Exit");

                System.out.print("Choose Option: ");

                int choice = sc.nextInt();

                if (choice >= 1 && choice <= 3) {

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    Pizza pizza = null;

                    if (choice == 1)
                        pizza = new Pizza("Margherita", 200);

                    if (choice == 2)
                        pizza = new Pizza("Farmhouse", 250);

                    if (choice == 3)
                        pizza = new Pizza("Veg Extravaganza", 300);

                    order.addItem(new OrderItem(pizza, qty));

                    System.out.println("Pizza Added to Order!");

                }

                else if (choice == 4) {

                    BillGenerator.generateBill(order);

                }

                else if (choice == 5) {

                    System.out.println("Thank you for visiting!");
                    break;

                }

                else {

                    System.out.println("Invalid Choice!");

                }

            }

        }

        catch (InputMismatchException e) {

            System.out.println("Invalid Input! Enter numbers only.");

        }

    }
}
