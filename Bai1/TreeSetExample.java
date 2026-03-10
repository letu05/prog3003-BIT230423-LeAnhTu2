/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap02.Bai1;

/**
 *
 * @author tu650
 */
import java.util.TreeSet;
public class TreeSetExample {
    public static void main (String [] args){
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        System.out.println("Danh sach in ra " +names);
        System.out.println("phan tu dau tien "+names.first());
        System.out.println("Phan tu cuoi cung "+names.last());
    }
}
