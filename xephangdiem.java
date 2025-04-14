/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner;
public class xephangdiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem mon ly");
        float diemly = scanner.nextFloat();
        System.out.println("nhap diem mon ly");
        float diemhoa = scanner.nextFloat();
        System.out.println("nhap diem mon hoa");
        float diemsinh = scanner.nextFloat();
        System.out.println("nhap diem mon sinh");
        float diemtoan = scanner.nextFloat();
        System.out.println("nhap diem mon toan");
        float diemmaytinh = scanner.nextFloat();
        System.out.println("nhap diem mon may tinh");
        float tongdiem = diemly + diemhoa + diemsinh + diemtoan + diemmaytinh;
        float tylephantram = (tongdiem / 500) * 100;
        String hang;
        if (tylephantram > 90){
            hang = "Hạng A";
        }else if (tylephantram > 80){
            hang = "Hạng B";
        }else if (tylephantram > 70){
            hang = "Hạng C";
    }else if (tylephantram > 60){
            hang = "Hạng D"; 
    }else if (tylephantram > 40){
            hang = "Hạng E";
    }else{ 
        hang = "Hạng F";
    }
        System.out.println ("ty le phan tram"+tylephantram);
        System.out.println ("hang"+hang);
    }
}