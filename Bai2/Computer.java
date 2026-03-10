/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap02.Bai2;

/**
 *
 * @author tu650
 */


public class Computer {
    // Các thuộc tính của Computer
    private String ram;
    private String hdd;
    private boolean bluetooth;
    private String gpu;

    
    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.bluetooth = builder.bluetooth;
        this.gpu = builder.gpu;
    }

    @Override
    public String toString() {
        return "Computer [RAM=" + ram + ", HDD=" + hdd + ", Bluetooth=" + bluetooth + ", GPU=" + gpu + "]";
    }

    
    public static class ComputerBuilder {
        private String ram;
        private String hdd;
        private boolean bluetooth;
        private String gpu;

        
        public ComputerBuilder(String hdd, String ram, String gpu) {
            this.hdd = hdd;
            this.ram = ram;
            this.gpu = gpu;
        }

       
        public ComputerBuilder setBluetoothEnable(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this; 
        }

        
        public Computer build() {
            return new Computer(this);
        }
    }
}
