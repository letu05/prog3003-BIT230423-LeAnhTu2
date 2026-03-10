/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap02.Bai3;

/**
 *
 * @author tu650
 */
import java.util.concurrent.CompletableFuture;
public class MovieTicketSystem {
    public static void main(String[] args) throws Exception{
        CompletableFuture<String> authTask = CompletableFuture.supplyAsync(() -> {
            simulateDelay(2000); 
            System.out.println("-> [he thong] xac thuc danh tinh khach hang.");
            return "Khach hang VIP 1";
        });
        CompletableFuture<String> ticketTask = CompletableFuture.supplyAsync(() ->{
            simulateDelay(3000);
            System.out.println("-> [HE thong ] xac thuc ve xem phim");
            return "ve ngoi 9999";
        });
        CompletableFuture<String> finalResult = authTask.thenCombine(ticketTask, (user, ticket) -> {
            return "Xac nhan: " + user + " da dat thanh cong " + ticket;
        });
        System.out.println("--- Xu ly dat ve vui long doi ---");
        System.out.println("ket qua cuoi cung " + finalResult.get());
    }

    private static void simulateDelay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
