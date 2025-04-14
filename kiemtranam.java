/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner; 
public class kiemtranam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("nhap nam:");
        int nam = scanner.nextInt();
        if (nam % 4 == 0) {
            if (nam % 100 != 0 || nam % 400 == 0) {
                System.out.println(nam + " la nam nhuan");
            } else {
                System.out.println(nam + " khong la nam nhuan");
            }
        } else {
            System.out.println(nam + " khong phai la nam nhuan");
        }
    }
}


