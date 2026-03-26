/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author tu650
 */
public class Bai1 {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Python", "C++", "C#"};

        System.out.print("Mang so nguyen: ");
        printArray(intArray);

        System.out.print("Mang chuoi: ");
        printArray(stringArray);
    }
}
