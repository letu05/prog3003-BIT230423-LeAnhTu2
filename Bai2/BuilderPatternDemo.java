/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap02.Bai2;

/**
 *
 * @author tu650
 */
public class BuilderPatternDemo {
    public static void main (){
        Computer myPC = new Computer.ComputerBuilder("512GB", "16GB", "RTX 3060")
                            .setBluetoothEnable(true)
                            .build();
                            
        System.out.println(myPC);
    }   
}
