class BillGenerator {

    public static void generateBill(Order order) {

        int subtotal = 0;

        System.out.println("\n========= PIZZA BILL =========");

        System.out.println("Order ID : " + order.getOrderId());
        System.out.println("Customer : " + order.getCustomerName());

        System.out.println("--------------------------------");

        for (OrderItem item : order.getItems()) {

            System.out.println(
                    item.getPizza().getName()
                            + " x " + item.getQuantity()
                            + " = ₹" + item.getTotalPrice()
            );

            subtotal += item.getTotalPrice();
        }

        double gst = subtotal * 0.05;

        double total = subtotal + gst;

        System.out.println("--------------------------------");
        System.out.println("Subtotal : ₹" + subtotal);
        System.out.println("GST (5%) : ₹" + gst);
        System.out.println("Total Bill : ₹" + total);
        System.out.println("================================");

    }
}
