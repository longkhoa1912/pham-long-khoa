/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner;
public class sonhonhat {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print ("nhap so thu nhat");
    int sothunhat = scanner.nextInt();
    System.out.print ("nhap so thu hai");
    int sothuhai = scanner.nextInt();
    System.out.print ("nhap so thu ba");
    int sothuba = scanner.nextInt();
   int giatrinhonhat = sothunhat;
   if(sothuhai < giatrinhonhat) {
       giatrinhonhat = sothuhai;
   }
   if(sothuba < giatrinhonhat) {
       giatrinhonhat = sothuba;
   }
   System.out.print("gia tri nho nhat la" + giatrinhonhat);
}
}