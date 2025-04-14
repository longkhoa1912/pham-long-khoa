/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner;
public class chusotinhtoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int so = Math.abs(scanner.nextInt()); // Xử lý số âm
        int tong = 0, tich = 1;
        while (so > 0) {
            int chuSo = so % 10; 
            tong += chuSo;  
            tich *= chuSo; 
            so /= 10; 
        }
        System.out.println("tong cac so: " + tong);
        System.out.println("tich cac so: " + tich);
    }
}
