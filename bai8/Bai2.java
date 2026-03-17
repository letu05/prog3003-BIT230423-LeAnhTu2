/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author tu650
 */

interface Payment {
    void processPayment(double amount);
}


class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " qua Credit Card.");
    }
}

class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " qua PayPal.");
    }
}

class CashPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " bằng tiền mặt.");
    }
}
class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        if (type == null) return null;
        return switch (type.toLowerCase()) {
            case "credit" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            case "cash" -> new CashPayment();
            default -> throw new IllegalArgumentException("Phương thức không hợp lệ");
        };
    }
}
public class Bai2 {
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPaymentMethod("paypal");
        p1.processPayment(150.0);

        Payment p2 = PaymentFactory.getPaymentMethod("credit");
        p2.processPayment(500.0);
    }
}
