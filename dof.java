/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;
import java.util.Scanner;
public class dof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap dof:");
        float dof = scanner.nextFloat();
        float doc = (float) ((dof - 32) / 1.8);
        System.out.println("dof chuyen sang doc = " + doc);
    }
}
