/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;
import java.util.Scanner;
public class tamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap canh a:");
        float a = scanner.nextFloat();
       System.out.print("nhap canh b:");
       float b = scanner.nextFloat();
       System.out.print("nhap canh c:");
       float c = scanner.nextFloat();
       if(a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)){
           System.out.println("tam giac hop le");
       }else { 
           System.out.println("tam giac khong hop le");}
    }
    
}
