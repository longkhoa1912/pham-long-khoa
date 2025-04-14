/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner;
public class dientichhinhchunhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu cao:");
        float chieudai = scanner.nextFloat();
        System.out.println("nhap chieu rong:");
        float chieurong = scanner.nextFloat();
        float dientich = chieudai * chieurong;
        System.out.print("dien tich hinh chu nhat = "+dientich);
    }
}
