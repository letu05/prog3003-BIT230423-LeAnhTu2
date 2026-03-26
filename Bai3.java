/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author tu650
 */
import java.util.*;
import java.util.stream.Collectors;
class Employee{
    int id;
    String name;
    double salary;
    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
        
    }
}
public class Bai3 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Binh", 1200),
            new Employee(2, "An", 800),
            new Employee(3, "Dung", 1500),
            new Employee(4, "Cuong", 950)
        );

      
        List<String> result = employees.stream()
            .filter(e -> e.getSalary() > 1000)      
            .map(Employee::getName)                
            .sorted()                              
            .collect(Collectors.toList());        

        System.out.println("Danh sách nhân viên lương > 1000 (đã sắp xếp): " + result);
    }
}
