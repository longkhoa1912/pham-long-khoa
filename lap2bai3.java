/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;
import java.util.Scanner;
class sinhvien {
    private int masinhvien;
    private String hoten;
    private float diemlt;
    private float diemth;
    public sinhvien() {
        this.masinhvien = 0;
        this.hoten = "";
        this.diemlt = 0;
        this.diemth = 0;
    }
    public sinhvien(int masinhvien, String hoten, float diemlt, float diemth) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.diemlt = diemlt;
        this.diemth = diemth;
    }
    public int getmasinhvien() {
        return masinhvien;
    }
    public void setmasinhvien(int masinhvien) {
        this.masinhvien = masinhvien;
    }
    public String gethoten() {
        return hoten;
    }
    public void sethoten(String hoten) {
        this.hoten = hoten;
    }
    public float getdiemlt() {
        return diemlt;
    }
    public void setdiemlt(float diemlt) {
        this.diemlt = diemlt;
    }
    public float getdiemth() {
        return diemth;
    }
    public void setdiemth(float diemth) {
        this.diemth = diemth;
    }
    public float tinhdiemtrungbinh() {
        return (diemth + diemth) / 2;
    }
    @Override
    public String toString() {
        return String.format("%-10d %-20s %10.2f %10.2f %10.2f",
                masinhvien, hoten, diemlt, diemth, tinhdiemtrungbinh());
    }

 
    }
public class lap2bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhvien sv1 = new sinhvien(1250080012, "nguyen kim khanh", 6.5f, 8.5f);
        sinhvien sv2 = new sinhvien(1250080083, "nhat linh", 7.5f, 8.0f);
        sinhvien sv3 = new sinhvien();
        System.out.print("nhap ma so cua sv3: ");
        sv3.setmasinhvien(sc.nextInt());
        sc.nextLine();
        System.out.print("nhap ho va ten cua sv3: ");
        sv3.sethoten(sc.nextLine());
        System.out.print("nhap diem ly thuyet cua sv3: ");
        sv3.setdiemlt(sc.nextFloat());
        System.out.print("nhap diem thuc hanh cua sv3: ");
        sv3.setdiemth(sc.nextFloat());
        System.out.println();
        System.out.printf("%-10s %-20s %10s %10s %10s", "masv", "hoten", "diemlt", "diemth", "diemtb");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}


