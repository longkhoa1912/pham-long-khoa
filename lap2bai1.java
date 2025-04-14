/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner;
import java.util.Arrays;
public class lap2bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu mang ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap cac phan tu mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("nhap cac so nguyen x can tim: ");
        int x = scanner.nextInt();
        boolean found = false;
        System.out.print("vi tri cua x trong mang: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong tim thay x trong mang");
        }
        System.out.println();
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("gia tri lon nhat trong mang la: " + max);
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la: " + min);
        System.out.print("vi tri phan tu co gia  tri lon nhat trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("mang tang dan ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   
}