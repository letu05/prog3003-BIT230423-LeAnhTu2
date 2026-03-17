/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author tu650
 */
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    
    @Override
    public String toString() {
        return "MSSV: " + id + " | Tên: " + name + " | GPA: " + gpa;
    }
}
public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm theo tên");
            System.out.println("4. Xóa theo MSSV");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập MSSV: "); String id = sc.nextLine();
                    System.out.print("Nhập Tên: "); String name = sc.nextLine();
                    System.out.print("Nhập GPA: "); double gpa = sc.nextDouble();
                    list.add(new Student(id, name, gpa));
                    break;
                case 2:
                    if (list.isEmpty()) System.out.println("Danh sách trống.");
                    else list.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = sc.nextLine();
                    list.stream()
                        .filter(s -> s.getName().equalsIgnoreCase(searchName))
                        .forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Nhập MSSV cần xóa: ");
                    String removeId = sc.nextLine();
                    list.removeIf(s -> s.getId().equals(removeId));
                    System.out.println("Đã thực hiện xóa.");
                    break;
                case 0: return;
            }
        }
    }
}
