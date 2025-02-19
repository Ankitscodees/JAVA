abstract class Payment {
    abstract void makePayment(double amount);

    void transactionSuccessful() {
        System.out.println("✅ Payment completed successfully!");
    }
}

class CreditCard extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("💳 Paying ₹" + amount + " using Credit Card...");
        transactionSuccessful();
    }
}

class PayPal extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("📲 Paying ₹" + amount + " using PayPal...");
        transactionSuccessful();
    }
}

class UPI extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("💰 Paying ₹" + amount + " using UPI...");
        transactionSuccessful();
    }
}

public class AbstractPayment {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        Payment payment2 = new PayPal();
        Payment payment3 = new UPI();

        payment1.makePayment(500.00);
        payment2.makePayment(1200.75);
        payment3.makePayment(250.50);
    }
}
