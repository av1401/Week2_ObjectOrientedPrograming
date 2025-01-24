// Base class: Order
class Order {
    // Attributes of the Order class
    String orderId;
    String orderDate;

    // Constructor for the Order class
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return the order status
    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    // Method to display order details
    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    // Additional attribute for ShippedOrder
    String trackingNumber;

    // Constructor for the ShippedOrder class
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call the base class constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus to include shipping status
    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }

    // Overriding displayDetails to include tracking number
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the base class displayDetails method
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    // Additional attribute for DeliveredOrder
    String deliveryDate;

    // Constructor for the DeliveredOrder class
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call the ShippedOrder constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus to include delivery status
    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    // Overriding displayDetails to include delivery date
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the ShippedOrder displayDetails method
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class to test the system
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create objects for each class
        Order order = new Order("O001", "2025-01-01");
        ShippedOrder shippedOrder = new ShippedOrder("O002", "2025-01-02", "TRACK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O003", "2025-01-03", "TRACK67890", "2025-01-06");

        // Display details and status for each object
        System.out.println("Order Details:");
        order.displayDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();

        System.out.println("Shipped Order Details:");
        shippedOrder.displayDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println();

        System.out.println("Delivered Order Details:");
        deliveredOrder.displayDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
