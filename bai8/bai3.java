/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author tu650
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
public class bai3 {
    static CompletableFuture<String> authenticate(String user) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1);
            System.out.println("1. Xác thực người dùng: " + user);
            return user;
        });
    }

    static CompletableFuture<Double> checkBalance(String user) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(2);
            double balance = 1000.0; 
            System.out.println("2. Kiểm tra số dư cho: " + user + " ($" + balance + ")");
            return balance;
        });
    }

    static CompletableFuture<String> transfer(double amount) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1);
            System.out.println("3. Thực hiện chuyển khoản: $" + amount);
            return "Thành công";
        });
    }

    private static void simulateDelay(int seconds) {
        try { TimeUnit.SECONDS.sleep(seconds); } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        System.out.println("Bắt đầu giao dịch...");

        authenticate("Nguyen Van A")
            .thenCompose(user -> checkBalance(user))
            .thenCompose(balance -> {
                if (balance < 500) {
                    throw new RuntimeException("Số dư không đủ!");
                }
                return transfer(500);
            })
            .thenAccept(result -> System.out.println("Kết quả: " + result))
            .exceptionally(ex -> {
                System.err.println("Giao dịch thất bại: " + ex.getMessage());
                return null;
            })
            .join(); 

        System.out.println("Kết thúc chương trình.");
    }
}
